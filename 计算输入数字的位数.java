package otherFunction;

import java.util.Scanner;

public class �����������ֵ�λ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(4/10); //0 �����ͳ���ֱ����ȥС��
//		System.out.println(4.0/10); //0.4 �����ͳ�������С��
		Scanner in = new Scanner(System.in);
		int number =in.nextInt();
		int count=0;
		if(number<0)
		{
			 number=Math.abs(number);
		}
		if(number==0)  //����0���жϣ���ʵҲ����ͨ��do-whileѭ��ʵ�֣��Ͳ��õ����ж�0
		{
			System.out.println(1);
		}
//		do
//		{
//			number=number/10;
//			count++;
//		}while(number>0); //ע�⣬�˴�while���зֺŵ�
		else 
		{
			
		while(number!=0)
		{
			number=number/10;
			count++;
		}
		System.out.println(count);
		}
	}

}
