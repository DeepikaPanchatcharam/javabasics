package abc;
import java.util.Scanner;
public class Practice6 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter table");
		int t=sc.nextInt();
		System.out.println("enter table upto");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int c=i*t;
		
		
		System.out.println(i+"*"+t+"="+c);
		
	}}

}
