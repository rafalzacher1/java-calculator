package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestStrStack {
  private static StrStack strStack;
  
  @BeforeEach
  void createNumStack() {
    strStack = new StrStack();
  }
  
  // Test Number 1.
  @Test
  void testPush() {
    strStack.push("*");
    assertEquals(false, strStack.isEmpty(), 
        "Tests if the overwritten push method works and inserts times.");
  }
  
  // Test Number 2.
  @Test
  void testPop() throws EmptyStackException, BadTypeException {
    strStack.push("(");
    String returned = strStack.pop();
    assertEquals("(", returned,
        "Tests if pop() removes entry and returns the value of INVALID.");
  }
  
  // Test Number 3.
  @Test
  void testIsEmpty() {
    assertEquals(true, strStack.isEmpty(), 
        "Tests if the isEmpty() returs false.");
  }
}