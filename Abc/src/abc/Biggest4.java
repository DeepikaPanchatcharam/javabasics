package abc;
import java.util.Scanner;

public class Biggest4 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 4 number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		if(a>b && a>c && a>d) {
			System.out.println(a +" is big");
		}
		else if(b>a && b>c && b>d) {
			System.out.println("b is big");
		}
		else if(c>a && c>b && c>d) {
			System.out.println("c is big");
		}
		else {
			System.out.println("d is big");
		}
	}

}
