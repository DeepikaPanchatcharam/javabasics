package abc;

public class Sample {
	public void studentname(String name) {
		System.out.println(name);
	}
	public void studentname(int age) {
		System.out.println(age);
	}
	public void studentname(char initial) {
		System.out.println(initial);
	}
	public static void main(String[]args) {
		Sample obj=new Sample();
		obj.studentname("LUNA");
		obj.studentname('A');
		obj.studentname(21);
		
	}

}
