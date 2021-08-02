# 2021-08-02
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


