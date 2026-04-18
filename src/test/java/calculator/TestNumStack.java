package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestNumStack {
  private static NumStack numStack;
  
  @BeforeEach
  void createNumStack() {
    numStack = new NumStack();
  }
  
  // Test Number 1.
  @Test
  void testPush() {
    numStack.push(2.0F);
    assertEquals(false, numStack.isEmpty(), 
        "Tests if the overwritten push method works and inserts 2.0.");
  }
  
  // Test Number 2.
  @Test
  void testPop() throws EmptyStackException, BadTypeException {
    numStack.push(25F);
    float returned = numStack.pop();
    assertEquals(25F, returned, 
        "Tests if pop() removes entry and returns the value of 25.0.");
  }
  
  // Test Number 3.
  @Test
  void testIsEmpty() {
    assertEquals(true, numStack.isEmpty(), 
        "Tests if the isEmpty() returs false.");
  }
}
