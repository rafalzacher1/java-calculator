package calculator;

/**
 * Creates new exception for when the incorrect expression is given.
 * 
 * @author Rafal.
 *
 */
public class InvalidExpressionException extends Exception {
  public InvalidExpressionException(String message) {
    super(message);
  }
}
