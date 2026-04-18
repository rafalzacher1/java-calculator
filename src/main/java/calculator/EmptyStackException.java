package calculator;

/**
 * Creates new exception for empty stack.
 * 
 * @author Rafal.
 *
 */
public class EmptyStackException extends Exception {
  public EmptyStackException(String message) {
    super(message);
  }
}
