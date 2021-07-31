package castle;

import java.util.HashMap;

public class Room {
    private String description;

    private HashMap<String , Room> exits = new HashMap<String ,Room>();
    //ͨ����Hash������ʾ��������Ͳ��ǡ�Ӳ����"��
    
//    private Room northExit;
//    private Room southExit;
//    private Room eastExit;
//    private Room westExit;

    public Room(String description) 
    {
        this.description = description;
    }

    public void setExit(String dir,Room room)
    {
    	exits.put(dir, room);   //һ������һ������
    							//�����Ƕ�̬����
    }
    
//    public void setExits(Room north, Room east, Room south, Room west) 
//    {
//        if(north != null)
//            northExit = north;
//        if(east != null)
//            eastExit = east;
//        if(south != null)
//            southExit = south;
//        if(west != null)
//            westExit = west;
//    }

    @Override
    public String toString()
    {
        return description;
    }
    public String getExitDesc()
    {
//    	String ret = ""; //ֱ��ʹ��String��+��ÿ�ζ��ᴴ��һ���µ�String ������ܴ�
    	StringBuffer sb =new StringBuffer();
    	for(String dir : exits.keySet())
    	{
    		sb.append(dir);
	    	sb.append(" ");
//	    	if(northExit != null)
//	    	{
//	    		sb.append("north ");
//	    	}
//	    	if(eastExit != null)
//	    	{
//	    		sb.append("north ");
//	    	}
//	    	if(westExit != null)
//	    	{
//	    		sb.append("north ");
//	    	}
//	    	if(southExit != null)
//	    	{
//	    		sb.append("north ");
//	    	}
    }
    	return sb.toString();
    	
    }
    public Room getExit(String direction)
    {

    	Room ret = exits.get(direction);
        return ret;
        //ֱ�ӷ���key��Ӧ��ֵ����������һ�����ж϶�Ӧ˭
        
//    	if(direction.equals("north")) {
////            ret = currentRoom.northExit;
//    		ret = northExit; //�����ǽ����ret�����в�����������
//        }
//        if(direction.equals("east")) {
//            ret = eastExit;
//        }
//        if(direction.equals("south")) {
//            ret = southExit;
//        }
//        if(direction.equals("west")) {
//            ret = westExit;
//        }

    }
}
