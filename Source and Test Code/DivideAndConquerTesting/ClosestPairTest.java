package DivideAndConquerTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClosestPairTest {
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
}
