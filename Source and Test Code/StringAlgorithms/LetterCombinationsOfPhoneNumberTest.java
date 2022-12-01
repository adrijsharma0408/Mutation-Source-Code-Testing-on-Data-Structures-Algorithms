package StringAlgorithms;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LetterCombinationsOfPhoneNumberTest {

	@Test
	public void letterCombinationsOfPhoneNumber() {
		LetterCombinationsOfPhoneNumber.generateNumberToCharMap();
		
		int[] n1 = {};
		List<String> output1 = Arrays.asList("");
		assertTrue(LetterCombinationsOfPhoneNumber.printWords(n1, n1.length, 0, "").equals(output1));

		int[] n2 = { 2 };
		List<String> output2 = Arrays.asList("a", "b", "c");
		assertTrue(LetterCombinationsOfPhoneNumber.printWords(n2, n2.length, 0, "").equals(output2));

		int[] n3 = { 2, 3 };
		List<String> output3 = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
		assertTrue(LetterCombinationsOfPhoneNumber.printWords(n3, n3.length, 0, "").equals(output3));
		
		int[] n4 = { 2, 3, 4 };
		List<String> output4 = Arrays.asList("adg", "adh", "adi", "aeg", "aeh", "aei", "afg", "afh", "afi", "bdg",
				"bdh", "bdi", "beg", "beh", "bei", "bfg", "bfh", "bfi", "cdg", "cdh", "cdi", "ceg", "ceh", "cei", "cfg",
				"cfh", "cfi");
		assertTrue(LetterCombinationsOfPhoneNumber.printWords(n4, n4.length, 0, "").equals(output4));
	}
}