package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestRevPolishCalc {
  private static RevPolishCalc calc = new RevPolishCalc();
  
  // Test Number 1.
  @Test
  void testCalcEvaluation() throws 
      InvalidExpressionException, BadTypeException, EmptyStackException {
    float returned = calc.evaluate("0");
    assertEquals(0, returned,
        "Tests if the evaluate() returns 0.");
  }
  
  // Test Number 2.
  @Test
  void testCalcAdd() throws BadTypeException, EmptyStackException {
    float returned = calc.evaluate("22+");
    assertEquals(4F, returned,
        "Tests if the add functionality works and if it returns 4.");  
  }
  
  //Test Number 3.
  @Test
  void testCalcMinus() throws BadTypeException, EmptyStackException {
    float returned = calc.evaluate("52-");
    assertEquals(3F, returned,
        "Tests if the minus functionality works and if it returns 3.");  
  }
  
  //Test Number 4.
  @Test
  void testCalcTimes() throws BadTypeException, EmptyStackException {
    float returned = calc.evaluate("23*");
    assertEquals(6F, returned,
        "Tests if the times functionality works and if it returns 6.");  
  }
  
  //Test Number 5.
  @Test
  void testCalcDivide() throws BadTypeException, EmptyStackException {
    float returned = calc.evaluate("42/");
    assertEquals(2F, returned,
        "Tests if the divide functionality works and if it returns 2.");  
  }
}
