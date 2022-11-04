package io.datajek.unittesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMethodsTest {
    @Test
    public void testFindIndex_numberInArray() {
        //1. create object of the class
        ArrayMethods arrayMethods = new ArrayMethods();

        //2. call method
        int result = arrayMethods.findIndex(new int[] {8, 4, 5}, 4);

        //3. compare the actual results to the expected
        assertEquals(1, result);
    }

    @Test
    public void testFindIndex_numberNotInArray() {
        //1. create object of the class
        ArrayMethods arrayMethods = new ArrayMethods();
        //2 + 3. call method & compare the actual results to the expected
        assertEquals(-1, arrayMethods.findIndex(new int[] {8, 4, 5}, 1));
    }

    @Test
    public void testFindIndex_emptyArray() {
        //1. create object of the class
        ArrayMethods arrayMethods = new ArrayMethods();
        //2 + 3. call method & compare the actual results to the expected
        assertEquals(-1, arrayMethods.findIndex(new int[] {}, 1));
    }
}