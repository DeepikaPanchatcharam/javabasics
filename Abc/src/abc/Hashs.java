package abc;
import java.util.HashMap;

public class Hashs {
	public static void main(String[]args) {
		HashMap <String,Integer> age=new HashMap<String,Integer>();
		age.put("aa",12 );
		age.put("bb", 21);
		age.put("cc", 34);
		System.out.println(age);
		age.replace("bb",21,34);
		System.out.println(age);
		age.remove("bb");
		System.out.println(age);
		System.out.println(age.get("cc"));
		
		
		
	}

}
