package castle;

public class HandlerBye extends Handler //Handler�µ�һ�����࣬һ������Ķ���
{

	public HandlerBye(Game game)  //���ڼ�¼game����
	{
		super(game);
	}
	
	@Override
	public boolean isBye() {  //��д����Handler�е� isBye()
		// TODO Auto-generated method stub
		return true;
	}

	public HandlerBye() {
		// TODO Auto-generated constructor stub
	}

}
