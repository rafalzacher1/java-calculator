package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestOpStack {
  private static OpStack opStack;
	
  @BeforeEach
  void createOpStack() {
    opStack = new OpStack();
  }
  
  // Test Number 1.
  @Test
  void testPush() {
    opStack.push(Symbol.DIVIDE);
    assertEquals(false, opStack.isEmpty(), 
        "Tests if the overwritten push method works and inserts the left bracket.");
  }
  
  // Test Number 2.
  @Test
  void testPop() throws EmptyStackException, BadTypeException {
    opStack.push(Symbol.PLUS);
    Symbol returned = opStack.pop();
    assertEquals(Symbol.PLUS, returned, 
        "Tests if pop() removes entry and returns the plus sign.");
  }
  
  // Test Number 3.
  @Test
  void testIsEmpty() {
    assertEquals(true, opStack.isEmpty(), 
        "Tests if the isEmpty() returs false.");
  }
}
