

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class StudentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StudentTest
{
    /**
     * Default constructor for test class StudentTest
     */
    public StudentTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        System.out.println("executing setUp()");
    }

    @Test
    public void testBMI () {
        //throw new IllegalArgumentException("es ist mir nix besseres eingefallen");
        //assert(false);
        // kein Code bedeutet Test wird gut gehen ... TODO
    }
    
    @Test
    public void testWertung() {
        Student student = new Student("Ferdinand", true, 181, 100);
        assertEquals("Übergewichtig", student.bmi_werter(), "BMI Wertung");
        student = new Student("Harald", false, 200, 65);
        assertEquals("Untergewichtig", 
    }
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
        System.out.println("executing tearDown()");
    }
}
