package serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{ //应用一个可被串行化的接口Serializable
	private String name;
	private int age;
	private int grade;

	public Student(String name,int age,int grade)
	{
		this.name=name;
		this.age=age;
		this.grade=grade;
	}
	public String toString() {
		return name+":"+age+":"+grade;
	}
}
public class 串行化测试 {

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//写入
			Student s1 = new Student("John",18,5);
			System.out.println(s1);
			ObjectOutputStream out =new ObjectOutputStream(
					new FileOutputStream("obj.dat"));
			out.writeObject(s1);
			out.close();
			
			//读出
			ObjectInputStream in = new ObjectInputStream(
					new FileInputStream("obj.dat"));
			Student s2 = (Student) in.readObject();
			System.out.println(s2);
			in.close();
			//s1和s2 是一个东西吗？
			System.out.println(s1==s2); //s1和s2都不是基础类型，==判断其id是否相同
										//这表明反串行化制造的对象，其值相同，但不是同一个对象
		}catch(IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public 串行化测试() {
		// TODO Auto-generated constructor stub
	}

}
