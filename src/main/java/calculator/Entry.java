package calculator;

/**
 * Creates new entries with three constructors.
 * 
 * @author Rafal.
 *
 */
public class Entry {
  private float number;
  private Symbol other;
  private String str;
  private Type type;

  /**
   * Creates a entry instance with a number.
   * 
   * @param value initiates the object with a number.
   */
  public Entry(float value) {
    this.number = value;
    this.other = null;
    this.str = null;
    this.type = Type.NUMBER;
  }
  
  /**
   * Creates a entry instance with a string.
   * 
   * @param str initiates the object with a string.
   */
  public Entry(String str) {
    this.number = 0.0F;
    this.other = null;
    this.str = str;
    this.type = Type.STRING;
  }
  
  /**
   * Creates a entry instance with a symbol.
   * 
   * @param which initiates the object with a symbol.
   */
  public Entry(Symbol which) {
    this.number = 0.0F;
    this.other = which;
    this.str = null;
    this.type = Type.SYMBOL;
  }
  
  /**
   * Getter method for returning instance's type.
   * 
   * @return Returns the type of the instance.
   */
  public Type getType() {
    return this.type;
  }

  /**
   * Getter method for returning instance's string.
   * 
   * @return Returns the string of the instance.
   * @throws BadTypeException exception is thrown when other type is entered instead when 
   *        constructed.
   */
  public String getStr() throws BadTypeException {
    if (this.type != Type.STRING) {
      throw new BadTypeException("Asked for string: received a " + this.type);
    }
    return this.str;
  }
  
  /**
   * Getter method for returning instance's symbol.
   * 
   * @return Returns the symbol of the instance.
   * @throws BadTypeException exception is thrown when other type is entered instead when 
   *        constructed.
   */
  public Symbol getOther() throws BadTypeException {
    if (this.type != Type.SYMBOL) {
      throw new BadTypeException("Asked for symbol: received a " + this.type);
    }
    return this.other;
  }
  
  /**
   * Getter method for returning instance's value.
   * 
   * @return Returns the value of the instance.
   * @throws BadTypeException exception is thrown when other type is entered instead when 
   *        constructed.
   */
  public float getValue() throws BadTypeException {
    if (this.type != Type.NUMBER) {
      throw new BadTypeException("Asked for float: received a " + this.type);
    }
    return this.number;
  }

  /**
   * Checks if two entries are equal to each other.
   * 
   * @param entry is the entry that is being checked.
   * @return Returns true if entries are equal and false otherwise.
   * @throws BadTypeException exception is thrown when the incorrect data type have been used.
   */
  public boolean equals(Entry entry) throws BadTypeException {
    return (((this.type == entry.getType()) && ((this.number == entry.getValue()) 
                                            || (this.str.equals(entry.getStr())))));
  }
  
  /**
   * Creates a hash code for an entry instance.
   * 
   * @return Returns the created hash code.
   */
  @Override
  public int hashCode() {
    // Hashes entries with floats.
    if (this.number != 0.0F) {
      return (int) this.number + this.type.hashCode();
      
    // Hashes entries with symbols.
    } else if (this.other != null) {
      return (int) this.other.hashCode() + this.type.hashCode();
      
    // Hashes entries with strings.
    } else if (this.str != null) {
      return (int) this.str.hashCode() + this.type.hashCode();
      
    } else {
      return 0;
    }
  }
}
