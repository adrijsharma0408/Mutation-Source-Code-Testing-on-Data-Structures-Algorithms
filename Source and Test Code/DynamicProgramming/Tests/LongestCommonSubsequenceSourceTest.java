import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestCommonSubsequenceSourceTest {

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

}
