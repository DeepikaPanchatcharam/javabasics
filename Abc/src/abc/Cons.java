package abc;

public class Cons {
	public Cons(){
		System.out.println("constructor");
		
	}
public Cons(int a){
	System.out.println(a);
	
		
	}
	public static void main (String[]args) {
		Cons obj=new Cons();
		Cons obj1=new Cons(21);
		
	}

}
