package abc;
import java.util.Scanner;

public class Practice7 {
	public static void main(String[]args) {
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of elements you want to arrange");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter all digits");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
	
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if( a[i]> a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;					
				}
			}
		}
		System.out.println("ascending order is");
		for(int i=0;i<=n-2;i++) {
			System.out.print(a[i]+",");
		}
		System.out.print(a[n-1]);
	}
	
}
