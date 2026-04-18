package calculator;

/**
 * Creates a the interface for reverse polish calculator and standard calculator.
 * @author Rafal.
 *
 */
public interface InterfaceCalculator {
  public float evaluate(String what) throws BadTypeException, EmptyStackException;
}
