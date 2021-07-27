
## 2021/07/27

---

####  数组

- ```java
  int[] numbers = new int[100]; //这里静态创建了能存储100个int型变量的数组，名为numbers
  int len = numbers.length //求数组的元素个数
      
  //可扩展性的for循环：
  for(int i=0;i<numbers.length;i++)
  {
      
  }
  
  //直接赋值创建数组
  int[] scores={99,22,35,66,21}; //不需要给出数组的大小，编译器将会自动计数
  ```

- 1、Java中的数组仍然是从0开始计数

- 2、数组是一种【容器】

  - 所有元素具有相同的数据类型
  - 一旦创建，不能改变大小
  - Java**中创建数组**
    - 元素个数必须是整数
    - 元素个数必须给出
    - 元素个数可以是变量-----动态创建

- 3、编译器不会检查你是否使用了合法的数组下标，但是如果不合法则运行时将报错。

  - 最小为0，最大为数组元素个数-1

- **4、Java中会自动对数组进行初始化，全部赋0值**



- **5、两个数组之间赋值，其将指向同一个内存单元中的数组内容，而不是两个数组：**

  - ```java
    int[] sz1 =new int[10]; //创建了一个数组sz
    sz1[2]=12;
    int[] sz2 = sz1; 
    //此时，sz2和sz1指向的都将是同一个数组
    //sz1[2]和sz2[2]的值都是12
    
    
    //称sz2为sz1的管理者，而sz1为所有者
    //可以理解为sz2指向数组sz1的首地址
    ```

  - 

- **复制数组**

  - 复制数组必须遍历源数组的每一个元素，并将每个元素逐一拷贝给目的数组



**for-each循环**

```java
int[] data = new int[100];
int target=25;
SearchNumber:
for(int k :data) //data是一个数组，k是用来遍历data数组中元素的临时变量
{
    if(target==k)
    {
        break SearchNumber;
    }
}
//缺点：不知道当找到目标值时目标值在数组中的位置
//当然，也可以在循环里面进行处理，然后输出位置
```





##### [实例：素数的寻找](https://www.bilibili.com/video/BV1PV411Z7Mj?p=38&spm_id_from=pageDriver)

​	有多种方法

---



#### 二维数组

```java
int[][] td= new int[3][5];//创建了一个3行x5列的二维矩阵

//二维数组的遍历
for(int i=0;i<3;i++)
{
    for(int j=0;i<5;j++)
    {
        td[i][j]=i*j;
        System.out.println(td[i][j])
    }
}
```

- 自然的，如果要遍历二位数组，则应为两级循环
  - 第一级遍历【行】
  - 第二级遍历【列】

- **二位数组的初始化**
  - 编译器会进行数数
  - 每行用一个{}，用逗号分隔
  - 最后的逗号可以存在（传统
  - 如果省略，表示补零

---



#### 字符

- Java语言使用Unicode表，字母和数字在Unicode表中是顺序排列了 

- 字母大写和小写是分开排列的，并不连续

  - 大小写转换：

    - ```java
      //大写 -> 小写
      char c ='A';
      char d = (char)(c + 'a'-'A');
      
      //小写 -> 大写
      char c ='a';
      char d = (char)(c + 'A'-'a');
      ```

- **字符可以比较大小，其大小是其字符在Unicode表中的编号**
  - 先大A后小a

#### 逃逸字符

- 用来表达无法印出来的【控制字符】或【特殊字符】

  - 反斜杠 \ 开头，再跟上另一个字符，这两个字符组成了一个字符

  <img src="C:\Users\NickShan\AppData\Roaming\Typora\typora-user-images\image-20210727215806270.png" alt="image-20210727215806270" style="zoom: 50%;" />

---

#### 包裹类型

- 每种基础类型都有对应的包裹类型
  - <img src="C:\Users\NickShan\AppData\Roaming\Typora\typora-user-images\image-20210727220608335.png" alt="image-20210727220608335" style="zoom:67%;" />

