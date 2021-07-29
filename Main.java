package Main;

import java.util.Scanner;



public class Main {



	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Fraction a = new Fraction(in.nextInt(), in.nextInt());

		Fraction b = new Fraction(in.nextInt(),in.nextInt());

		a.print();

		b.print();

		a.plus(b).print();

		a.multiply(b).plus(new Fraction(5,6)).print(); 
		//输入的两数先乘，后再加上5/6

		a.print();

		b.print();

		in.close();

	}
 
}

class Fraction{
	int a;
	int b;
	double ab;
	
	Fraction(int a,int b)
	{
		this.a=a;
		this.b=b;
		ab=a/b;
	}
	public double ToDouble() //将粉书转换为double
	{

		return (double)ab;
	}
	
	public Fraction plus(Fraction r)
	{
		int bp=this.b * r.b; //未经化简得分母
		int ap1=this.a * r.b; 
		int ap2=r.a *this.b; //ap1+ap2为未经化简得分子
		//考虑化简，利用最大公约数进行化简-直接用之前写过得方法
		int gcd = gcDivisor(ap1+ap2,bp);
		Fraction plus = new Fraction((ap1+ap2)/gcd,bp/gcd);
		return plus;
	}
	private int gcDivisor(int a,int b)
	{
		int r;
		while(b!=0)
		{
			r=a%b;
			a=b;
			b=r;
		}
		return a;
	}
	
	public Fraction multiply(Fraction r)
	{
		Fraction mul = new Fraction(this.a * r.a,this.b * r.b);
		System.out.println("输入两个分数相乘="+mul.a+"/"+mul.b);
		return mul;
	}
	public void print()
	{
		if(this.a==1 && this.b==1)
		{
			System.out.println("1");
		}
		else {
			System.out.println((this.a)+"/"+(this.b));
		}
	}
}