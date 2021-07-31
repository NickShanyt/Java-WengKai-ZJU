package castle;

import java.util.HashMap;
import java.util.Scanner;

public class Game {
    private Room currentRoom;
    

    //构造了一个HashMap ，用来对应具体的 动作
    private HashMap<String,Handler> handlers = new HashMap<String,Handler>();
        
    public Game() 
    {
    	handlers.put("go", new HandlerGo(this)); //为动作HashMap添加对应的动作映射，但这里HandlerGo实际上是一个Handler的子类
        handlers.put("bye",new HandlerBye(this)); //为HashMap添加一个bye的动作
        handlers.put("help",new HandlerHelp(this)); //为HashMap添加一个help的动作
    	createRooms();
    }
    
    
    public void play() //将执行动作的代码封装
    {
		Scanner in = new Scanner(System.in);
    	while ( true ) {
    		String line = in.nextLine();
    		String[] words = line.split(" ");
    		
    		Handler action_handler = handlers.get(words[0]); //通过words[0]获取到HashMap中已有或没有（下一步进行判断）的动作
    		//执行该语句后，此时的 action_handler 变为通过 words[0]在handlers识别出来的handler的子类，即具体的操作对象
    		//例如，如果输入的是 bye ,则Handler类型的对象 action_handler 实际上是自己子类 HandlerBye 的一个对象
    		String value = "";
    		if(words.length>1)
    		{
    			value =words[1];
    		}
    		if(action_handler != null) //证明该动作已经在HashMap中存好了
    		{
    			action_handler.doCmd(value);//然后让其按照实际动作执行
    			//此处action_handeler 本质上为Hadndler的子类的对象，
    			//其子类继承了父类的所有东西，如果doCmd()方法在子类中没有被重写，则将执行父类的doCmd(）
    			
    			if(action_handler.isBye()) //现在队bye操作特殊判断，判断是否是 bye ，将判断也在handler类的子类HandlerBye中判断，使之保持在框架内
    				break;
    			//其子类继承了父类的所有东西，但是，isBye()函数在子类HandlerBye()中是重写了的，所以此处执行的是子类中的isBye()
    		}
    		

//    		if ( words[0].equals("help") ) {
//    			game.printHelp();
//    		} else if (words[0].equals("go") ) {
//    			game.goRoom(words[1]);
//    		} else if ( words[0].equals("bye") )  {
//    			break;
//    		}
    }
    
    }

    private void createRooms()
    {
        Room outside, lobby, pub, study, bedroom;
      
        //	制造房间
        outside = new Room("城堡外");
        lobby = new Room("大堂");
        pub = new Room("小酒吧");
        study = new Room("书房");
        bedroom = new Room("卧室");
        
        //初始化房间的出口
        outside.setExit("east",lobby);
        outside.setExit("south",study);
        outside.setExit("west",pub);
        
        lobby.setExit("west",outside);
        
        pub.setExit("east",outside);
        
        study.setExit("north",outside);
        study.setExit("south",bedroom);
        
        bedroom.setExit("west",study);
        
        
//        //这样一来比如可以任何增加方向：
//        bedroom.setExit("up",outside);
//        bedroom.setExit("down",pub);
        
        
//        outside.setExits(null, lobby, study, pub);
//        lobby.setExits(null, null, null, outside);
//        pub.setExits(null, outside, null, null);
//        study.setExits(outside, bedroom, null, null);
//        bedroom.setExits(null, null, null, study);

        currentRoom = outside;  //	从城堡门外开始
    }

    private void printWelcome() {
        System.out.println();
        System.out.println("欢迎来到城堡");
        System.out.println("这是一个超级无聊的游戏。");
        System.out.println("如果需要帮助，请输入 'help' 。");
        System.out.println();
        showPrompt();
        play();
    }

    // 浠ヤ笅涓虹敤鎴峰懡浠�

//    private void printHelp() 
//    {
//        System.out.print("迷路了吗？你可以做的命令有：go bye help");
//        System.out.println("如：\\tgo east");
//    }

    public void goRoom(String direction) 
    {

    	Room nextRoom = currentRoom.getExit(direction);//再次解耦合
    	//game减少了很多直接去调用room的成员变量的情况

        if (nextRoom == null) {
            System.out.println("那里没有门！");
        }
        else {
            currentRoom = nextRoom;
            showPrompt();
        }
    }
    
    public void showPrompt() //显示当前所处位置
    {
    	 System.out.println("你在" + currentRoom);
         System.out.print("出口有: ");

         
         //此处解开了一个耦合
         System.out.print(currentRoom.getExitDesc());
         
         System.out.println();
    } 
	
	public static void main(String[] args) {

		Game game = new Game();
		game.printWelcome();

        
        System.out.println("感谢您的光临。再见！");

	}

}
