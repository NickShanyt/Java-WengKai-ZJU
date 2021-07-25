package otherFunction;

import java.util.Scanner;

public class 计算输入数字的位数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(4/10); //0 ，整型除法直接舍去小数
//		System.out.println(4.0/10); //0.4 浮点型除法保留小数
		Scanner in = new Scanner(System.in);
		int number =in.nextInt();
		int count=0;
		if(number<0)
		{
			 number=Math.abs(number);
		}
		if(number==0)  //关于0的判断，其实也可以通过do-while循环实现，就不用单独判断0
		{
			System.out.println(1);
		}
//		do
//		{
//			number=number/10;
//			count++;
//		}while(number>0); //注意，此处while是有分号的
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
