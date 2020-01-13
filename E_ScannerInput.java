package lecture2_GettingStartedWithJava;

import java.util.Scanner;

public class E_ScannerInput {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
//		int a,b;
//		a=s.nextInt();
//		b=s.nextInt();
//		int c=a+b;
//		System.out.println(c);
		
		
//		a=s.nextDouble();
//		a=s.nextLong();
		
		String str2=s.nextLine();//Line Input
		System.out.println(str2);
		
		String str=s.next();//Word Input
		System.out.println(str);
	
		
		// For character input s.nextChar() is not present
		char ch=s.next().charAt(0);
		System.out.println(ch);
	}

}
