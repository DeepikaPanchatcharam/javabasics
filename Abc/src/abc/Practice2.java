package abc;
import java.util.Scanner;
public class Practice2 {
	public static void main(String[]args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter digits");
		 a=sc.nextInt();
		 b=sc.nextInt();
		 c=a;
		 a=b;
		 b=c;
		 System.out.println("swapped numbers "+a+" " +b);
		
	}

}
