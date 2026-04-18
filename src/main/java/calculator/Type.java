package calculator;

/**
 * Different types that are used by the Entry class.
 * 
 * @author Rafal.
 */
public enum Type {
  NUMBER("NUMBER", 0),
  SYMBOL("SYMBOL", 1),
  STRING("STRING", 2),
  INVALID("INVALID", 3);
  
  private final String name;
  private final int id;
  
  Type(String name, int id) {
    this.name = name;
    this.id = id;
  }
  
  /**
   * Provide the value of the type.
   * 
   * @return Returns the value of the corresponding type.
   */
  @Override
  public String toString() {
    return this.id + ": " + this.name;
  }
}
