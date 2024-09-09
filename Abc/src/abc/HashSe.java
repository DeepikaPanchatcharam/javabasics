package abc;
import java.util.HashSet;

public class HashSe {
	public static void main(String[]args) {
		HashSet <String>country =new HashSet<String>();
		country.add("india");
		country.add("paki");
		country.add("uk");

		System.out.println(country.contains("india"));
		System.out.println(country.contains("russia"));
		
	}

}
