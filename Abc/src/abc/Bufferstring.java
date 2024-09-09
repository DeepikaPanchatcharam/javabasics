package abc;

public class Bufferstring {
	public static void main(String[]args) {
	StringBuffer name= new StringBuffer ("deep");
	name.append("ika");
	System.out.println(name);
	//append method
	
	name.insert(1, "e");
	System.out.println(name);
	//insert method
	
	name.replace(1,3,"ak");
	System.out.println(name);
	//replace method
	
	name.delete(2, 5);
	System.out.println(name);
	//delete method
	
	name.reverse();
	System.out.println(name);
	
	}

}
