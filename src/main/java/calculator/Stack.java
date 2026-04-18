package calculator;

import java.util.LinkedList;
import java.util.List;

/**
 * Creates a stack of entries.
 * 
 * @author Rafal.
 * 
 */
public class Stack {
  private int size;
  private List<Entry> entries;
  
  /**
   * Creates a stack for entries.
   * 
   */
  public Stack() {
    this.size = 0;
    this.entries = new LinkedList<Entry>();
  }

  /**
   * Provides the size of the stack.
   * 
   * @return Returns the number of entries in a stack.
   */
  public int size() {
    return this.size;
  }

  /**
   * Adds a new entry to the stack.
   * 
   * @param entry is the new entry to be added to the stack.
   */
  public void push(Entry entry) {
    this.entries.add(entry);
    this.size++;
  }
  
  /**
   * Removes the first entry from the stack.
   * 
   * @return Returns the removed entry from the stack.
   * @throws EmptyStackException exception when stack is empty.
   */
  public Entry pop() throws EmptyStackException {
    if (isEmpty()) {
      throw new EmptyStackException("The stack is empty.");
    } else {
      Entry curr = this.entries.get(this.size - 1);
      this.entries.remove(this.size - 1);
      this.size--;
      return curr;
    }
  }
  
  /**
   * Provides the first entry from the stack.
   * 
   * @return Returns the first entry from the stack.
   * @throws EmptyStackException exception when stack is empty.
   */
  public Entry top() throws EmptyStackException {
    if (isEmpty()) {
      throw new EmptyStackException("The stack is empty.");
    } else {
      return this.entries.get(this.size - 1);
    }
  }
  
  /**
   * Checks if the stack is empty.
   * 
   * @return Returns true if stack is empty and false otherwise.
   */
  public boolean isEmpty() {
    return this.size == 0;
  }
}
