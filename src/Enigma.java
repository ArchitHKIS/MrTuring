import java.util.HashMap;
import java.util.Map;
public class Enigma {
public static String revmes;


public Enigma(){
}
public void encrypt(String revmes){
	revmes = new StringBuffer(EnigmaTest.getMessage()).reverse().toString();
}
}
