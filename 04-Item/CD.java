package DataBase;

public class CD extends Item{ //CD extends Item CD成为Item的一个子类

	private String artist;
	private int numofTracks;

	
	public CD(String title, String artist, int numofTracks, int playingTime, String comment) {
		
//		super();
		super(title,playingTime, false, comment);//这里是调用了父类 item的构造器，把参数title传给父类的构造器来使用父类的构造器构造title
					//运行了该语句后，会转到其父类的传参的构造器中的 super();语句去
		
//		this.title = title; //这是子类自己的title的初始化
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
		
		CD cd = new CD("A","b",2,2,"^^……");
		System.out.println(":"+artist);
		
	}



}
