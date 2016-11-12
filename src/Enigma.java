import java.util.HashMap;
import java.util.Map;
public class Enigma {
	
public String hello(){
	return "Hello, What do you want me to encrypt?";
}
public String glgl(String message){
	return "glgl "+message+" glgl";
}
public String reverse(String message){
	return new StringBuffer(message).reverse().toString();
}
public void encrypt(String message){
	HashMap<Character, Character> map = new HashMap<Character, Character>();
	map = new HashMap<>();
	//this use hashmap method to map char a to special characters such as ! and @ and so on
	map.put('a', '!');map.put('b', '@');
	map.put('c', '#');map.put('d', '$');
	map.put('e', '%');map.put('f', '^');
	map.put('g', '&');map.put('h', '*');
	map.put('i', '(');map.put('j', ')');
	map.put('k', '-');map.put('l', '_');
	map.put('m', '=');map.put('n', '+');
	map.put('o', '[');map.put('p', ']');
	map.put('q', '{');map.put('r', '}');
	map.put('s', '|');map.put('t', ';');
	map.put('u', ':');map.put('v', '/');
	map.put('w', '.');map.put('x', 'ç');
	map.put('y', '<');map.put('z', '>');
	map.put(' ', '?');
	for (final char c : message.toCharArray()) {
		char values = map.get(c);
		if (values == 0) {
			//OH OH
			// some sorta error
		} else {
			// prints out special values from the revmes char array which is cool
			char dobo = values;
			System.out.print(dobo);
		}	
}	
	}
public String oui(){
	return "You wanna decrypt this?";
}

	public void decryption(String message){
	HashMap<Character, Character> tap = new HashMap<Character, Character>();
	tap = new HashMap<>();
	tap.put('!', 'a');tap.put('@', 'b');
	tap.put('#', 'c');tap.put('$', 'd'); 
	tap.put('%', 'e');tap.put('^', 'f');
	tap.put('&', 'g');tap.put('*', 'h');
	tap.put('(', 'i');tap.put(')', 'j');
	tap.put('-', 'k');tap.put('_', 'l');
	tap.put('=', 'm');tap.put('+', 'n');
	tap.put('[', 'o');tap.put(']', 'p');
	tap.put('{', 'q');tap.put('}', 'r');
	tap.put('|', 's');tap.put(';', 't');
	tap.put(':', 'u');tap.put('/', 'v');
	tap.put('.', 'w');tap.put('ç', 'x');
	tap.put('<', 'y');tap.put('>', 'z');
	tap.put('?', ' ');
	for (final char d : message.toCharArray()) {
		//for every element in the string which will be converted as an array, it does this cool stuff.
			Character dalues = tap.get(d);
			//exchanges the special characters with normal characters for final stuff. 
			System.out.print(dalues);	
			}
}

}
