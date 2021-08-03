package 匿名子类;

public class 匿名子类测试 {
    public static void main(String[] args) {
        Test t = new Test() {
            @Override
            public void method1() {
                System.out.println("2222222222222");
            }
        };
        t.method1();
        
        Test t2 = new Test() { //直接创建了一个Test类的匿名子类，而t2是这个匿名子类的对象
        					   //此处是向上造型为Test类的对象
            public void method1() {
//                super.method3();
                System.out.println("1111111222222222222222");
            }
        };
        t2.method1(); //因为这个匿名子类重写了method1方法，因此是调用自己的method1()方法
        t2.method3(); //因为这个匿名子类 没有重写 method3方法，因此是调用父类的method3()方法
	    }

	}

	class Test {
    public void method1() {
        System.out.println("父类的method1方法");
    }
    public void method3(){
        System.out.println("父类的method3方法");
 	   }

	}
