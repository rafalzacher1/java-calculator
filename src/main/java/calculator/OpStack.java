package calculator;

public class OpStack {
  private Stack numStack;

  /**
   * Creates a stack for symbol entries.
   */
  public OpStack() {
    this.numStack = new Stack();
  }
    
  /**
   * Adds a new symbol entry to in the stack.
   * 
   * @param entry is the new string entry.
   */
  public void push(Symbol entry) {
    this.numStack.push(new Entry(entry));
  }
    
  /**
   * Removes the first symbol from the stack.
   * 
   * @return Returns the removed symbol.
   * @throws BadTypeException is thrown when non symbol entries are removed.
   * @throws EmptyStackException is thrown when the stack is empty.
   */
  public Symbol pop() throws BadTypeException, EmptyStackException {
    return this.numStack.pop().getOther();
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
