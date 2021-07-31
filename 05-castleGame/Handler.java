package castle;

public class Handler {

	protected Game game;
	
	public Handler(Game game)  //构造时就用于记录game对象
	{
		this.game = game;
	}
	
	
	public void doCmd(String word)
	{
		
	}
	public boolean isBye()
	{
		return false;
	}
	public Handler() {
		// TODO Auto-generated constructor stub
	}

}
