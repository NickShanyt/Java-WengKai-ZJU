package castle;

public class HandlerHelp extends Handler {
	
	public HandlerHelp(Game game)  //���ڼ�¼game����
	{
		super(game);
	}
	
	@Override
	public void doCmd(String word) {
		// TODO Auto-generated method stub
        System.out.println("��·������������������У�go bye help");
        System.out.println("�磺\tgo east");
	}



}
