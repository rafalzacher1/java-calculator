package calculator;

public class NumStack {  
  private Stack numStack;

  /**
   * Creates a stack for integer entries.
   */
  public NumStack() {
    this.numStack = new Stack();
  }
    
  /**
   * Adds a new float entry to in the stack.
   * 
   * @param entry is the new string entry.
   */
  public void push(float entry) {
    this.numStack.push(new Entry(entry));
  }
    
  /**
   * Removes the first string from the stack.
   * 
   * @return Returns the removed float.
   * @throws BadTypeException is thrown when non integer entries are removed.
   * @throws EmptyStackException is thrown when the stack is empty.
   */
  public float pop() throws BadTypeException, EmptyStackException {
    return this.numStack.pop().getValue();
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
