import java.util.*;

public class EnigmaTest {
	private static String message;

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Gimme some text to encrypt!");
		message = input.nextLine();
		message = "glgl " + message + " glgl";
		// System.out.println(message);
		String revmes = new StringBuffer(EnigmaTest.getMessage()).reverse().toString();
		revmes = revmes.toLowerCase();
		System.out.println(revmes);
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map = new HashMap<>();
		// this use hashmap method to map char a to special characters such as ! and @ and so on
		map.put('a', '!');
		map.put('b', '@');
		map.put('c', '#');
		map.put('d', '$');
		map.put('e', '%');
		map.put('f', '^');
		map.put('g', '&');
		map.put('h', '*');
		map.put('i', '(');
		map.put('j', ')');
		map.put('k', '-');
		map.put('l', '_');
		map.put('m', '=');
		map.put('n', '+');
		map.put('o', '[');
		map.put('p', ']');
		map.put('q', '{');
		map.put('r', '}');
		map.put('s', '|');
		map.put('t', ';');
		map.put('u', ':');
		map.put('v', '/');
		map.put('w', '.');
		map.put('x', 'ç');
		map.put('y', '<');
		map.put('z', '>');
		map.put(' ', '?');
		for (final char c : revmes.toCharArray()) {

			char values = map.get(c);

			if (values == 0) {
				// some sorta error
			} else {
				// System.out.print(values + " ");
				// prints out int values from the revmes char array which is
				// cool
				char bobo = values;
				System.out.print(bobo);
			}
		}
		System.out.println("\nInput the text above to decrypt!");
		String weird = input.nextLine();
		char[] charArray = weird.toCharArray();
		String pototo = Arrays.toString(charArray);
		System.out.println(pototo);
		System.out.println("Do you want me to decrypt this gibberish?");
		String potato = input.nextLine();
		if (potato.equalsIgnoreCase("yes") || potato.equalsIgnoreCase("oui")) {
			HashMap<Character, Character> tap = new HashMap<Character, Character>();
			tap = new HashMap<>();
			tap.put('!', 'a');
			tap.put('@', 'b');
			tap.put('#', 'c');
			tap.put('$', 'd');
			tap.put('%', 'e');
			tap.put('^', 'f');
			tap.put('&', 'g');
			tap.put('*', 'h');
			tap.put('(', 'i');
			tap.put(')', 'j');
			tap.put('-', 'k');
			tap.put('_', 'l');
			tap.put('=', 'm');
			tap.put('+', 'n');
			tap.put('[', 'o');
			tap.put(']', 'p');
			tap.put('{', 'q');
			tap.put('}', 'r');
			tap.put('|', 's');
			tap.put(';', 't');
			tap.put(':', 'u');
			tap.put('/', 'v');
			tap.put('.', 'w');
			tap.put('ç', 'x');
			tap.put('<', 'y');
			tap.put('>', 'z');
			tap.put('?', ' ');
			for (final char d : weird.toCharArray()) {
				//System.out.print(d);
					Character dalues = tap.get(d);
					//exchanges the special characters with normal characters for final stuff. 
					System.out.print(dalues);
				
			}
		//now reverse the message
		System.out.println("\nInput the text above again pls");
		String close = input.nextLine();
		close = close.replace("lglg","");
		System.out.println(close);
		String revmes2 = new StringBuffer(close).reverse().toString();
		System.out.println(revmes2);
		} else {
			System.out.println("Whatcha doing with those numbers? Oh well");
		}
	}

	public static String getMessage() {
		return EnigmaTest.message;
	}
}
