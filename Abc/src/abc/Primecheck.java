package abc;


public class Primecheck {
	public static void main (String[]args) {
		int count=0;
		int c=0;
		for(int n=1; n<=10;n++) {
		count=0;
		for(int i=2; i<=n/2; i++) {
			if(n%i==0) {
				count++;}
			}
		if(count==0) {
			c++;}}
			System.out.println(c);
		
			
		}}
	


