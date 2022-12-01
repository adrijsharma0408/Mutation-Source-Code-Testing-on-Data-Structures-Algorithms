

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class KMPSearchTest {
    @Test
    public void testKMPSearch() {
    	KMPSearch kmp = new KMPSearch();        
        
        assertEquals(kmp.kmpSearch("ABABCABAB", "ABABDABACDABABCABAB"), 10);
        assertEquals(kmp.kmpSearch("AAAA", "AAAAABAAABA"), 0);
        assertEquals(kmp.kmpSearch("AAAA", "AAACAAAAAC"), 4);
        assertEquals(kmp.kmpSearch("AAAA", "AAABAAAA"), 4);
        assertEquals(kmp.kmpSearch("AAAA", "AABAAA"), -1);
    }
}