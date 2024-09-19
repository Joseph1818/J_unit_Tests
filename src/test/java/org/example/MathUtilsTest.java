package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

    /**
     * Method under test: {@link MathUtils#add(int, int)}
     */

    @Test
    void testAdd() {
     //Creating a new instance
        MathUtils underTest = new MathUtils();
        //Expected output;
        int expected = 2;
        // Actual output;
        int actual = underTest.add(1,1);
        assertEquals(expected, actual, "The add methode should have two numbers");
    }

    @Test
    void testRadiusCircle(){
        MathUtils underTest = new MathUtils();
        assertEquals(314.1592653589793, underTest.computerCircleRadius(10),"if failed please review the math");
    }

    @Test
    void testDivide(){
        MathUtils mathUtils = new MathUtils();
        assertThrows( ArithmeticException.class,() -> mathUtils.divide(1,0), "Divide test by Zero should trow ");
    }

}

