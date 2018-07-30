 # 观察者模式
 ## 概念
在对象之间定义一对多的依赖，这样依赖，当一个对象改变状态时，它的所有依赖者都会收到通知并自动更新
 ## 例子说明
天气展示栏，当天气有改变时，通知展示栏
首先把多个展示栏注册到天气处理中心，当天气改变时，就遍历一个一个通知。<br>
Subject、Observer、DisplayElement是接口
 > Subject 是一个对象，代表一种类型 <br>
 > Observer 是观察者，update方法<br>
 > DisplayElement 是展示栏
 
 > ### 共享session例子
 > 使用的就是java.util的observer。具体流程，每次请求封装session，请求结束后，判断session有没有改变，改变就更新redis的数据。