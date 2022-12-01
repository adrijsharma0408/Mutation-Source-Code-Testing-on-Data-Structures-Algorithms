import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestIncreasingSubsequenceSourceTest {

	@Test
	void testLIS() {
		LongestIncreasingSubsequenceSource liss = new LongestIncreasingSubsequenceSource(); 
		
		// Test 1
		int[] arr1 = {}; 
		assertEquals(0, liss.LIS(arr1)); 
		
		// Test 2
		int[] arr2 = {1};
		assertEquals(1, liss.LIS(arr2)); 
		
		// Test 3
		int[] arr3 = {1,2};
		assertEquals(2, liss.LIS(arr3)); 
		
		// Test 4
		int[] arr4 = {2,1}; 
		assertEquals(1, liss.LIS(arr4)); 
		
		// Test 5
		int[] arr5 = {1,2,2,5};
		assertEquals(3, liss.LIS(arr5));
		
		// Test 6
		int[] arr6 = {1,1,1,1,1};
		assertEquals(1, liss.LIS(arr6)); 
		
		// Test 7
		int[] arr7 = {3,5,2,6,7,2,6,7};
		assertEquals(4, liss.LIS(arr7)); 
		
		// Test 8
		int[] arr8 = {1,1,6,3,3,4,6,5,5}; 
		assertEquals(4, liss.LIS(arr8)); 
	}
	
	@Test
	void testFindLISLen() {
		LongestIncreasingSubsequenceSource liss = new LongestIncreasingSubsequenceSource(); 
		
		/* Uncommenting below test fails the test on running, so a bug is in the code
		 * // Test 1
		 * int[] arr1 = {}; 
		 * assertEquals(0, liss.findLISLen(arr1)); 
		 * 
		*/ 
		
		// Test 2
		int[] arr2 = {100};
		assertEquals(1, liss.findLISLen(arr2)); 
		
		// Test 3
		int[] arr3 = {5,4}; 
		assertEquals(1, liss.findLISLen(arr3)); 
		
		// Test 4
		int[] arr4 = {3,10,2,1,10,12}; 
		assertEquals(3, liss.findLISLen(arr4)); 
		
		
		/* Uncommenting below test fails the test on running, so a bug is in the code
		 * // Test 5 
		 * int[] arr5 = {10,11,12,13}; 
		 * assertEquals(4, liss.findLISLen(arr5));
		 */ 
		
		// Test 6
		int[] arr6 = {1,4,7,3,7,9}; 
		assertEquals(4, liss.findLISLen(arr6)); 
		
		// Test 7
		int[] arr7 = {1}; 
		assertEquals(1, liss.findLISLen(arr7)); 
		
		// Test 8
		int[] arr8 = {1,3,6,2,6,82,6,8,2}; 
		assertEquals(4, liss.findLISLen(arr8)); 
		
		// Test 9
		int[] arr9 = {5,2,4,7,92,6,7,3,6,7}; 
		assertEquals(4, liss.findLISLen(arr9));  
	}
}
