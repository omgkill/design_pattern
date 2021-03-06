# 命令模式
## 概念
将请求封装成对象，这可以让你使用不同的请求、队列，或者日志请求
来参数化其他对象。命令模式可以支持撤销操作
## 例子
比如我有个遥控，只有三个按钮，打开、关闭、退回。然后我可以控制所有的电器。譬如，空调、电视、电扇、电脑、手机、冰箱、热水器等等。
<br>
但我在网上看到的例子是，client、commond、invoke、receiver，一点都不生动
## 好处
   - 调用者与被调用者完全解耦
   - 命令的扩展性比较好
   - 命令模式结合其他模式会更优秀：命令模式可以结合责任链模式，实现命令族解析任务；结合模板方法模式，则可以减少 Command子类的膨胀问题。
## 劣势
  - 如果有大量命令，拿需要创建这么多命令
## 想法
 我刚开始觉得调用者（invoke）特别多余，直接调用命令就行，何必再加一层。<br>
 后来想了想，调用者可以做一些额外的操作。譬如日志、权限等等。
## 场景
　　1.系统需要将请求调用者和请求接收者解耦，使得调用者和接收者不直接交互。

　　2.系统需要在不同的时间指定请求、将请求排队和执行请求。

　　3.系统需要支持命令的撤销(Undo)操作和恢复(Redo)操作。