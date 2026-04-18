package calculator;

/**
 * Creates a standard calculator.
 * 
 * @author Rafal.
 *
 */
public class StandardCalc implements InterfaceCalculator {
  private OpStack values;
  private RevPolishCalc rpCalc;
  
  StandardCalc() {
    this.values = new OpStack();
    this.rpCalc = new RevPolishCalc();
  }

  @Override
  public float evaluate(String what) {
    return 0;
  }
}
