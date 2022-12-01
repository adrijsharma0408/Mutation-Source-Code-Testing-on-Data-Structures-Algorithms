import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AllTestsTogether {
	@Test
	public void testChange() {
		CoinChangeSource ccs = new CoinChangeSource(); 
		
		// Test 1
		int[] coins1 = {1,2,3};
		int amount1 = 30;
		assertEquals(91, ccs.change(coins1, amount1));
		
		// Test 2
		int coins2[] = {1};
		int amount2 = 20;
		assertEquals(1, ccs.change(coins2, amount2));
		
		// Test 3
		int coins3[] = {5};
		int amount3 = 4; 
		assertEquals(0, ccs.change(coins3, amount3));
	}
	
	@Test
	public void testMinimumCouns() {
		CoinChangeSource ccs = new CoinChangeSource(); 
		
		// Test 1
		int [] coins1 = {1,2,3,4,5};
		int amount1 = 3;
		assertEquals(1, ccs.minimumCoins(coins1, amount1));
		
		// Test 2
		int [] coins2 = {1};
		int amount2 = 10000;
		assertEquals(10000, ccs.minimumCoins(coins2, amount2)); 
		
		// Test 3
		int [] coins3 = {6,2,9,10}; 
		int amount3 = 502;
		assertEquals(51, ccs.minimumCoins(coins3, amount3)); 
		
		/*
		 * Running the below test produces error - the function minimumCoins() does not 
		 * factor cases when the change cannot be formed!
		 * 
		 * // Test 4
		 * int [] coins4 = {100}; 
		 * int amount4 = 101;
		 * assertEquals(-1, ccs.minimumCoins(coins4, amount4)); 
		*/
	}
	
	@Test
	void testMinDistance() {
		EditDistanceSource eds = new EditDistanceSource(); 
		
		// Test 1
		String word11 = "abcde"; 
		String word12 = "a"; 
		assertEquals(4, eds.minDistance(word11, word12)); 
		
		// Test 2
		String word21 = "a"; 
		String word22 = "a"; 
		assertEquals(0, eds.minDistance(word21, word22)); 
		
		// Test 3
		String word31 = "bb"; 
		String word32 = "abb"; 
		assertEquals(1, eds.minDistance(word31, word32)); 
		
		// Test 4
		String word41 = "abba";
		String word42 = "abccba"; 
		assertEquals(2, eds.minDistance(word41, word42)); 
	}
	
	@Test
	public void testFibMemo() {
		FibonacciSource fs = new FibonacciSource(); 
		
		// Test 1
		assertEquals(0, fs.fibMemo(0));
		
		// Test 2
		assertEquals(1, fs.fibMemo(1)); 
		
		// Test 3
		assertEquals(1, fs.fibMemo(2));
		
		// Test 4
		assertEquals(144, fs.fibMemo(12)); 
		
		// Test 5
		assertEquals(610, fs.fibMemo(15)); 
	}
	
	@Test
	public void testFibBotUp() {
		FibonacciSource fs = new FibonacciSource();
		
		// Test 1
		assertEquals(2, fs.fibBotUp(3));
		
		// Test 2
		assertEquals(1, fs.fibBotUp(2)); 
		
		// Test 3
		assertEquals(102334155, fs.fibBotUp(40)); 
	}
	
	@Test
	public void testFibOptimized() {
		FibonacciSource fs = new FibonacciSource();
		
		// Test 1
		assertEquals(832040, fs.fibOptimized(30));
		
		// Test 2
		assertEquals(1, fs.fibOptimized(2)); 
	}
	
	@Test
	public void testFibBinet() {
		FibonacciSource fs = new FibonacciSource();
		
		// Test 1
		assertEquals(3, fs.fibBinet(4));
		
		// Test 2
		assertEquals(10946, fs.fibBinet(21)); 
	}
	
	@Test
	void testKnapsack() {
		KnapsackSource kss = new KnapsackSource(); 
		
		// Test 1
		int W1 = 100; 
		int wt1 [] = {1,1,101}; 
		int val1 [] = {10,20,31}; 
		int n1 = wt1.length; 
		assertEquals(30, kss.knapSack(W1, wt1, val1, n1));
		
		// Test 2
		int W2 = 10; 
		int wt2 [] = {11,12}; 
		int val2 [] = {11,22}; 
		int n2 = wt2.length; 
		assertEquals(0, kss.knapSack(W2, wt2, val2, n2));
				
		// Test 3
		int W3 = 15; 
		int wt3 [] = {15, 100}; 
		int val3 [] = {1,100}; 
		int n3 = wt3.length; 
		assertEquals(1, kss.knapSack(W3, wt3, val3, n3));
						
		// Test 4
		int W4 = 25; 
		int wt4 [] = {5,5,5,5,5,5}; 
		int val4 [] = {1,4,3,7,2,8}; 
		int n4 = wt4.length; 
		assertEquals(24, kss.knapSack(W4, wt4, val4, n4));
						
					
	}
	
	@Test
	void testGetLCS() {
		LongestCommonSubsequenceSource lcss = new LongestCommonSubsequenceSource(); 
		
		// Test 1
		String str11 = ""; 
		String str12 = ""; 
		assertEquals("", lcss.getLCS(str11, str12)); 
		
		// Test 2
		String str21 = null;
		String str22 = ""; 
		assertEquals(null, lcss.getLCS(str21, str22));
		
		// Test 3
		String str31 = "aa"; 
		String str32 = "";
		assertEquals("", lcss.getLCS(str31, str32)); 
		
		// Test 4
		String str41 = "aa";
		String str42 = "a"; 
		assertEquals("a", lcss.getLCS(str41, str42)); 
		
		// Test 5
		String str51 = "abc";
		String str52 = "def"; 
		assertEquals("", lcss.getLCS(str51, str52)); 
		
		// Test 6
		String str61 = "abcdefgh"; 
		String str62 = "abcdefgh"; 
		assertEquals("abcdefgh", lcss.getLCS(str61, str62)); 
		
		
		// Test 7
		String str71 = "aabbccddef"; 
		String str72 = "qsdaaccefg";
		assertEquals("aaccef", lcss.getLCS(str71, str72)); 
		
		// Test 8
		String str81 = "ababababababa"; 
		String str82 = "aaaaaa"; 
		assertEquals("aaaaaa", lcss.getLCS(str81, str82)); 
		
		// Test 9
		String str91 = "abcdef"; 
		String str92 = "defabc";
		assertEquals("def", lcss.getLCS(str91, str92)); 
		
		// Test 10
		String str101 = "jfleriojreiogjriogjfigjoiergierogjioergjioergiofe423423098g"; 
		String str102 = "flgkjefogr0tu90t3940rj0949u043jef93209uej9dq090320r";
		assertEquals("flgjfogrrjef3209", lcss.getLCS(str101, str102));  
	}
	
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
	
	@Test
	void testLPS() {
		LongestPalindromicSubsequenceSource lpss = new LongestPalindromicSubsequenceSource(); 
		
		// Test 1
		String s1 = ""; 
		assertEquals("", lpss.LPS(s1)); 
		
		// Test 2
		String s2 = "a"; 
		assertEquals("a", lpss.LPS(s2)); 
		
		// Test 3
		String s3 = "abcdcba"; 
		assertEquals("abcdcba", lpss.LPS(s3)); 
		
		// Test 4
		String s4 = "abcdef"; 
		assertEquals("a", lpss.LPS(s4)); 
		
		// Test 5
		String s5 = "acee"; 
		assertEquals("ee", lpss.LPS(s5)); 
	}
	
	@Test
	void testLPSS() {
		LongestPalindromicSubstringSource lpss = new LongestPalindromicSubstringSource(); 
		
		// Test 1
		String s1 = ""; 
		assertEquals("", lpss.LPS(s1));
		
		// Test 2
		String s2 = null; 
		assertEquals(null, lpss.LPS(s2));
		
		// Test 3
		String s3 = "aba"; 
		assertEquals("aba", lpss.LPS(s3)); 
		
		// Test 4
		String s4 = "a";
		assertEquals("a", lpss.LPS(s4)); 
		
		// Test 5
		String s5 = "abcdef"; 
		assertEquals("f", lpss.LPS(s5));
		
		// Test 6
		String s6 = "abcdababa";
		assertEquals("ababa", lpss.LPS(s6)); 
	}
	
	@Test
	void testGetLongestValidParentheses() {
		LongestValidParenthesisSource lpss = new LongestValidParenthesisSource(); 
		
		// Test 1
		String s1 = "";
		assertEquals(0, lpss.getLongestValidParentheses(s1));
		
		// Test 2
		String s2 = ")("; 
		assertEquals(0, lpss.getLongestValidParentheses(s2)); 
		
		// Test 3
		String s3 = "("; 
		assertEquals(0, lpss.getLongestValidParentheses(s3)); 
		
		// Test 4
		String s4 = "()";
		assertEquals(2, lpss.getLongestValidParentheses(s4)); 
		
		// Test 5
		String s5 = "((((())))))"; 
		assertEquals(10, lpss.getLongestValidParentheses(s5)); 
		
		// Test 6
		String s6 = "))))((((("; 
		assertEquals(0, lpss.getLongestValidParentheses(s6)); 
		
		// Test 7
		String s7 = "(()()()()()()())";
		assertEquals(16, lpss.getLongestValidParentheses(s7)); 
		
		// Test 8
		String s8 = "((((()(())((((((()"; 
		assertEquals(6, lpss.getLongestValidParentheses(s8)); 
	}
	
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
	
	@Test
	void testMinimalPartitions() {
		PalindromicPartitioningSource pps = new PalindromicPartitioningSource(); 
		
		/* Below test gives error on running
		 * // Test 1 
		 * String s1 = ""; 
		 * assertEquals(0, pps.minimalpartitions(s1));
		 */ 
		
		// Test 2
		String s2 = "a"; 
		assertEquals(0, pps.minimalpartitions(s2)); 
		
		// Test 3
		String s3 = "aa"; 
		assertEquals(0, pps.minimalpartitions(s3)); 
		
		// Test 4
		String s4 = "aba"; 
		assertEquals(0, pps.minimalpartitions(s4)); 
		
		// Test 5
		String s5 = "ab"; 
		assertEquals(1, pps.minimalpartitions(s5)); 
		
		// Test 6
		String s6 = "pqqabb"; 
		assertEquals(3, pps.minimalpartitions(s6)); 
	}
	
	@Test
	void test() {
		RodCuttingSource rcs = new RodCuttingSource(); 
		
		// Test 1
		int[] arr1 = {1}; 
		assertEquals(1, rcs.cutRod(arr1, arr1.length)); 
		
		// Test 2
		int[] arr2 = {1,2,3,4}; 
		assertEquals(4, rcs.cutRod(arr2, arr2.length)); 
		
		// Test 3
		int[] arr3 = {1,1,1,102,100}; 
		assertEquals(103, rcs.cutRod(arr3, arr3.length)); 
	}
	
	@Test
	void testGetCount() {
		SubsetCountSource scs = new SubsetCountSource(); 
		
		// Test 1
		int[] arr1 = {1}; 
		int sum1 = 0;
		assertEquals(1, scs.getCount(arr1, sum1)); 
		
		// Test 2
		int[] arr2 = {1,1}; 
		int sum2 = 1;
		assertEquals(2, scs.getCount(arr2, sum2)); 
		
		/* Running below test gives error, so the implementation is incorrect
		 * // Test 3  
		 * int[] arr3 = {1,3,4,6,2,6,4,5,2,5,6}; 
		 * int sum3 = 10;
		 * assertEquals(29, scs.getCount(arr3, sum3));
		 */
		
	}
	
	@Test
	void testGetCountSO() {
		SubsetCountSource scs = new SubsetCountSource(); 
		
		// Test 1
		int[] arr1 = {1,3,4,6,2,6,4,5,2,5,6}; 
		int sum1 = 10;
		assertEquals(29, scs.getCountSO(arr1, sum1));
		
		// Test 2
		int[] arr2 = {1,1,1};
		int sum2 = 2;
		assertEquals(3, scs.getCountSO(arr2, sum2)); 
		
		// Test 3
		int[] arr3 = {2};
		int sum3 = 2;
		assertEquals(1, scs.getCountSO(arr3, sum3)); 
	}
	
	@Test
	void testSubsetSum() {
		SubsetSumSource sss = new SubsetSumSource(); 
		
		// Test 1
		int arr1[] = {1,2,3}; 
		int sumToCheck1 = 7;
		assertEquals(false, sss.subsetSum(arr1, sumToCheck1)); 
		
		// Test 2
		int arr2[] = {1,2,3}; 
		int sumToCheck2 = 5;
		assertEquals(true, sss.subsetSum(arr2, sumToCheck2)); 
		
		// Test 3
		int arr3[] = {}; 
		int sumToCheck3 = 10;
		assertEquals(false, sss.subsetSum(arr3, sumToCheck3)); 
		
		// Test 4
		int arr4[] = {};
		int sumToCheck4 = 0;
		assertEquals(true, sss.subsetSum(arr4, sumToCheck4));
		
		// Test 5
		int arr5[] = {1,2,3};
		int sumToCheck5 = 0;
		assertEquals(true, sss.subsetSum(arr5, sumToCheck5)); 
		
		// Test 6
		int arr6[] = {100, 200, 300, 400, 500, 600}; 
		int sumToCheck6 = 2101;
		assertEquals(false, sss.subsetSum(arr6, sumToCheck6));
		
		/* We found a bug - uncommenting below test fails the mutation process
		* // Test 7
		* int arr7[] = {-1,-2,-100};
		* int sumToCheck7 = -102;
		* assertEquals(true, sss.subsetSum(arr7, sumToCheck7)); 
		*/ 
		
		// Test 8
		int[] arr8 = {1,4,10,1,3}; 
		int sumToCheck8 = 8;
		assertEquals(true, sss.subsetSum(arr8, sumToCheck8)); 
	}
	
	@Test
	void testUniquePathsDP() {
		UniquePathsSource ups = new UniquePathsSource(); 
		
		// Test 1
		int m1 = 1;
		int n1 = 1;
		assertEquals(1, ups.uniquePathsDP(m1, n1));
		
		// Test 2
		int m2 = 1; 
		int n2 = 100; 
		assertEquals(1, ups.uniquePathsDP(m2, n2)); 
		
		// Test 3
		int m3 = 5;
		int n3 = 100; 
		assertEquals(4421275, ups.uniquePathsDP(m3, n3)); 
		
		// Test 4
		int m4 = 4;
		int n4 = 4;
		assertEquals(20, ups.uniquePathsDP(m4, n4)); 
	}
	
	@Test
	void testUniquePathsNaive() {
		UniquePathsSource ups = new UniquePathsSource(); 
		
		// Test 1
		int m1 = 1;
		int n1 = 1;
		assertEquals(1, ups.uniquePathsNaive(m1, n1));
		
		// Test 2
		int m2 = 10;
		int n2 = 10;
		assertEquals(48620, ups.uniquePathsNaive(m2, n2)); 
		
		// Test 3
		int m3 = 50;
		int n3 = 9;
		
		assertEquals(1652411475, ups.uniquePathsNaive(m3, n3)); 
	}
}
