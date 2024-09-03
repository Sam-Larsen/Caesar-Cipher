//package Assignment1;
import java.util.Scanner;
/* CaesarCipherTester class
 * A class that tests the CaesarCipher class
 * The test class recieves input from the user
 * and prints out all encryptions or decrytions
 * of the message passed based on user input.
 * 
 * Sam Larsen
 * Assignment name: Assignment 1
 * Assignment due date: 9/12/22
 * Written/online sources used: none
 * Help obtained: none
 * I confirm that the above list of sources is complete AND that I/we have not talked to anyone else about the solution to this problem.
 */
public class CaesarCipherTester {

	public static void main(String[] args) {
		/*
	     * TODO: interact with users for encrypting or
	     * decrypting messages as explained in the 
	     * assignment description.
	     */
	     Scanner in = new Scanner(System.in);
	     System.out.println("This program encrypts and decrypts messages using the Caesar Cipher.");
	     System.out.print("Would you like to encode or decode a message? ");
	     String response = in.nextLine();
	     if(response.equalsIgnoreCase("decode") || response.equalsIgnoreCase("encode")) {
	    	 
	    	 if(response.equalsIgnoreCase("decode")) {
	    		 System.out.print("Enter the string to decode: ");
		    	 String message = in.nextLine();
		    	 in.close();
	    		 for(int i = 0; i < 26; i++) {
	    			 System.out.println("n = " + i + ": " + CaesarCipher.decrypt(message, i));
	    		 }
	    	 }
	    	 else if(response.equalsIgnoreCase("encode")) {
	    		 System.out.print("Enter the string to encode: ");
		    	 String message = in.nextLine();
		    	 in.close();
	    		 for(int i = 0; i < 26; i++) {
	    			 System.out.println("n = " + i + ": " + CaesarCipher.encrypt(message, i));
	    		 }
	    	 }
	     }
	     else {
	    	 System.out.println("Valid options are \"encode\" or \"decode\"");
	    	 in.close();
	     }
	}

}
