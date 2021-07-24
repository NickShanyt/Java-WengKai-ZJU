
## 2021/07/23

### 浮点数

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







