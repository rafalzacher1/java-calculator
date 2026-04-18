package calculator;

/**
 * Creates new exception for when bad types are used in entries.
 * 
 * @author Rafal.
 *
 */
public class BadTypeException extends Exception {
  public BadTypeException(String message) {
    super(message);
  }
}
