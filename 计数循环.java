package otherFunction;

public class 计数循环 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=100;
		while(count>0) //如果是>=0,则是101轮。因为count==0时，还会再执行一次
		{
			count--;
			System.out.println(count);
		}
		System.out.println("count="+count);
		System.out.println("结束");
	}

}
//如果要模拟运行一个很大次数的循环，可以模拟较少的循环次数，然后作出推断