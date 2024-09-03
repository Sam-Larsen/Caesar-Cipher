//package Assignment1;
/* CaesarCipher class
 * a class which implements methods to use
 * for simple Caesar cipher encryption and
 * decryption.
 * 
 * Sam Larsen
 * Assignment name: Assignment 1
 * Assignment due date: 9/12/22
 * Written/online sources used: none
 * Help obtained: none
 * I confirm that the above list of sources is complete AND that I/we have not talked to anyone else about the solution to this problem.
 */
public class CaesarCipher {

	/*
	 * TODO: define two methods that convert
	 * a letter to a character code and vice versa.
	 * Note that the character code needs to be in
	 * range 0-25. 
	 */
	
	/* charToNum
	 * takes a character and transforms it into
	 * the corresponding number from 0 - 25 to 
	 * represent its place in the alphabet.
	 */
	public static int charToNum(char c) {
		int num = (int)c;
		if(num >= (int) 'a' && num <= (int) 'z') {
			num -= (int)'a';
		}
		else if(num >= (int) 'A' && num <= (int)'Z'){
			num -= (int)'A';
		}
		return num;
	}
	
	/* numToChar
	 * Takes an in integer and returns a
	 * character that is equal to its place in 
	 * the alphabet.
	 */
	public static char numToChar(int num) {
		char c = (char)num;
		c += (int)'a';
		return c;
	}

	/*
	 * TODO: define a method that performs the
	 * modulo operation on a shifted letter. 
	 */
	
	/* remainder
	 * Takes an int and returns an int
	 * between 0 and 25 based on the 
	 * remainder of the integer.
	 */
	public static int remainder(int n) {
		return (n+26)%26;
	}
	
	/*
	 * TODO: define two methods for encrypting
	 * and decrypting letters using a given constant integer. 
	 * These methods make calls to the methods explained 
	 * above.  
	 */
	
	/* encrypt
	 * takes a string and an integer and returns
	 * a string were all the characters are individually
	 * shifted forward in the alphabet n times.
	 */
	public static String encrypt(String s, int n) {
		char[] ar = s.toCharArray();
		int x;
		for(int i = 0; i < s.length(); i++) {
			x = charToNum(ar[i]);
			x += n;
			x = remainder(x);
			ar[i] = numToChar(x);
		}
		return new String(ar);
	}
	
	/* decrypt
	 * takes a string and an integer and returns
	 * a string were all the characters are individually
	 * shifted backwards in the alphabet n times.
	 */
	public static String decrypt(String s, int n) {
		char[] ar = s.toCharArray();
		int x;
		for(int i = 0; i < s.length(); i++) {
			x = charToNum(ar[i]);
			x -= n;
			x = remainder(x);
			ar[i] = numToChar(x);
		}
		return new String(ar);
	}
	 
}
