package c03;

/**
 在许多程序设计语言中， f()方法表面上似乎要在方法的作用域内制作自己的自变量 Letter y 的一个副本。
 但同样地，实际传递的是一个句柄。所以下面这个程序行：
 y.c = 'z';
 实际改变的是 f()之外的对象。输出结果如下：
 1: x.c: a
 2: x.c: z
 * Created by Administrator on 2018/1/21/021.
 */
class Letter {

    char c;
}

public class PassObject {

    static void f (Letter y) {
        y.c = 'z';
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        System.out.println("1: x.c:" + x.c);
        f(x);
        System.out.println("2: x.c:" + x.c);
    }
}
