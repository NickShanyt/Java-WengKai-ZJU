package Coin;

import java.util.HashMap;
import java.util.Scanner;

public class Coin {
	
	private HashMap<Integer,String> coinnames = new HashMap<Integer,String>();
	//在容器中，所有的数据类型必须是对象，而不能是基本元素，因此必须使用 Integer而不是int
	
	public Coin()
	{
		coinnames.put(1, "penny");
		coinnames.put(5, "dime");
		coinnames.put(25, "quarter");
		coinnames.put(50, "half-dolar");
		coinnames.put(50, "五毛"); //HashMap中键值对中的 键 是唯一的，相同的 键 只认最后一次的
	
	
	}
	
//coinnames.keySet() //得到coinnames这个哈希表中的键值对中的 键 的集合

	public String getName(int amount)
	{	
		if(coinnames.containsKey(amount)) //这里做了异常处理
		{
			return coinnames.get(amount);
		}
		else
		{
			return "NOT FOUND";
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int amount=in.nextInt();
		Coin coin = new Coin();
		String name = coin.getName(amount);
		System.out.println(name);
	}

}
