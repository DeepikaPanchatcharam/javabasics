package abc;
import java.util.Scanner;

public class Excephand {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter name");
		String a=sc.nextLine();
		try {
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("hello");
	}

}
