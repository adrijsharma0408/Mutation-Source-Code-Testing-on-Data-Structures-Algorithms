package DivideAndConquerTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StrassenMatrixMultiplicationTest {
    @Test
    public void testStrassenMatrixMultiplication() {
    	StrassenMatrixMultiplication smm = new StrassenMatrixMultiplication();
    	
        int[][] A1 = { { 1, 2 }, { 3, 4 } };
        int[][] B1 = { { 5, 6 }, { 7, 8 } };
        int[][] expResult1 = { { 19, 22 }, { 43, 50 } };
        int[][] actResult1 = smm.multiply(A1, B1);
        assertArrayEquals(expResult1, actResult1);
        
        int[][] A2 = { { 1, 2, 5, 4 }, { 9, 3, 0, 6 }, { 4, 6, 3, 1 }, { 0, 2, 0, 6 } };
        int[][] B2 = { { 1, 0, 4, 1 }, { 1, 2, 0, 2 }, { 0, 3, 1, 3 }, { 1, 8, 1, 2 } };
        int[][] expResult2 = { { 7, 51, 13, 28 }, { 18, 54, 42, 27 }, { 11, 29, 20, 27 }, { 8, 52, 6, 16 } };
        int[][] actResult2 = smm.multiply(A2, B2);
        assertArrayEquals(expResult2, actResult2);
        
        int[][] A3 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int[][] B3 = { { 1, -2, -3, 4 }, { 4, -3, -2, 1 }, { 5, -6, -7, 8 }, { 8, -7, -6, -5 } };
        int[][] expResult3 = { { 56, -54, -52, 10 }, { 128, -126, -124, 42 }, { 200, -198, -196, 74 }, { 272, -270, -268, 106 } };
        int[][] actResult3 = smm.multiply(A3, B3);
        assertArrayEquals(expResult3, actResult3);
    }
}
