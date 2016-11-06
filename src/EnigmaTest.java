import java.util.*;
public class EnigmaTest {
public static String message;

public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	System.out.println("Gimme some text to encrypt!");
	message = input.nextLine();
	System.out.println(Enigma.revmes);
}
}

