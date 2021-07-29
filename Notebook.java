package notebook;

import java.util.ArrayList;






public class Notebook {
	
	private ArrayList<String> notes = new ArrayList<String>();
	//ArrayList<String> 用来存放String的ArrayList
	//泛型类
	
	private int size=0;
	
	public void add(String s) //顺序加入笔记s
	{
		notes.add(s);
	}
	
	public void addInLocation(int location,String s)//在指定位置加入笔记s
	{
		notes.add(location, s);
	}
	
	public int getSize() ////获取记事本大小
	{
//		return size;
		return notes.size();
	}
	
	public String getNote(int index)//获取index位置的内容
	{
		return notes.get(index);
	}
	
	
	public void removeNote(int index)//移除index位置的元素
	{
//		return notes.remove(index); //notes.remove(index) 该方法本身就会返回被删除的元素，因此不用return
		
		notes.remove(index);
		
	}
	
	public String[] list() //复制一个容器
	{
		String[] a = new String[notes.size()];
		
//		//自己手写并赋值复制
//		for(int i=0;i<notes.size();i++)
//		{
//			a[i]= notes.get(i);
//		}
		
		
		//直接调用方法 toArray(a)
		notes.toArray(a);
		
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = new String[2];
		a[0]="first";
		a[1]="secode";
		Notebook nv= new Notebook();
		
		nv.add("FirstTest");
		nv.addInLocation(0,"sEC");
		System.out.println(nv.getNote(0));
		System.out.println(nv.getNote(1));

		String[] NewNotes = nv.list();
		for(String s :NewNotes)
		{
			System.out.println(s);
		}

		
//		
//		ArrayList<String> abc= new ArrayList<String>();
//		abc.add("111");
//		abc.add("222");
//		for( String s:abc)
//		{
//			System.out.println(s);
//			s="AAAA";
//			System.out.println(s);
//		}
//		
	}

}
