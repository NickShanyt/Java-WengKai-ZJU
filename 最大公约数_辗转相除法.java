package otherFunction;

import java.util.Scanner;

public class ���Լ��_շת����� {

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
		System.out.println(ua+"��"+ub+"�����Լ��Ϊ��"+ a);
	}

}
