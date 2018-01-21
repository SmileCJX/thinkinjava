package c03;

/**
 Number 类非常简单，它的两个实例（ n1 和 n2）是在 main()里创建的。每个 Number 中的 i 值都赋予了一个不
 同的值。随后，将 n2 赋给 n1，而且 n1 发生改变。在许多程序设计语言中，我们都希望n1 和 n2 任何时候都
 相互独立。但由于我们已赋予了一个句柄，所以下面才是真实的输出：
 1: n1.i: 9, n2.i: 47
 2: n1.i: 47, n2.i: 47
 3: n1.i: 27, n2.i: 27
 看来改变 n1 的同时也改变了 n2！这是由于无论 n1 还是 n2 都包含了相同的句柄，它指向相同的对象（最初
 的句柄位于 n1 内部，指向容纳了值 9 的一个对象。在赋值过程中，那个句柄实际已经丢失；它的对象会由
 “垃圾收集器”自动清除）。
 * Created by Administrator on 2018/1/21/021.
 */
class Number {

    int i;
}

public class Assignment {

    public static void main(String[] args) {
        Number n1 = new Number();
        Number n2 = new Number();
        n1.i = 9;
        n2.i = 47;
        System.out.println("n1.i:" + n1.i + ", n2.i" + n2.i);
        n1 = n2;
        System.out.println("n1.i:" + n1.i + ", n2.i" + n2.i);
        n1.i = 27;
        System.out.println("n1.i:" + n1.i + ", n2.i" + n2.i);
    }
}
