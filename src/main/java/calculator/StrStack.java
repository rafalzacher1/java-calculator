package calculator;

/**
 * Creates a stack of strings for the Shunting algorithm.
 * 
 * @author Rafal.
 * 
 */
public class StrStack {
  private Stack numStack;

  /**
   * Creates a stack for string entries.
   */
  public StrStack() {
    this.numStack = new Stack();
  }
    
  /**
   * Adds a new string entry to in the stack.
   * 
   * @param entry is the new string entry.
   */
  public void push(String entry) {
    this.numStack.push(new Entry(entry));
  }
    
  /**
   * Removes the first string from the stack.
   * 
   * @return Returns the removed string.
   * @throws BadTypeException is thrown when non string entries are removed.
   * @throws EmptyStackException is thrown when the stack is empty.
   */
  public String pop() throws BadTypeException, EmptyStackException {
    return this.numStack.pop().getStr();
  }
    
  /**
   * Checks if the stack is empty.
   * 
   * @return Returns true if stack is empty and false otherwise.
   */
  public boolean isEmpty() {
    return this.numStack.isEmpty();
  } 
}