- 包裹类型也是一种类型，能做一些基础类型不方便实现的事
  - 如，求整数的最大值：`Integer.MAX_VALUE`
- 在Jave中，int型占4B=32bit，范围为 -2^32 ~ (2^31-1)

**.   运算符**

- 当需要让一个 类  或 对象做事情的时候，用 . 运算符
  - a.length
  - Integer.MAX_VALUE



- **Character**
  - <img src="C:\Users\NickShan\AppData\Roaming\Typora\typora-user-images\image-20210727221238070.png" alt="image-20210727221238070" style="zoom: 67%;" />



---

#### 字符串

##### 字符串变量

​	String s；

- String 是一个类，String的变量是对象的**管理者**而非所有者
  - 在Java中，自带类型中如果名称首字母是大写，表明该类型不是基础类型，而是一个**类**
- a、**用 new 创建**
  - `String s = new String("a string")`
    - 1、创建了一个String对象
    - 2、用“a string”初始化了这个对象
    - 3、创建管理这个对象的变量s
    - 4、让s管理这个对象
- b、**更常用方法：**
  - `String s ="a string";`
    - 编译器帮忙创建一个String类的对象交给s来管理



##### .next() 和.nextln()

- .next() 读取一个词，以广义的空格为分割，包括输入的空格、换行符等
- .nextln() 则可读取一个字符串





##### 比较两个字符串 == 和 .equals

- `==`
  - 比较是否是内存中的同一个位置的字符串
  - 即 **比较二者是否是同一个东西**
- `.equals`
  - 比较两个字符串是否相同
  - 即 **比较二者内容是否相同**
  - Strings 应该用 .equals 来比较

##### 字符串操作

- **1、比较Strings**
  - <img src="C:\Users\NickShan\AppData\Roaming\Typora\typora-user-images\image-20210727232347825.png" alt="image-20210727232347825" style="zoom:50%;" />
  - 比较的是对应的Unicode码的大小
- **2、获取String的长度**
  - 使用length() 函数
    - 注意，String中的length**()**是带有**括号**的，而数组中的length是没有括号的
    - <img src="C:\Users\NickShan\AppData\Roaming\Typora\typora-user-images\image-20210727232739313.png" alt="image-20210727232739313" style="zoom:50%;" />
- **3、访问String里的字符**
  - 使用  .charAt(index)
  - <img src="C:\Users\NickShan\AppData\Roaming\Typora\typora-user-images\image-20210727232846149.png" alt="image-20210727232846149" style="zoom:50%;" />



- **4、得到字符串的子串**
  - 使用 .substring(n) 
    - 得到从n号位置到末尾的全部内容
  - 使用 .substring(b,e)
    - 得到从b号位置到e号位置之前的内容**不包括e号位置**
  - <img src="C:\Users\NickShan\AppData\Roaming\Typora\typora-user-images\image-20210727233245943.png" alt="image-20210727233245943" style="zoom: 50%;" />



- **5、寻找字符**
  - <img src="C:\Users\NickShan\AppData\Roaming\Typora\typora-user-images\image-20210727233454283.png" alt="image-20210727233454283" style="zoom:50%;" />
    - .indexOf(c) 只返回找到的**第一个字符**所在的位置

- **6、其他操作**

  - s.trim()  删除两端空格

  - s.replace(c1,c2)  将字符串s中所有c1都替换为c2

  - s.toLowerCase()  都变成**小写**字母

  - s.toUpperCase()  都变成**大写**字母

    - ```java
      String s1 ="abcd";
      String s1_Up = s1.toUpperCase();  
      ```

##### **不可变的String**

- ​	**所有的字符串都是不可变的，对它们操作的结果都是制造新的字符串出来**
  - 至少对于使用String类的字符串是这样的



##### 在switch-case中使用字符串

```java
switch(S){
    case "this":
        break;
    case "that":
        break;
}
```





 
