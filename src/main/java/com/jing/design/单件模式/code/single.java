package com.jing.design.单件模式.code;

public class single {
    /**
     *
     * 确保一个类只有一个实例，并提供全局访问点
     */

    /**
     * 加入volatile确保
     */
    private static volatile Object obj;

    /**
     *  双重锁定
     *  @param
     *  @author jingShuai
     *  @return java.lang.Object
     */
    public Object getInstance() {
        if(obj == null) {
            synchronized (this) {
                if(obj == null) {
                    obj = new Object();
                }
            }
        }
        return obj;
    }

    /**
     * 枚举单例模式
     *
     */

    public void useObj(){
        SingleEnum.instance.getInstance();
    }


}
