package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestStandardCalc {
  private StandardCalc calc;

  @BeforeEach
  void setUp() {
    calc = new StandardCalc();
  }

  //Test Number 1.
  @Test
  void testCalcEvaluation() throws InvalidExpressionException {
    float returned = calc.evaluate("0");
    assertEquals(0, returned,
        "Tests if the evaluate() returns 0.");
  }
}
