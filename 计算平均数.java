package otherFunction;

import java.util.Scanner;

public class ����ƽ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Ҫ������ٸ�����ƽ������");

		 Scanner in = new Scanner(System.in);
		 int nums=in.nextInt();
		 int count=nums;
		 int sum=0;
		 if(nums<=0)
		 {
			 System.out.println("����������һ������");
		 }
		 else
		 {
		 //whileѭ��
		 System.out.println("��ֱ�������Щ���֣�");

		 while(count>0)
		 {
			 Scanner num=new Scanner(System.in);
			 int single_num=num.nextInt();
			 sum=sum+single_num;
			 count--;
		 }
		 
		 System.out.println("ƽ����Ϊ��"+(double)(sum/nums));
	}

}
}
