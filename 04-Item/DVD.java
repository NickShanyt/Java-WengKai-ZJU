package DataBase;

public class DVD extends Item{
	private String title; //�������Ѿ���title��������������DVDҲ���Լ���title
	private String director;



	
	public DVD(String title, String director, int playingTime, String comment) {
		super(title,playingTime,false,comment); //����ø����У�����Ҫ��������Ĺ������� ���캯��
				//�������û�д��ݲ�����super()����������Զ�ȥ���ø����в���Ҫ���εĹ�����
		
				//����û�и�super()��䣬������Զ���ȥ���ø����� ����Ҫ���εĹ�����
		
		//����2��title��һ���ǴӸ���̳еģ�һ�����Լ���
		this.title = title; //������ָ�Լ���title
		//�ڸ����У���title���в������ǶԸ����Լ���title���в���

		
		setTitle("��������DVD��title��ʼ��"); //���ø���ķ���
		this.director = director;
//		this.playingTime = playingTime;
//		this.comment = comment;
	}

	public void print()
	{
		System.out.println("DVD");
		super.print();//�˴��ǵ��ø���� print����Ϊ��������Ҳ����Ϊ print�ķ���
						//���Ǵ˴���Ҫ���õ��Ǹ����print����
		System.out.println(director);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DVD dvd = new DVD("A","B",1,"..");
		dvd.print(); //dvd�����Լ���print

	}

}
