package castle;

import java.util.HashMap;

public class Room {
    private String description;

    private HashMap<String , Room> exits = new HashMap<String ,Room>();
    //通过用Hash表来表示方向，则方向就不是“硬编码"了
    
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
    	exits.put(dir, room);   //一次设置一个方向
    							//而且是动态设置
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
//    	String ret = ""; //直接使用String来+，每次都会创建一个新的String 开销会很大
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
        //直接返回key对应的值，而不用再一个个判断对应谁
        
//    	if(direction.equals("north")) {
////            ret = currentRoom.northExit;
//    		ret = northExit; //这里是姐姐在ret的类中操作，不用再
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
