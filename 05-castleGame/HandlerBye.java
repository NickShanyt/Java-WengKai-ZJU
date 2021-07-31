package castle;

public class HandlerBye extends Handler //Handler下的一个子类，一个具体的动作
{

	public HandlerBye(Game game)  //用于记录game对象
	{
		super(game);
	}
	
	@Override
	public boolean isBye() {  //重写父类Handler中的 isBye()
		// TODO Auto-generated method stub
		return true;
	}

	public HandlerBye() {
		// TODO Auto-generated constructor stub
	}

}
