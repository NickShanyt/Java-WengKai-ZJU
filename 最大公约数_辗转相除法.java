package otherFunction;

import java.util.Scanner;

public class 最大公约数_辗转相除法 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int a= in.nextInt();
		int b= in.nextInt();
		int ua=a;
		int ub=b;
		int r;
		while(b!=0)
		{
			r=a%b;
			a=b;
			b=r;
		}
		System.out.println(ua+"和"+ub+"的最大公约数为："+ a);
	}

}
