package homework;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class RecursiveMethodsTest {
    private RecursiveMethods methods;

    @Before
    public void setUp() {
        methods = new RecursiveMethods();
    }

    @Test
    public void testSumFirstNIntegers() {
        assertEquals(10, methods.sumFirstNIntegers(4));
        assertEquals(55, methods.sumFirstNIntegers(10));
    }

    @Test
    public void testSumFirstNEvenIntegers() {
        assertEquals(20, methods.sumFirstNEvenIntegers(4));
        assertEquals(110, methods.sumFirstNEvenIntegers(10));
    }

    @Test
    public void testReverseString() {
        assertEquals("madam", methods.reverseString("madam"));
        assertEquals("ana", methods.reverseString("ana"));
        assertEquals("olleh", methods.reverseString("hello"));
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(methods.isPalindrome("madam"));
        assertTrue(methods.isPalindrome("ana"));
        assertFalse(methods.isPalindrome("hello"));
    }

    @Test
    public void testSumOfDigits() {
        assertEquals(6, methods.sumOfDigits(123));
        assertEquals(15, methods.sumOfDigits(12345));
    }

    @Test
    public void testFibonacci() {
        assertEquals(0, methods.fibonacci(0));
        assertEquals(1, methods.fibonacci(1));
        assertEquals(1, methods.fibonacci(2));
        assertEquals(2, methods.fibonacci(3));
        assertEquals(3, methods.fibonacci(4));
        assertEquals(5, methods.fibonacci(5));
    }
}
