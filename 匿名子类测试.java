package ��������;

public class ����������� {
    public static void main(String[] args) {
        Test t = new Test() {
            @Override
            public void method1() {
                System.out.println("2222222222222");
            }
        };
        t.method1();
        
        Test t2 = new Test() { //ֱ�Ӵ�����һ��Test����������࣬��t2�������������Ķ���
        					   //�˴�����������ΪTest��Ķ���
            public void method1() {
//                super.method3();
                System.out.println("1111111222222222222222");
            }
        };
        t2.method1(); //��Ϊ�������������д��method1����������ǵ����Լ���method1()����
        t2.method3(); //��Ϊ����������� û����д method3����������ǵ��ø����method3()����
	    }

	}

	class Test {
    public void method1() {
        System.out.println("�����method1����");
    }
    public void method3(){
        System.out.println("�����method3����");
 	   }

	}
