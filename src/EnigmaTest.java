import java.util.*;
public class EnigmaTest {
private static String message;
public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	System.out.println("Gimme some text to encrypt!");
	message = input.nextLine();
	String revmes = new StringBuffer(EnigmaTest.getMessage()).reverse().toString();
	System.out.println(revmes);
	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	map = new HashMap<>();  
	//this maps char a to int 1 and so on
    map.put('a', 1);
    map.put('b', 2);
    map.put('c', 3);
    map.put('d', 4);
    map.put('e', 5);
    map.put('f', 6);
    map.put('g', 7);
    map.put('h', 8);
    map.put('i', 9);
    map.put('j', 10);
    map.put('k', 11);
    map.put('l', 12);
    map.put('m', 13);
    map.put('n', 14);
    map.put('o', 15);
    map.put('p', 16);
    map.put('q', 17);
    map.put('r', 18);
    map.put('s', 19);
    map.put('t', 20);
    map.put('u', 21);
    map.put('v', 22);
    map.put('w', 23);
    map.put('x', 24);
    map.put('y', 25);
    map.put('z', 26);
    map.put(' ', 27);
    for(final char c : revmes.toCharArray())
    {
        Integer values;

        values = map.get(c);

        if(values == null)
        {   
            // some sorta error
        }
        else
        {
            System.out.print(values + " ");
            //prints out int values from the revmes char array which is cool
        }
    }
    System.out.println("\nDoes u want me to decrypt this gibberish?");
    String potato = input.nextLine();
   if(potato .equalsIgnoreCase("yes")){
	   HashMap<Integer, Character> tap = new HashMap<Integer, Character>();
	   tap = new HashMap<>();  
       tap.put(1,'a');
       tap.put(2,'b');
       tap.put(3,'c');
       tap.put(4,'d');
       tap.put(5,'e');
       tap.put(6,'f');
       tap.put(7,'g');
       tap.put(8,'h');
       tap.put(9,'i');
       tap.put(10,'j');
       tap.put(11,'k');
       tap.put(12,'l');
       tap.put(13,'m');
       tap.put(14,'n');
       tap.put(15,'o');
       tap.put(16,'p');
       tap.put(17,'q');
       tap.put(18,'r');
       tap.put(19,'s'); 
       tap.put(20,'t');
       tap.put(21,'u');
       tap.put(22,'v');
       tap.put(23,'w');
       tap.put(24,'x');
       tap.put(25,'y');
       tap.put(26,'z');
       tap.put(27,' ');   
       System.out.println("This is a checker");
   }else{
	   System.out.println("Whatcha doing with those numbers? Oh well");
   }
}
public static String getMessage() {
	return EnigmaTest.message;
}
}

