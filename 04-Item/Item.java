package DataBase;

public class Item {
//	protected String title; //这样是可以的，但是title的构造就需要在子类完成
	//但是我们想把 title的构造在父类中完成
	
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
		//在父类中，对title进行操作，是对父类自己的title进行操作

		this.playingTime = playingTime;
		this.gotIt = gotIt;
		this.comment = comment;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public void setTitle(String title) {
		this.title = title; //队父类自身的title进行操作
	}
	
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(title);
		
	}

}
