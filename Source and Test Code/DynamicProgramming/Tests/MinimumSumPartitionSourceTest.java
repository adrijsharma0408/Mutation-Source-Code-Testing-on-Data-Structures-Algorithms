import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinimumSumPartitionSourceTest {

	@Test
	void testSubSet() {
		MinimumSumPartitionSource msps = new MinimumSumPartitionSource(); 
		
		// Test 1
		int[] arr1 = {1,2}; 
		assertEquals(1, msps.subSet(arr1)); 
		
		// Test 2
		int[] arr2 = {1}; 
		assertEquals(1, msps.subSet(arr2)); 
		
		// Test 3
		int[] arr3 = {1,1}; 
		assertEquals(0, msps.subSet(arr3)); 
		
		// Test 4
		int[] arr4 = {};
		assertEquals(0, msps.subSet(arr4)); 
		
		// Test 5
		int[] arr5 = {3,7,2,7,9,4,5,2,5,8,9,3,6}; 
		assertEquals(0, msps.subSet(arr5)); 
		
		// Test 6
		int[] arr6 = {22,4,2,34,35,7,6,3,5,62,5}; 
		assertEquals(1, msps.subSet(arr6)); 
		
		// Test 7
		int[] arr7 = {100,10,100,10,100,10,100,100,100,20}; 
		assertEquals(10, msps.subSet(arr7)); 
	}

}
