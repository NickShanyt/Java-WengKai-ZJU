## 2021/07/23

#### 浮点数

在Java中，浮点数之间的比较可以借用Math.abs()做减法并取一定的精度来进行，如：Math.abs(a-b) > 1e-6  如果true，则a>b否则 a<b
如果对浮点数直接使用`==`进行比较，则会发生错误：如

```java
double a=1.0;
double b =0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1;
System.out.println("a="+a+";b="+b;); //a=1.0,b=0.99999999999;
System.out.println(a==b); // false
```



**final关键字**

​	静态变量

#### **if判断**

- 1、永远在每个 if 后面都使用 大括号{} ，即便只有一行代码

  - 在if和else之后必须加上大括号形成语句块
  - 大括号内的语句缩进一个tab的位置

- 2、if 后面不要加分号 ；，如果if 判断后面加了分号，则会判断为：该if成立则什么也不做

  - ```java
    if(age<MINOR); 
    {
        System.out.println("aga < Minor");
    }
    //上方if后面加了括号，等同于：
    if(age<MINOR)
        ;
    //即：if判断true后，什么也不执行。
    //然后将会继续执行System.out.println("aga < Minor");
    //即：不论if判断是否为tru，都将会执行原本计划想要在if判断为true后才执行的语句
    ```

  - 

- 3、if()判断中，只要求括号内的值是 零 或 非零，即 true或false

  - 因此要注意 等号 ”==“ 和赋值号 ”=“ 的使用

- **4、代码风格是三观**（hh）

#### switch-case语句

将很长的if else语句可以改造成switch-case语句

- ```java
  switche(type) // type必须是整型
  {
      case 1:
      	System.out.println("This is case 1");
      	break;
      case 2:
      	System.out.println("This is case 2");
  		break;
      default:
      	Sysatem.out.println("This is case DEFAULT output");
  }
  ```

  其中 type  必须是**整型变量**，浮点型是不行的

  然后从case NUM：中寻找NUM==type的情况，**直到遇到break为止**。

  default 表示，如果找不到任何case，则按fefault执行

- ```java
  switche(控制表达式)
  {
      case 常量:
      	语句
          ···
      case 常量:
      	语句
          ···
      default:
      	语句
          ···
  }
  ```

  - 1、控制表达式只能是**整数型**的结果
  - 2、常量可以是常数，也可以是常数计算的表达式
  - 3、根据表达式的结果，寻找匹配的case，**并执行case后面的语句，一直到break为止**

- **如果在执行某个case后，没有break，则程序会继续执行下一个break**

**单一出口**

​	只有一个System.out.printn() ，以方便未来对输出进行控制和操作



#### 循环

**while** :

- 1、先判断条件，如果符合则将重复做同一件事
  - 循环执行之前判断是否继续循环，因此有可能循环一次也没有执行
  - 条件成立 事 循环继续的条件
- 2、循环体内要有改变条件的机会

Q：如何实现先执行循环体，再来判断条件？

A：使用do-while循环：

**do-while**

- 1、先做一次循环，再来判断条件，如果还满足，则继续执行



#### 算法

- 计算机的算法一般而言可以模仿人类思考的模式，但**如果可以考虑到计算机本身的特点，算法将会更快捷高效**
- 

**负数转换为正数**

- 可以使用绝对值进行转换 ```number = Math.abs(number);```
- 

#### 验证程序

- 1、通常会使用边界数据，如有效范围两端的数据，特殊的倍数等
  - 在数数字位数的程序中，可以输入以下几种数据来验证程序：

    - 个位数

    - 10

    - 0

    - 负数

---

## 2021/07/26

#### break & continue

**break**

- 不论是在switch循环或者是for循环中，遇到break语句将直接结束循环：
  - switch中不再去找其他case
  - for循环不再继续执行，将会继续执行for循环代码段中的下一行代码

**continue**

- continue表示跳过循环中这一轮剩下的语句进入下一轮
  - 1、switch ： 本轮不再找余下的case（如果还有下一次switch则继续执行）
  - 2、for：本轮中continue后面的语句不再执行，执行下一轮次
