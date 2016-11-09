import java.util.*;

public class EnigmaTest {
	private static String message;

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Gimme some text to encrypt!");
		message = input.nextLine();
		message = "bobo "+message +" bobo";
		//System.out.println(message);
		String revmes = new StringBuffer(EnigmaTest.getMessage()).reverse().toString();
		System.out.println(revmes);
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map = new HashMap<>();
		// this use hashmap method to map char a to int 1 and so on
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
		map.put('x', ',');
		map.put('y', '<');
		map.put('z', '>');
		map.put(' ', '?');
		char[] numbers = new char[message.length()];
		
		int count = 0;
		for (final char c : revmes.toCharArray()) {

			char values = map.get(c);

			if (values == 0) {
				// some sorta error
			} else {
				// System.out.print(values + " ");
				// prints out int values from the revmes char array which is cool
				char bobo = values;
				System.out.print(bobo);	
			}
			}
		System.out.println("\nInput the text above to decrypt!");
		String weird = input.nextLine();
		//String[] strArray = new String[] {weird};
		//System.out.println("\n"+strArray[1]);
		String[] s = weird.split("");
		String pototo = Arrays.toString(s);
		System.out.println(pototo);
	
	System.out.println("Does u want me to decrypt this gibberish?");
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
			tap.put(',', 'x');
			tap.put('<', 'y');
			tap.put('>', 'z');
			tap.put('?', ' ');
			for (final char d : pototo.toCharArray()) {
				char dalues = tap.get(d);
				System.out.println("test");
				if (dalues == 0) {
					// some sorta error
				} else {
					// System.out.print(values + " ");
					// prints out int values from the revmes char array which is cool
					char dobo = dalues;
					System.out.println(dobo);	
				}
				}
			System.out.println("This is a checker");
		} else {
			System.out.println("Whatcha doing with those numbers? Oh well");
		}
}

	public static String getMessage() {
		return EnigmaTest.message;
	}
}
