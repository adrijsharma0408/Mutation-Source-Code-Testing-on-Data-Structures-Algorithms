import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestPalindromicSubsequenceSourceTest {

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

}
