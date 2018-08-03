# 装饰者模式

## 概念
&emsp;&emsp; 动态地将责任附加到对象上。若要扩展功能，装饰者提供了
    比继承更有弹性的替代方案或者 **可以这样说包装对象**
 ## 优点:
 * CondimentDecorator继承Beverage，这是利用继承达到“类型匹配”
  而不是继承获得“行为”
 *  对扩展开放，对修改关闭
 
 ## 缺点
 * 当一个对象依赖特定的类型，然后忽然导入，导致错误。插入装饰者必须小心谨慎
 * 增加代码复杂度，使用者不知道到底导入了多少个装饰着
 * 装饰者导致设计中出现许多小对象，如果过度使用，会让程序变得很复杂
 ## 例子
 > 数据流 
 >> 父类：InputStream <br>
 >> 装饰类：FilterInputStream <br>
 >> 装饰者：BufferedInputStream, CheckedInputStream, CipherInputStream,DataInputStream, DeflaterInputStream, DigestInputStream,InflaterInputStream, LineNumberInputStream, ProgressMonitorInputStream,PushbackInputStream <br>
 >> 被装饰者：AudioInputStream, ByteArrayInputStream, FileInputStream,FilterInputStream,ObjectInputStream, PipedInputStream, SequenceInputStream,StringBufferInputStream
 #### 自己用过的例子
  共享session的一个例子，
  request,HttpServletRequestWrapper就是HttpservletRequest的装饰类。而httpserverletReuest是接口，具体的对象还在tomcat里。
 -  HttpServletRequestWrapper是装饰类，那这个类的作用是什么？
 - 为何不直接继承具体类，这样更简单。
 -  因为具体类有多个时，我们就需要进行解耦