## 2021/07/29

加快进度，不再做无用的笔记

**第3周 对象容器 的内容**

---

```java
String[] a = new String(10);
//创建出来得 String型得数组a中，a[i]中存放的，不是字符串，而是指向字符串的一个管理者
```

对象数组中的每个元素，都是对象的管理者而非对象本身

即非基础类型的数组里，数组里的每个元素并非该类的对象，而是这个类的一个对象的管理者

- **创建了一个这样的数组后，这些数组中的对象还没有被创建。**

如`String[] a = new String(10);`中，每个a[i]都是一个String的管理者，而不是一个

String[] a = new String()

 

#### 容器

在容器中，其数据类型必须是**对象**，而不能是基本类型，如：

```java
private HashMap<Integer,String> coinnames = new HashMap<Integer,String>();
//在容器中，所有的数据类型必须是对象，而不能是基本元素，因此必须使用 Integer而不是int
```

Integer是 int 的包裹类型

**一个包裹类型的变量，可以直接接受其对应的基础类型的变量**

- 如上，定义的是Integer和String的键值对，在实际传值时，传 int和String的键值对即可



---



##### ArrayList

顺序容器

```java
//Notebook.java
private ArrayList<String> notes = new ArrayList<String>();
```



---



##### HashMap

```java
//Coin.java
private HashMap<Integer,String> coinnames = new HashMap<Integer,String>();
```



- **HashMap中键值对中的 键 是唯一的，相同的 键 只认最后一次的**
- 

**遍历HashMap**

- ```java
  for(Integer k : coinnames.keySet())
  {
      String s =coinnames.get(k);
      System.out.println(s); //遍历 键值对 中的 值
      System.out.println(k+":"+s); //遍历 键值对
  }
  ```

- 



----





#### for-each 在不同变量中的差异

##### 普通数组中，使用for-each

```java
int[] a= new int[10];
for( int k:a)
{
    k++; 
    //k++不会起到任何作用
	//因为这里的k是对数组a元素的一个复制
}
```

##### 对象数组中，使用for-each

则可以修改，因为其确实指向了该类的一个具体的对象

链接：[3.2 对象容器](https://www.icourse163.org/learn/ZJU-1001542001?tid=1464410444#/learn/ojhw?id=1237747020)

```java
		ArrayList<String> abc= new ArrayList<String>();
		abc.add("111");
		abc.add("222");
		for( String s:abc)
		{
			System.out.println(s);
			s="AAAA"; //可以操作
			System.out.println(s);
		}
/*
111
AAAA
222
AAAA
*/

```





#### **如何写一个类？**

先写要实现的功能的接口定义，再考虑如何实现

- 在代码中，硬编码的东西越少越好



---

- 自定义的某个类，如果想要直接输出该对象的值，可以在类中定义一个函数：

```java
class Value
{
    private int x;
	public String toString() //固定格式 ：包括名字也是固定的
	{
  	  return ""+x;
	}
}
```

---

