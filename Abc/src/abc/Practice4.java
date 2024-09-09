package abc;
import java.util.Scanner;
public class Practice4 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a digit");
		int a=sc.nextInt();
		int i=0;int j = 0; 
		while(a>0) {
			i=a%10;
			j=(j*10)+i;
			a=a/10;
		}
			System.out.println(j);
			
		
	}

}
