package Coin;

import java.util.HashMap;
import java.util.Scanner;

public class Coin {
	
	private HashMap<Integer,String> coinnames = new HashMap<Integer,String>();
	//�������У����е��������ͱ����Ƕ��󣬶������ǻ���Ԫ�أ���˱���ʹ�� Integer������int
	
	public Coin()
	{
		coinnames.put(1, "penny");
		coinnames.put(5, "dime");
		coinnames.put(25, "quarter");
		coinnames.put(50, "half-dolar");
		coinnames.put(50, "��ë"); //HashMap�м�ֵ���е� �� ��Ψһ�ģ���ͬ�� �� ֻ�����һ�ε�
	
	
	}
	
//coinnames.keySet() //�õ�coinnames�����ϣ���еļ�ֵ���е� �� �ļ���

	public String getName(int amount)
	{	
		if(coinnames.containsKey(amount)) //���������쳣����
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
