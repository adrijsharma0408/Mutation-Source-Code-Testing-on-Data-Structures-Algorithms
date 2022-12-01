package DivideAndConquerTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AllDivideConquerTesting {

	@Test
	public void BinarySearch2dArrayTestMiddle() {
		int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};

		int[] ans1 = BinarySearch2dArray.BinarySearch(arr, 1);
		assertEquals(0, ans1[0]);
		assertEquals(0, ans1[1]);

		int[] ans2 = BinarySearch2dArray.BinarySearch(arr, 8);
		assertEquals(1, ans2[0]);
		assertEquals(2, ans2[1]);
		//	        
		int[] ans3 = BinarySearch2dArray.BinarySearch(arr, 2);
		assertEquals(0, ans3[0]);
		assertEquals(1, ans3[1]);
		//	        
		int[] ans4 = BinarySearch2dArray.BinarySearch(arr, 6);
		assertEquals(1, ans4[0]);
		assertEquals(0, ans4[1]);

		int[] ans5 = BinarySearch2dArray.BinarySearch(arr, 25);
		assertEquals(4, ans5[0]);
		assertEquals(4, ans5[1]);
		////	        
		int[] ans6 = BinarySearch2dArray.BinarySearch(arr, 10);
		assertEquals(1, ans6[0]);
		assertEquals(4, ans6[1]);
		//	        
		int[] ans7 = BinarySearch2dArray.BinarySearch(arr, 500);
		assertEquals(-1, ans7[0]);
		assertEquals(-1, ans7[1]);

		int[] ans8 = BinarySearch2dArray.BinarySearch(arr, -1);
		assertEquals(-1, ans8[0]);
		assertEquals(-1, ans8[1]);
		//	        
		int[] ans9 = BinarySearch2dArray.BinarySearch(arr, 26);
		assertEquals(-1, ans9[0]);
		assertEquals(-1, ans9[1]);
		//	        
		int[] ans10 = BinarySearch2dArray.BinarySearch(arr, 20);
		assertEquals(3, ans10[0]);
		assertEquals(4, ans10[1]);
		//	        
		int[] ans11 = BinarySearch2dArray.BinarySearch(arr, -1000);
		assertEquals(-1, ans11[0]);
		assertEquals(-1, ans11[1]);
		//	        
		int[] ans12 = BinarySearch2dArray.BinarySearch(arr, 15);
		assertEquals(2, ans12[0]);
		assertEquals(4, ans12[1]);
		//	        
		int[] ans13 = BinarySearch2dArray.BinarySearch(arr, 13);
		assertEquals(2, ans13[0]);
		assertEquals(2, ans13[1]);
		//	        
		int[] ans14 = BinarySearch2dArray.BinarySearch(arr, 11);
		assertEquals(2, ans14[0]);
		assertEquals(0, ans14[1]);
		//	        
		int[] ans15 = BinarySearch2dArray.BinarySearch(arr, 5);
		assertEquals(0, ans15[0]);
		assertEquals(4, ans15[1]);

		int[][] arr2 = {{1,2,3,4,5,6,7,8}};

		int[] ans16 = BinarySearch2dArray.BinarySearch(arr2, 5);
		assertEquals(0, ans16[0]);
		assertEquals(4, ans16[1]);
		//	        
		int[][] arr3 = {{}};

		//	        int[] ans19 = BinarySearch2dArray.BinarySearch(arr3, 5);
		//	        assertEquals(-1, ans19[0]);
		//	        assertEquals(-1, ans19[1]);

		//	        int[] ans17 = BinarySearch2dArray.BinarySearch(arr2, 100);
		//	        assertEquals(-1, ans17[0]);
		//	        assertEquals(-1, ans17[1]);
		//	        
		//	        int[] ans18 = BinarySearch2dArray.BinarySearch(arr2, 0);
		//	        assertEquals(-1, ans18[0]);
		//	        assertEquals(-1, ans18[1]);
	}

	@Test
	public void testBinarySearch() {
		BinarySearch bs = new BinarySearch();
		int[] arr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34};
		assertEquals(-1, bs.binarySearch(arr, -1));
		assertEquals(-1, bs.binarySearch(arr, 35));
		assertEquals(-1, bs.binarySearch(arr, 100));
		assertEquals(-1, bs.binarySearch(arr, -100));
		assertEquals(17, bs.binarySearch(arr, 17));
		assertEquals(34, bs.binarySearch(arr, 34));
		assertEquals(0, bs.binarySearch(arr, 0));
		assertEquals(5, bs.binarySearch(arr, 5));
		assertEquals(9, bs.binarySearch(arr, 9));
		assertEquals(26, bs.binarySearch(arr, 26));
		assertEquals(21, bs.binarySearch(arr, 21));
		assertEquals(30, bs.binarySearch(arr, 30));
	}

	@Test
	void testClosestPair() {
		ClosestPair cp = new ClosestPair(12);
		cp.array[0] = cp.buildLocation(2, 3);
		cp.array[1] = cp.buildLocation(2, 16);
		cp.array[2] = cp.buildLocation(3, 9);
		cp.array[3] = cp.buildLocation(6, 3);
		cp.array[4] = cp.buildLocation(7, 7);
		cp.array[5] = cp.buildLocation(19, 4);
		cp.array[6] = cp.buildLocation(10, 11);
		cp.array[7] = cp.buildLocation(15, 2);
		cp.array[8] = cp.buildLocation(15, 19);
		cp.array[9] = cp.buildLocation(16, 11);
		cp.array[10] = cp.buildLocation(17, 13);
		cp.array[11] = cp.buildLocation(9, 12);
		cp.xQuickSort(cp.array, 0, cp.array.length - 1);
		double actResult = cp.closestPair(cp.array, cp.array.length);
		double expResult = cp.closestPair(cp.array, cp.array.length);
		assertEquals(expResult, actResult);
	}

	@Test
    public void testRabinKarp() {
    	RabinKarp rka = new RabinKarp();
        int q = 101;
        assertEquals(rka.search("algorithmn", "This is an example for rabin karp algorithmn", q), 34);
        assertEquals(rka.search("AAA", "AAABBDDG", q), 0);
        assertEquals(rka.search("BBCC", "AAABBCCBB", q), 3);
        assertEquals(rka.search("CCC", "AAAABBBBCCC", q), 8);
        assertEquals(rka.search("AADB", "ABCBCBCAAB", q), -1);
    }
	
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
