package helloWorld;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World,ÄãºÃ£¬ÊÀ½ç");
		Scanner acprice = new Scanner(System.in);
//		System.out.println("echo: " + in.nextLine());¡¢
		int price;
		price = acprice.nextInt();
//		System.out.println("3+2="+5);
		if(price>10)
			System.out.println("Price over 10");
		else
			System.out.println("Price less 10");
	}

} 
