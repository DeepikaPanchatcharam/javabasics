package abc;
import java.util.LinkedList;

public class Linkedlistss {
	public static void main(String[]args) {
		LinkedList <Integer> age=new LinkedList<Integer>();
		age.add(20);
		age.add(35);
		age.add(45);
		age.add(1,21);
		age.remove(3);
		System.out.println(age);
		System.out.println(age.get(2));
	}
	
	
	

}
