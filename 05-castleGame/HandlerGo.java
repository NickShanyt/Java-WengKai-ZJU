package castle;

public class HandlerGo extends Handler {

	
	public HandlerGo(Game game)  //���ڼ�¼game����
	{
		super(game);
	}
	
	@Override
	public void doCmd(String word) {
		// TODO Auto-generated method stub
		game.goRoom(word);
		//ʵ��go�����۵ķ���:��һ��Game��Ķ����¼Game
		
	}

	public HandlerGo() {
		// TODO Auto-generated constructor stub
	}

}
