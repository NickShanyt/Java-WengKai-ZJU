package DataBase;

public class DVD extends Item{
	private String title; //父类中已经有title，但是这里子类DVD也有自己的title
	private String director;



	
	public DVD(String title, String director, int playingTime, String comment) {
		super(title,playingTime,false,comment); //会调用父类中，不需要参数传入的构造器的 构造函数
				//如果子类没有传递参数给super()，则子类会自动去调用父类中不需要传参的构造器
		
				//即便没有该super()语句，子类会自动的去调用父类中 不需要传参的构造器
		
		//会有2个title，一个是从父类继承的，一个是自己的
		this.title = title; //这里是指自己的title
		//在父类中，对title进行操作，是对父类自己的title进行操作

		
		setTitle("这是子类DVD的title初始化"); //调用父类的方法
		this.director = director;
//		this.playingTime = playingTime;
//		this.comment = comment;
	}

	public void print()
	{
		System.out.println("DVD");
		super.print();//此处是调用父类的 print，因为在子类中也有名为 print的方法
						//但是此处想要调用的是父类的print方法
		System.out.println(director);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DVD dvd = new DVD("A","B",1,"..");
		dvd.print(); //dvd调用自己的print

	}

}
