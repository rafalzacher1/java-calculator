package calculator;

/**
 * Different kinds of symbol that are used by the calculator.
 * 
 * @author Rafal.
 */
public enum Symbol {
  LEFT_BRACKET("LEFT_BRACKET", "(", 0), 
  RIGHT_BRACKET("RIGHT_BRACKET", ")", 1), 
  TIMES("TIMES", "*", 2), 
  DIVIDE("DIVIDE", "/", 3), 
  PLUS("PLUS", "+", 4), 
  MINUS("MINUS", "-", 5), 
  INVALID("INVALID", "INVALID", 6);
  
  private final String name;
  private final String value;
  private final int id;
  
  Symbol(final String name, String value, final int id) {
    this.name = name;
    this.value = value;
    this.id = id;
  }
  
  /**
   * Provide the value of the symbol.
   * 
   * @return Returns the value of the corresponding symbol.
   */
  @Override
  public String toString() {
    return this.id + ": " + this.name + " " + this.value;
  }
}
