package StringAlgorithms;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class AllStringTesting {

Anagram nm = new Anagram();
	
	@Test	
	public void testAnagram1() {
		assertEquals(true, nm.approach1("lead", "deal"));
		assertEquals(true, nm.approach1("abdce", "edcba"));
		assertEquals(false, nm.approach1("aaaaa", "aaa"));
		assertEquals(false, nm.approach1("anmlo", "!@#$%"));
		assertEquals(true, nm.approach1("wowow", "wwwoo"));
	}
	
	@Test	
	public void testAnagram2() {
		assertEquals(true, nm.approach2("lead", "deal"));
		assertEquals(true, nm.approach2("abdce", "edcba"));
		assertEquals(false, nm.approach2("aaaaa", "aaa"));
		assertEquals(false, nm.approach2("anmlo", "lllll"));
		assertEquals(true, nm.approach2("wowow", "wwwoo"));
	}
	
	@Test	
	public void testAnagram3() {
		assertEquals(true, nm.approach3("lead", "deal"));
		assertEquals(true, nm.approach3("abdce", "edcba"));
		assertEquals(false, nm.approach3("aaaaa", "aaa"));
		assertEquals(false, nm.approach3("anmlo", "ppppp"));
		assertEquals(true, nm.approach3("wowow", "wwwoo"));
	}
	
	@Test	
	public void testAnagram4() {
		assertEquals(true, nm.approach4("lead", "deal"));
		assertEquals(true, nm.approach4("abdce", "edcba"));
		assertEquals(false, nm.approach4("aaaaa", "aaa"));
		assertEquals(false, nm.approach4("anmlo", "hhhhh"));
		assertEquals(true, nm.approach4("wowow", "wwwoo"));
	}
	
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
	
	@Test
	public void testMyAtoi() {
		MyAtoi atoi = new MyAtoi();
		
		assertEquals(1234, atoi.myAtoi("1234"));
		assertEquals(10000, atoi.myAtoi("10000"));
		assertEquals(0, atoi.myAtoi("0"));
		assertEquals(0, atoi.myAtoi("00000"));
		assertEquals(-100, atoi.myAtoi("-100"));
		assertEquals(-199, atoi.myAtoi("-199"));
		assertEquals(-199, atoi.myAtoi("-199.25"));
		assertEquals(-2147483648, atoi.myAtoi("-199999999999999999"));
		assertEquals(2147483647, atoi.myAtoi("9199999999999999999"));
		assertEquals(876, atoi.myAtoi("+876"));
		assertEquals(0, atoi.myAtoi("*&^%$#@!()"));
		assertEquals(-452, atoi.myAtoi("-452"));
		assertEquals(101, atoi.myAtoi("+101"));
		assertEquals(-999, atoi.myAtoi("-999.99"));
		assertEquals(0, atoi.myAtoi("."));
		assertEquals(2147483647, atoi.myAtoi("9999999999"));
		assertEquals(-2147483648, atoi.myAtoi("-9999999999"));	
		assertEquals(-1111111111, atoi.myAtoi("-1111111111"));
		assertEquals(1111111111, atoi.myAtoi("1111111111"));
		assertEquals(0, atoi.myAtoi("-0000"));
		assertEquals(0, atoi.myAtoi("+0000000000"));
		assertEquals(2147483647, atoi.myAtoi("9876543210"));
		assertEquals(123456789, atoi.myAtoi("0123456789"));
		assertEquals(4193, atoi.myAtoi("4193 with words"));
		assertEquals(-42, atoi.myAtoi("   -42"));		
	}
	
	@Test
	public void testPalindrome() {
		assertEquals(true, Palindrome.isPalindrome(null));
		assertEquals(true, Palindrome.isPalindrome(""));
		assertEquals(true, Palindrome.isPalindrome("a"));
		assertEquals(true, Palindrome.isPalindrome("aba"));
		assertEquals(true, Palindrome.isPalindrome("aaaa"));
		assertEquals(false, Palindrome.isPalindrome("abc"));
		assertEquals(true, Palindrome.isPalindrome("abcba"));
		assertEquals(false, Palindrome.isPalindrome("!@#$%^&"));
		assertEquals(true, Palindrome.isPalindrome("aabbcbbaa"));
		assertEquals(true, Palindrome.isPalindrome("abba"));
		assertEquals(false, Palindrome.isPalindrome("aaabba"));
		assertEquals(true, Palindrome.isPalindrome("kayak"));
		assertEquals(true, Palindrome.isPalindrome("123321"));
		assertEquals(true, Palindrome.isPalindrome("1234321"));
		assertEquals(false, Palindrome.isPalindrome("abc123"));
		assertEquals(false, Palindrome.isPalindrome("kayaks"));
	}
	
	@Test
	public void testPalindromeRecursive() {
		assertEquals(true, Palindrome.isPalindromeRecursion(null));
		assertEquals(true, Palindrome.isPalindromeRecursion(""));
		assertEquals(true, Palindrome.isPalindromeRecursion("a"));
		assertEquals(true, Palindrome.isPalindromeRecursion("aba"));
		assertEquals(true, Palindrome.isPalindromeRecursion("aaaa"));
		assertEquals(false, Palindrome.isPalindromeRecursion("abc"));
		assertEquals(true, Palindrome.isPalindromeRecursion("abcba"));
		assertEquals(false, Palindrome.isPalindromeRecursion("!@#$%^&"));
		assertEquals(true, Palindrome.isPalindromeRecursion("aabbcbbaa"));
		assertEquals(true, Palindrome.isPalindromeRecursion("abba"));
		assertEquals(false, Palindrome.isPalindromeRecursion("aaabba"));
		assertEquals(true, Palindrome.isPalindromeRecursion("kayak"));
		assertEquals(true, Palindrome.isPalindromeRecursion("123321"));
		assertEquals(true, Palindrome.isPalindromeRecursion("1234321"));
		assertEquals(false, Palindrome.isPalindromeRecursion("abc123"));
		assertEquals(false, Palindrome.isPalindromeRecursion("kayaks"));	
	}
	
	@Test
	public void testPalindromeTwoPointer() {
		assertEquals(true, Palindrome.isPalindromeTwoPointer(null));
		assertEquals(true, Palindrome.isPalindromeTwoPointer(""));
		assertEquals(true, Palindrome.isPalindromeTwoPointer("a"));
		assertEquals(true, Palindrome.isPalindromeTwoPointer("aba"));
		assertEquals(true, Palindrome.isPalindromeTwoPointer("aaaa"));
		assertEquals(false, Palindrome.isPalindromeTwoPointer("abc"));
		assertEquals(true, Palindrome.isPalindromeTwoPointer("aabbcbbaa"));
		assertEquals(true, Palindrome.isPalindromeTwoPointer("abba"));
		assertEquals(false, Palindrome.isPalindromeTwoPointer("aaabba"));
		assertEquals(true, Palindrome.isPalindromeTwoPointer("abcba"));
		assertEquals(false, Palindrome.isPalindromeTwoPointer("!@#$%^&"));
		assertEquals(true, Palindrome.isPalindromeTwoPointer("kayak"));
		assertEquals(true, Palindrome.isPalindromeTwoPointer("123321"));
		assertEquals(true, Palindrome.isPalindromeTwoPointer("1234321"));
		assertEquals(false, Palindrome.isPalindromeTwoPointer("abc123"));
		assertEquals(false, Palindrome.isPalindromeTwoPointer("kayaks"));
	}

}
