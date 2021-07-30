package DataBase;

import java.util.ArrayList;

public class Database {
	//Database这个类中的成员变量是一个自己创建的名为CD的类的对象
//	private ArrayList<CD> listCD = new ArrayList<CD>();
	
//	private ArrayList<DVD> listDCD = new ArrayList<DVD>(); //不适用的代码复制
	
	private ArrayList<Item> listItem = new ArrayList<Item>();
	
//	public void add(CD cd)
//	{
//		listCD.add(cd);
//	}
	public void add(Item item)
	{
		listItem.add(item);
	}
	
	public void list()
	{
//		for(CD cd :listCD)
//		{
//			cd.print();
//		}
		for(Item item : listItem)
		{
			item.print();
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Database db = new Database();
       db.add(new CD("songs", "me", 5, 80, "nice"));
       db.add(new CD("songs2", "me2", 5, 80, "nice"));
       db.list();
	}

}
