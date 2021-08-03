# 2021/08/02

# 异常

捕捉异常

```java
try{
    //可能产生异常的代码
}catch(Type1 id1){
    //处理Type1异常的代码
}catch(Type2 id2){
    //处理Type2异常的代码
}catch(Type3 id3){
    //处理Type3异常的代码
}
```



异常发生，不一定意味着程序必须中制。

如果又try-catch语句捕捉到了异常并进行了处理，那么程序会继续执行



#### 捕捉到异常：

- ```java
  //可以通过该函数来得到异常的调用栈
  try{
      ...
  }
  catch(... e)
  {
      e.PrintStackTrace();
  }
  //    e.PrintStackTrace();返回异常发生地方的调用栈的信息
  
  //e.GetMessage() 返回异常所在位置信息
  //e.toString() 返回异常
  ```

- 

#### 再度抛出：

捕捉到，但无法进行处理，或无法完全处理

```java
catch(Exception e){
    System.err.println("An exception was thrown");
    throw e;
}
```

# 2021/08/03

# 异常机制 8.2异常控制

希望程序能够对程序执行前的一些问题进行**预知**

### **异常**

- 就是有不寻常的事情发生了
- 当这个事情发生的时候，原本打算要接着做的事情不能再继续了，必须得停下来，让其他地方得某段代码来处理

**异常机制的好处**

- 清晰的分开了正常的逻辑代码 try ，和遇到情况时的处理代码 catch





### 异常捕捉

#### 方法一：提前声明

如果你的函数可能会抛出异常，就必须在函数头部加以声明，可以声明并不会抛出的异常

- 在方法中就声明可能会抛出什么异常，然后用throw抛出异常

```java
class OpenException extends Throwable{
	
}

public class Exception{
	public static int open() {
		return -1;
	}
	public static void readFile() throws OpenException
	//该句表明，readFile()函数会抛出OpenException这个异常
	{
		if(open()==-1)
		{
			throw new OpenException();
		}
	}
```

- 比如上面代码中，`readFile()`函数中 后面提前声明了`throws OpenException`



#### 方法二：try-catch

- 使用try-catch语句来捕捉异常

```
public static void main(String[] args) {
//使用try-catch语句
	try {
		readFile();
	} catch (OpenException e) {

		e.printStackTrace(); //输出发生异常的调用信息栈
	}
}
```

- 如上面代码中的 try-catch
  - 先尝试执行try中的业务逻辑语句：`readFile()`，如果该语句抛出了`OpenException`类型的异常，则进行处理：`e.printStackTrace();`

**注意：**

- try-catch中，如果是类A的子类A1抛出的异常，但是捕捉的是其父类A，也会捕捉得到父类A的异常
- 如果同时捕捉子类A1和父类A的异常，则按在catch语句中的顺序，捕捉第一个异常

### 什么能扔 throw ？

- 任何继承了Throwable类的对象
- Exception类 继承了Throwable
  - throw new Exception();
  - throw new Exception("HELP ME");



### 异常声明遇到继承关系

- 当覆盖（重写）一个函数的时候，**子类不能声明抛出比父类的版本更多的异常**
- 在子类的**构造函数**中，必须声明父类可能抛出的全部异常，
  - 子类的构造函数还可声明父类中没有声明的异常





---

# 流

一维的

单方向的

## **Java中 流 的基础类**

### 标准输入输出流:

**只能处理单个字节**

- #### InputStream

  - 所有的输入流基于此
  - 把输入当作**字节流**来看待
  - **只能处理单个字节**

- #### OutputStream

  - 所有的输出流基于此
  - 把输出当作**字节流**来看待
  - **只能处理单个字节**



#### 文件流

对文件进行读写操作，实际工程中使用较少，有其他更专业的类

- FileInputStream
  - 只能处理单个字节
- FileOutputStream
  - 只能处理单个字节



#### 流过滤器

用以读写 **二进制**方式表达的**基本数据类型** 的数据

- DataInputStream
- DataOutputStream 



### Reader / Writer

二进制数据用：**InputStream / OutputStream**

文本数据用 Reader / Writer

- 处理Unicode字符
  - 如果本身就是Unicode字符编码的文件，可以直接使用Reader / Writer打开
- 如果文件本身不是Unicode ，则要借助 流stream 来打开这个文件，然后在strem流的基础上，建立**过滤器**，再以过滤器进行对文本的 Reader/Writer

#### **写：** PrintWriter

```JAVA
PrintWriter out =new PrintWriter(
	new BufferdWriter(
        new OutputStreamWriter( 
            //OutputStreamWriter 构建了Strem和Writer之间的桥梁
            //输入一个stream ，输出一个writer
            new FileOutputStream("a.txt"))));

```

#### **读：**BufferedReader

`readLine()` 可以读一整行

```JAVA
BufferedReader in =new BufferedReader(
	new InputStreamReader(
    	new FileInputStream("src/main.java")));
String line;
while((line=in.readLine())!=null){ 
    //
    System.out.println(line)
}
```

BufferedReader中的 **readLine()**方法，如果已经读到文件末尾，则会返回一个null，否则返回一个String类型的数据

因此在上面代码中，while中声明了那样的语句。





**LineNumberReader** : 可以在行号之间跳来跳去

- 可以得到行号：getLineNumber()



#### FileReader 

如果直接是文件的话，可以使用

- **InputStreamReader**的子类，所有方法都从父类中继承而来
- **FileReader(File file)**
  - 在 给定从中 读取数据的**File**的情况下创建一个新FileReader
- **FileReader(String fileName)**
  - 在 给定从中读取数据的文件名 的情况下创建一个新得FileReader
- FileReader不能指定编码转换方式





## 汉字编码

InputStreamReader ( InputStreamReader in)

- 创建一个使用默认字符集的 InputStreamReader



InputStreamReader (InputStreamReader in ,Charset cs)

- 创建一个使用 **给定**字符集的 InputStreamReader



InputStreamReader (InputStreamReader in ,CharsetDecoder dec)

- 创建一个使用 **给定**字符集解码器 的 InputStreamReader



InputStreamReader (InputStreamReader in ,String charsetName)

- 创建一个使用 **指定**字符集 的 InputStreamReader





### 格式化输入输出

#### PrintWriter

- format("格式",....);
- printf("格式",....);
- print(各种数据格式);
- println(各种数据格式);



#### Scanner

- 在InputStream或Reader上建立一个Scanner对象可以从流中的文本中解析出以文本表达的各种基本类型







### 阻塞/非阻塞

- read()函数是阻塞得，在读到所需得内容之前都会停下来**等待**





### 对象串行化

对类的对象整个的写到流stream中去



- ObjectInputStream 类
  - readObject()



- ObjectOutputStream类
  - writeObject()



- Serializable接口



----

翁恺 两门Java课程完结。

Comments :

作为入门课程，翁恺老师的授课风格令人轻松愉悦，在保证知识内容的情况下做到了简单易学。其中，对编程语言许多概念的讲解可以作为学习其他更多语言的基石。

具体到Java来讲，这门课程介绍了Java中的主要概念，虽不够深入，但作为一门抛砖引玉的课程是非常优秀的了。

完成时间：陆陆续续花了10天时间，如果每天都在全心搞，预计一周内可以学习完成。
