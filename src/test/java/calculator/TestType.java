package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestType {
 
  // Test Number 1.
  @Test
  void testNumber() {
    assertEquals("0: NUMBER", Type.NUMBER.toString(),
        "Tests if correct id and name of NUMBER is rturned.");
    
    assertEquals("1: SYMBOL", Type.SYMBOL.toString(),
        "Tests if correct id and name of SYMBOL is rturned.");
    
    assertEquals("2: STRING", Type.STRING.toString(),
        "Tests if correct id and name of STRING is rturned.");
    
    assertEquals("3: INVALID", Type.INVALID.toString(),
        "Tests if correct id and name of INVALID is rturned.");
  }
}