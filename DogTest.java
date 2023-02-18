import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

// Test the Dog class.

public class DogTest {
  private Dog _dog;

  /**
   * Default constructor for test class ATest.
   */
  public DogTest() {}

  /**
   * Sets up the test fixture.
   *
   * Called before every test case method.
   */
  @Before
  public void setUp() {
    _dog = new Dog("Fido", 5);
  }

  /**
   * Tears down the test fixture.
   *
   * Called after every test case method.
   */
  @After
  public void tearDown() {
    _dog = null;
  }

  /**
   * Test methods 
   */

  // Test the creation of Dog objects.
  @Test
  public void testCreation() {
    assertTrue("Error in testCreation ", "Fido".equals(_dog.getName()));
    assertEquals("Error in testCreation ", 5, _dog.getAge());

    Dog anotherDog = new Dog("Lassie", 4);
    assertTrue("Error in testCreation ", "Lassie".equals(anotherDog.getName()));
    assertEquals("Error in testCreation", 4, anotherDog.getAge());
  }

  // Test computation of person years.
  @Test
  public void testComputation() {
    int age = _dog.computeDogAge();
    assertEquals("Error in testComputation", 35, age);
  }

  // Test equality of two dogs that have the same attributes.
  @Test
  public void testEquality() {
    String dogName = new String("Fido");
    int dogAge = 5;
    System.out.println("age = " + dogAge);
    Dog myDog = new Dog(dogName, dogAge);

    assertTrue("Error in testEquality", _dog.equals(myDog));
  }

  // Test inequality of dogs with different data.
  @Test
  public void testInequality() {
    Dog difftNameDifftAge = new Dog("Spot", 7);
    assertFalse("Error in testInequality", _dog.equals(difftNameDifftAge));

    Dog difftNameSameAge = new Dog("Spot", 5);
    assertFalse("Error in testInequality", _dog.equals(difftNameSameAge));

    Dog sameNameDifftAge = new Dog("Fido", 3);
    assertFalse("Error in testInequality", _dog.equals(sameNameDifftAge));
  }
}