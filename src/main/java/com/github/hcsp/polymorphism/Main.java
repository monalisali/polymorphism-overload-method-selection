package com.github.hcsp.polymorphism;

public class Main {
    // 猜一下输出结果是什么，然后运行一下看看是不是和你预期相符
    // 请修改下面的代码，使之输出
    // "I am Sub, the param is ParamSub"
    public static void main(String[] args) {
        Base object = new Sub();
        ParamSub param = new ParamSub();
        //Object对象是在运行时才能决定的（多态特性），而参数param是在编译时就能决定的。
        //这就是所谓的：参数静态绑定（方法的参数），接收者动态绑定(方法的调用者)
        object.print(param);
    }
}
