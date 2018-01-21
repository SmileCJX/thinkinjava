package c03;

import java.util.Random;

/**
 * Created by Administrator on 2018/1/21/021.
 */
public class MathOps {

    /**
     * Creating a shorthand to save typing:
     * @param s
     */
    static void prt(String s) {
        System.out.println(s);
    }

    /**
     * shorthand to print a string and an int:
     * @param s
     * @param i
     */
    static void pInt(String s,int i) {
        prt(s + " = " + i);
    }

    /**
     * shorthand to print a string and a float:
     * @param s
     * @param f
     */
    static void pFlt(String s,float f) {
        prt(s + " = " + f);
    }

    public static void main(String[] args) {
        //Create a random number generator,
        //seeds with current time by default;
        Random rand = new Random();
        int i;
        int j;
        int k;
        // "%" limits maximum value to 99;
        j = rand.nextInt() % 100;
        k = rand.nextInt() % 100;
        pInt("j",j);
        pInt("k",k);

        i = j + k;
        pInt("j + k",i);
        i = j - k;
        pInt("j - k",i);
        i = k / j;
        pInt("k / j",i);
        i = k * j;
        pInt("k * j",i);
        i = k % j;
        pInt("k % j",i);
        j %= k;
        pInt("j % k",j);

        float u;
        float v;
        float w;
        v = rand.nextFloat();
        w = rand.nextFloat();
        pFlt("v",v);
        pFlt("w",w);
        u = v + w;
        pFlt("v + w",u);
        u = v - w;
        pFlt("v - w",u);
        u = v * w;
        pFlt("v * w",u);
        u = v / w;
        pFlt("v / w",u);

        u += v;
        pFlt("u += v",u);
        u -= v;
        pFlt("u -= v",u);
        u *= v;
        pFlt("u *= v",u);
        u /= v;
        pFlt("u /= v",u);
    }



}
