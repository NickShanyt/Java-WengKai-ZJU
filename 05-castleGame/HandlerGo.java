package castle;

public class HandlerGo extends Handler {

	
	public HandlerGo(Game game)  //用于记录game对象
	{
		super(game);
	}
	
	@Override
	public void doCmd(String word) {
		// TODO Auto-generated method stub
		game.goRoom(word);
		//实现go的曲折的方法:用一个Game类的对象记录Game
		
	}

	public HandlerGo() {
		// TODO Auto-generated constructor stub
	}

}
