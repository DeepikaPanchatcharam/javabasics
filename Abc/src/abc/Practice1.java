package abc;
import java.util.Scanner;
public class Practice1 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a integer");
		int a=sc.nextInt();
		if(a%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		
	}

}
