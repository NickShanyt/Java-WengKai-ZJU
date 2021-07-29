package notebook;

import java.util.ArrayList;






public class Notebook {
	
	private ArrayList<String> notes = new ArrayList<String>();
	//ArrayList<String> �������String��ArrayList
	//������
	
	private int size=0;
	
	public void add(String s) //˳�����ʼ�s
	{
		notes.add(s);
	}
	
	public void addInLocation(int location,String s)//��ָ��λ�ü���ʼ�s
	{
		notes.add(location, s);
	}
	
	public int getSize() ////��ȡ���±���С
	{
//		return size;
		return notes.size();
	}
	
	public String getNote(int index)//��ȡindexλ�õ�����
	{
		return notes.get(index);
	}
	
	
	public void removeNote(int index)//�Ƴ�indexλ�õ�Ԫ��
	{
//		return notes.remove(index); //notes.remove(index) �÷�������ͻ᷵�ر�ɾ����Ԫ�أ���˲���return
		
		notes.remove(index);
		
	}
	
	public String[] list() //����һ������
	{
		String[] a = new String[notes.size()];
		
//		//�Լ���д����ֵ����
//		for(int i=0;i<notes.size();i++)
//		{
//			a[i]= notes.get(i);
//		}
		
		
		//ֱ�ӵ��÷��� toArray(a)
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
