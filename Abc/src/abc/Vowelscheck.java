package abc;
import java.util.Scanner;

public class Vowelscheck {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String a=sc.nextLine();
		int vowels=0;
		int nonvowels=0;
		for(int i=0;i<a.length();i++) {
			char ch=a.charAt(i);
			if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U') {
				vowels++;
			}
			else {
				nonvowels++;
			}
		}System.out.println(vowels);
		System.out.println(nonvowels);
	}

}
