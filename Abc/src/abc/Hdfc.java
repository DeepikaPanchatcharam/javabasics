package abc;

public class Hdfc extends Bank{
	public void current() {
		System.out.println("current");
	}
	public void savings() {
		System.out.println("savings");
	}
	public static void main(String[]args) {
		Hdfc obj=new Hdfc();
		obj.current();
		obj.salary();
		obj.savings();
		
	}

}
