package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestEntry {
  private static Entry floatEntry;
  private static Entry symbolEntry;
  private static Entry strEntry;
  
  // Creates new entries before all the tests are executed.
  @BeforeAll
  static void createEntries() {
    floatEntry = new Entry(10.8F);
    symbolEntry = new Entry(Symbol.DIVIDE);
    strEntry = new Entry("String");
  }
  
  // Test Number 1.
  @Test
  void testGetType() {
    assertEquals(Type.NUMBER, floatEntry.getType(),
        "Tests if the getType() method returns the type of the entry.");
  }

  // Test Number 2.
  @Test
  void testGetValue() throws BadTypeException {
    assertEquals(10.8F, floatEntry.getValue(),
        "Tests if the getValue() method returns the value of the entry.");
  }
  
  // Test Number 3.
  @Test
  void testGetOther() throws BadTypeException {
    assertEquals(Symbol.DIVIDE, symbolEntry.getOther(),
        "Tests if the getOther() method returns the other of the entry.S");
  }
  
  // Test Number 4.
  @Test
  void testGetStr() throws BadTypeException {
    assertEquals("String", strEntry.getStr(),
        "Tests if the getStr() method returns the string of the entry.");
  }  
  
  // Test Number 5.
  @Test
  void testGetStrException() {
    Throwable exception = assertThrows(
        BadTypeException.class, () -> {
          floatEntry.getStr();
        });
    
    assertEquals("Asked for string: received a " + floatEntry.getType(), exception.getMessage(),
        "Tests if the getStr() method exception shows the correct message.");
  }
  
  // Test Number 6.
  @Test
  void testGetOtherException() {
    Throwable exception = assertThrows(
        BadTypeException.class, () -> {
          strEntry.getOther();
        });
    
    assertEquals("Asked for symbol: received a " + strEntry.getType(), exception.getMessage(),
        "Tests if the getOther() method exception shows the correct message.");
  }
  
  // Test Number 7.
  @Test
  void testGetValueException() {
    Throwable exception = assertThrows(
        BadTypeException.class, () -> {
          symbolEntry.getValue();
        });
    
    assertEquals("Asked for float: received a " + symbolEntry.getType(), exception.getMessage(),
        "Tests if the getValue() method exception shows the correct message.");
  }
  
  // Test Number 8.
  @Test
  void testEquals() throws BadTypeException {
    assertEquals(true, floatEntry.equals(floatEntry),
        "Tests if the equals() method returns true if two entries are equal.");
    assertEquals(false, strEntry.equals(symbolEntry),
        "Tests if the equals() method returns false if entries are not equal.");
  }
  
  // Test Number 9.
  @Test
  void testHashCode() {
    int floatEntryHash = floatEntry.hashCode();
    int symbolEntryHash = symbolEntry.hashCode();
    int strEntryHash = strEntry.hashCode();
    
    assertEquals(floatEntryHash, floatEntry.hashCode(),
        "Tests if the hash code matches the generated hash code for float entry.");
    assertEquals(symbolEntryHash, symbolEntry.hashCode(),
        "Tests if the hash code matches the generated hash code for symbol entry.");
    assertEquals(strEntryHash, strEntry.hashCode(),
        "Tests if the hash code matches the generated hash code for string entry.");
  }
}
