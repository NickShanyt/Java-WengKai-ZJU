package otherFunction;

import java.util.Scanner;

public class 计算平均数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("要计算多少个数的平均数？");

		 Scanner in = new Scanner(System.in);
		 int nums=in.nextInt();
		 int count=nums;
		 int sum=0;
		 if(nums<=0)
		 {
			 System.out.println("请至少输入一个数字");
		 }
		 else
		 {
		 //while循环
		 System.out.println("请分别输入这些数字：");

		 while(count>0)
		 {
			 Scanner num=new Scanner(System.in);
			 int single_num=num.nextInt();
			 sum=sum+single_num;
			 count--;
		 }
		 
		 System.out.println("平均数为："+(double)(sum/nums));
	}

}
}
