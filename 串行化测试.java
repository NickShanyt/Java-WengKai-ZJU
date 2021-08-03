package serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{ //Ӧ��һ���ɱ����л��Ľӿ�Serializable
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
public class ���л����� {

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//д��
			Student s1 = new Student("John",18,5);
			System.out.println(s1);
			ObjectOutputStream out =new ObjectOutputStream(
					new FileOutputStream("obj.dat"));
			out.writeObject(s1);
			out.close();
			
			//����
			ObjectInputStream in = new ObjectInputStream(
					new FileInputStream("obj.dat"));
			Student s2 = (Student) in.readObject();
			System.out.println(s2);
			in.close();
			//s1��s2 ��һ��������
			System.out.println(s1==s2); //s1��s2�����ǻ������ͣ�==�ж���id�Ƿ���ͬ
										//����������л�����Ķ�����ֵ��ͬ��������ͬһ������
		}catch(IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public ���л�����() {
		// TODO Auto-generated constructor stub
	}

}
