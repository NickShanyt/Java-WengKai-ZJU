package DataBase;

public class CD extends Item{ //CD extends Item CD��ΪItem��һ������

	private String artist;
	private int numofTracks;

	
	public CD(String title, String artist, int numofTracks, int playingTime, String comment) {
		
//		super();
		super(title,playingTime, false, comment);//�����ǵ����˸��� item�Ĺ��������Ѳ���title��������Ĺ�������ʹ�ø���Ĺ���������title
					//�����˸����󣬻�ת���丸��Ĵ��εĹ������е� super();���ȥ
		
//		this.title = title; //���������Լ���title�ĳ�ʼ��
		this.artist = artist;
		this.numofTracks = numofTracks;
//		this.playingTime = playingTime;
//		this.comment = comment;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void print() {
		// TODO Auto-generated method stub
		
		CD cd = new CD("A","b",2,2,"^^����");
		System.out.println(":"+artist);
		
	}



}
