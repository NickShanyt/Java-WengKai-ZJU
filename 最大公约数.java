package otherFunction;

import java.util.Scanner;

public class ���Լ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int a= in.nextInt();
		int b=in.nextInt();
		int ua=a;
		int ub=b;
		int max=0;
		for(int i=1;i<=a&&i<=b;i++)
		{
			if(ua%i==0 && ub%i==0)
			{
				max=i;			}
		}
		System.out.println(a+"��"+b+"�����Լ��Ϊ��"+max);

	}

}
