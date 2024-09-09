package abc;
import java.util.Scanner;

public class Practice5 {
	public static void main (String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value");
		int n=sc.nextInt();
		if(100>=n && n>=91) {
			System.out.println("a grade");
			
		}
		else if(90>=n&& n>=81 ) {
			System.out.println("b grade");
		}
		else if(80>=n&&n>=71){
			System.out.println("c garde");
			
		}
		else if(70>=n&&n>=1) {
			System.out.println("fail");
		}
	}

}
