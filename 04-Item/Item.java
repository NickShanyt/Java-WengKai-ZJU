package DataBase;

public class Item {
//	protected String title; //�����ǿ��Եģ�����title�Ĺ������Ҫ���������
	//����������� title�Ĺ����ڸ��������
	
	private String title;
	private int playingTime;
	private boolean gotIt=false;
	private String comment;
	
	public Item()
	{
		
	}
	

	public Item(String title, int playingTime, boolean gotIt, String comment) {
		super();
		this.title = title;
		//�ڸ����У���title���в������ǶԸ����Լ���title���в���

		this.playingTime = playingTime;
		this.gotIt = gotIt;
		this.comment = comment;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public void setTitle(String title) {
		this.title = title; //�Ӹ��������title���в���
	}
	
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(title);
		
	}

}
