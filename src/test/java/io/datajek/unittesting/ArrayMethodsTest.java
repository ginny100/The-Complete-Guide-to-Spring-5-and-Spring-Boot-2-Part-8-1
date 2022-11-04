package io.datajek.unittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayMethodsTest {

    @Test
    public void testFindIndex_numberInArray() {
        //1. Create object of the class
        ArrayMethods arrayMethods = new ArrayMethods();
        //2. Call method
        int result = arrayMethods.findIndex(new int[] {8, 4, 5}, 4);
        //3. Compare the actual results to the expected
        assertEquals(1, result);
    }

    //This test will fail. The error message will gve an insight into what the test was supposed to do.
    @Test
    public void testFindIndex_numberNotInArray() {
        //1. Create object of the class
        ArrayMethods arrayMethods = new ArrayMethods();
        //2 + 3. Call method and Compare the actual results to the expected
        assertEquals(1, arrayMethods.findIndex(new int[] {8, 4, 5}, 1),"The findIndex method finds the index of a given number");
    }

    @Test
    public void testFindIndex_emptyArray() {
        //1. Create object of the class
        ArrayMethods arrayMethods = new ArrayMethods();
        //2 + 3. Call method and Compare the actual results to the expected
        assertEquals(-1, arrayMethods.findIndex(new int[] {}, 1));
    }

    @Test
    public void testAssert() {
        Boolean condition = true;
        assertEquals(true,true);
        assertTrue(condition);

        String str = null;
        assertEquals(null, str);
        assertNull(str);

    }

    //This test will fail because of fail method
    @Test
    public void testSortArray() {
        fail("unimplemented method");
    }

    @Test
    public void testFindIndex_indexOutOfBound() {
        ArrayMethods arrayMethods = new ArrayMethods();
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> arrayMethods.printArray(new int[] {1, 8, 5}, 3));
    }

    @Test
    public void testFindIndex() {
        ArrayMethods arrayMethods = new ArrayMethods();
        assertAll(
                () -> assertEquals(1, arrayMethods.findIndex(new int[] {8, 4, 5}, 4)),
                () -> assertEquals(-1, arrayMethods.findIndex(new int[] {8, 4, 5}, 1)),
                () -> assertEquals(-1, arrayMethods.findIndex(new int[] {}, 1))
        );
    }
}