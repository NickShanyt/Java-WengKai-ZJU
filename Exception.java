package ExceptionTest;


class OpenException extends Throwable{
	
}

public class Exception{
	public static int open() {
		return -1;
	}
	public static void readFile() throws OpenException
	//�þ������readFile()�������׳�OpenException����쳣
	{
		if(open()==-1)
		{
			throw new OpenException();
		}
	}


public static void main(String[] args) {
	try {
		readFile();
	} catch (OpenException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}