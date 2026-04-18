package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestStack {
  private static Stack stack;  
  
  // Creates an empty stack before each test is executed.
  @BeforeEach
  void createStack() {
    stack = new Stack();
  }  
  
  // Test Number 1.
  @Test
  void testSize() {
    assertEquals(0, stack.size(), "Tests if the size of the newly created stack is 0.");
  }
  
  //  // Test Number 2.
  //  @Test
  //  void testPush() {
  //    stack.push(9);
  //    assertEquals(1, stack.size(), 
  //        "Tests if the size of the stack increased when integer is added.");
  //  }
  //  
  //  // Test Number 3.
  //  @Test
  //  void testPop() {
  //    stack.push(6);
  //    stack.pop();
  //    assertEquals(0, stack.size(), 
  //        "Tests if the size of the stack decreases when integer is removed.");
  //  }
  //  
  //  // Test Number 4.
  //  @Test
  //  void testTop() {
  //    stack.push(1);
  //    stack.push(2);
  //    assertEquals(2, stack.top(), "Tests if the correct integer from the top is returned.");
  //  }
  //  
  //  // Test Number 5.
  //  @Test
  //  void testMultiPush() {
  //    stack.push(1);
  //    stack.push(2);
  //    assertEquals(2, stack.size(), "Tests if the size of the stack increased to size 2.");
  //  }
  
  // Test Number 6.
  @Test
  void testPopException() {
    assertThrows(EmptyStackException.class, () -> stack.pop(),
        "Tests if the EmptyStackException is thrown when pop() is used on empty stack.");
  }
  
  // Test Number 7.
  @Test
  void testTopException() {
    assertThrows(EmptyStackException.class, () -> stack.top(),
        "Tests if the EmptyStackException is thrown when top() is used on empty stack.");
  }
  

  // Test Number 8.
  @Test
  void testEntryPush() {
    stack.push(new Entry(1.23F));
    assertEquals(1, stack.size(), "Tests if push() can enter entries into the stack.");
  }
  
  // Test Number 9.
  @Test
  void testMultiEntryPush() {
    for (int i = 0; i < 1000; i++) {
      stack.push(new Entry(i * 1.0F));
    }
    
    assertEquals(1000, stack.size(), 
        "Tests if push() works when entries are added simultaneously into the stack.");
  }
  
  // Test Number 9.
  @Test
  void testEntryPop() throws EmptyStackException {
    Entry entry = new Entry("-");
    stack.push(entry);
    assertEquals(entry, stack.pop(), 
        "Tests if the pop() method removes the entry from the stack and returns it.");
  }
  
  // Test Number 10.
  @Test
  void testSizeWithEntires() {
    for (int i = 0; i < 10; i++) {
      stack.push(new Entry(i * 1.0F));
    }
    assertEquals(10, stack.size(),
        "Tests if the size() returns the correct size of the stack.");
  }
  
  // Test Number 11.
  @Test
  void testEntryTop() throws EmptyStackException {
    Entry entry1 = new Entry("-");
    Entry entry2 = new Entry(7.9F);
    
    stack.push(entry1);
    stack.push(entry2);
    
    assertEquals(entry2, stack.top(), 
        "Tests if the top() method returns the correct stack entry when called.");
  }
}
