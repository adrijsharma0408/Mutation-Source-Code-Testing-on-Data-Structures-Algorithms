import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestPalindromicSubstringSourceTest {

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

}
