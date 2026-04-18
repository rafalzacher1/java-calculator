package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestSymbol {
  
  // Test Number 1.
  @Test
  void testLeftBracket() {
    assertEquals("0: LEFT_BRACKET (", Symbol.LEFT_BRACKET.toString(), 
        "Tests if correct id, name and value of LEFT_BRACKET is returned.");
    assertEquals("1: RIGHT_BRACKET )", Symbol.RIGHT_BRACKET.toString(), 
        "Tests if correct id, name and value of LEFT_BRACKET is returned.");
    assertEquals("2: TIMES *", Symbol.TIMES.toString(), 
        "Tests if correct id, name and value of LEFT_BRACKET is returned.");
    assertEquals("3: DIVIDE /", Symbol.DIVIDE.toString(), 
        "Tests if correct id, name and value of LEFT_BRACKET is returned.");
    assertEquals("4: PLUS +", Symbol.PLUS.toString(), 
        "Tests if correct id, name and value of LEFT_BRACKET is returned.");
    assertEquals("5: MINUS -", Symbol.MINUS.toString(), 
        "Tests if correct id, name and value of LEFT_BRACKET is returned.");
    assertEquals("6: INVALID INVALID", Symbol.INVALID.toString(), 
        "Tests if correct id, name and value of LEFT_BRACKET is returned.");
  }
}
