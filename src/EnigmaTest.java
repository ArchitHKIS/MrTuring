import java.util.*;
public class EnigmaTest {
	public static void main(String args[]) {
		Enigma bobo = new Enigma();
		// makes new Enigma to call methods and execute them
		Scanner input = new Scanner(System.in);
		System.out.println(bobo.hello());
		// prints hello and prompts user to input alphabets to be encrypted
		String message = input.nextLine();
		String glgl = bobo.glgl(message);
		// add "glgl " to the message that confuses other people
		String revmes = bobo.reverse(glgl);
		// reverses message
		revmes = revmes.toLowerCase();
		// uses .toLowerCase() method to make all the text lower case
		bobo.encrypt(revmes);
		// using the hashmap function to make one letter mapped to a special
		// character
		System.out.println("\n" + bobo.oui());
		// asks if it wants to decrypt text
		String potato = input.nextLine();
		if (potato.equalsIgnoreCase("yes") || potato.equalsIgnoreCase("oui") || potato.equalsIgnoreCase("y")) {
			// yes or oui statement to continue with the code to decrypt
			System.out.println("Type your encrypted text below");
			String encrypted = input.nextLine();
			int l = encrypted.length();
			// finds length of the string that will be later used to remove the
			// glgl part
			if(l == 0){
				System.out.println("You didn't input any text. :P");
			}else{
			encrypted = encrypted.substring(5, l-5);
			// removes glgl from the encrypted part of the code
			bobo.decryption(encrypted);
			// decrypts the text using hashmaps,
			System.out.println("\nType text below");
			String reversed = input.nextLine();
			reversed = bobo.reverse(reversed);
			// using the same reversed method, it reverses the text.
			System.out.println(reversed);
		}}else {
			System.out.println("Not decrypted text. Or is it?");
			// if you say no or anything other than yes, oui, y then it is going
			// to print this.
		}
	}
}
