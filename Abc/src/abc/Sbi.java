package abc;

public class Sbi implements Banking {
	public void savings(){
		System.out.println("savings");
	}
	public void salary(){
		System.out.println("salary");
	}

public void main (String[]args) {
	Sbi obj=new Sbi();
	obj.salary();
	obj.savings();
	
}
}
