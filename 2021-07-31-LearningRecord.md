# 2021/07/31

## 第6周 抽象与接口

comment：

光看视频不够了，越来越迷糊

---





### 1、抽象类

#### 概念：

- 抽象函数 ： 表达概念而无法实现具体代码的函数
- 抽象类： 表达概念而无法构造出实体的类

-  目的：为了防止制造它的对象出来。用abstract关键字来定义抽象类

#### **作用：**

- 抽象类的作用仅仅是表达接口，而不是具体的实现细节。

#### **注意：**

- 如果一个类有了一个抽象的方法，这个类就必须声明为抽象类。
- 如果父类是抽象类，那么子类必须**覆盖**所有在父类中的抽象方法，否则子类也成为一个抽象类。
- 一个抽象类*可以没有任何抽象方法*，所有的方法都有方法体，但是整个类是抽象的。

有抽象函数的一定是抽象类

抽象类**不能制造对象**，但是可以**定义变量**

- 任何继承了抽象类的 **非抽象子类**的 **对象**可以赋给这个变量



#### 如何理解抽象类？

比如画图，我们创建了一个Shape父类，然后该父类下面有很多具体图形的子类

如果我们要画某个具体的图形，那么我们可以调用子类中的draw函数。

但是，我们并不需要真正去产生一个Shape类的对象，如果真的有一个shape类的对象出来，那我们不知要它怎么去draw。

在这种情况下，适合的做法是让这个Shape类成为一个抽象类

这个抽象类中也会有一个抽象方法draw，其没有实际意义，**其意义就是告诉别人，这个Shape类下面的所有子类，都具有draw的方法**（因为父类是抽象类，那么子类必须**覆盖**所有在父类中的抽象方法，否则子类也成为一个抽象类。）



抽象的类不能够产生对象

```java
public abstract class Shape{
    public abstract void draw(Graphics a);
    //注意，这个抽象方法中没有中括号，没有具体内容
    //如果一个类有了一个抽象的方法，这个类就必须声明为抽象类
}
```





#### 2种抽象

- 1、与具体相对
  - 表示一种概念而非实体
- 2、与细节相对 
  - 表示在一定程度上忽略细节而着眼大局

### 2、细胞自动机——数据与表现分离



**程序的业务逻辑与表现无关**

- 表现可以是图形的也可以是文本的
- 表现可以是当地的也可以是远程的



**责任驱动的设计**

- 将程序要实现的功能分配到合适的类/对象种去是设计中非常重要的一环



### 接口

接口是纯抽象类

- 1、所有的**成员函数**都是**抽象函数**
- 2、所有的**成员变量**都是public static final
  - public static final  
    - 不属于任何对象
    - 因为是 final，故而不会被改变。在编译时刻已经确定知道值的东西
- 3、接口规定了长什么样，但是不管里面有什么

```java
//Foex继承自 Animal，同时 实现了 Cell
//因为Fox实现了Cell因此其可以放到field里去
public class Fox extends Animal implements Cell
{
    
}
```



#### 定义接口：

```java
public interface Cell  //在java中，interface是一种特殊的class，与class相同地位
{
    
}
```

#### 实现接口

- 1、类用extends，接口用 implements
- 2、类可以实现很多接口
- 3、接口可以继承接口，但**不能继承类**
- 4、接口不能 实现 接口



#### 面向接口的变成方式

- 1、设计程序时先定义接口，再实现类
- 2、任何需要在函数间传入传出的一定是接口而不是具体的类

- **优缺：**
  - 优点：Java成功的关键之一 ，因为极适合多人同时写一个大程序
  - 缺点：Java被批评的要点之一，因为代码量膨胀很快
