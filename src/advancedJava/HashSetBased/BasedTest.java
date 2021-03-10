package advancedJava.HashSetBased;

/**
 * @author yulinsheng
 */
/*
        HashSet是基于HashMap来实现的，不允许有重复元素的集合。
        HashSet允许有null值。
        HashSet是无序的，不会记录插入的顺序。
        不是线程安全的，多个线程同时修改HashSet,最终的结果是不确定的。
        实现了set接口

        同样对HashSet的使用需要引用java.util包
        初始化HashSet同ArrayList和LinkedList相同


        主要会利用的操作：
        判断set中是否包含元素
            set.contains("元素值");
        删除元素
            set.remove("元素值");
        循环读取元素
            for



 */
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.HashSet;
public class BasedTest {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(4);
        set.add(7);
        set.add(9);
        set.add(11);
        set.add(17);
        set.add(15);
        System.out.println(set.add(15));
        System.out.println(set.add(1));
//
//        System.out.println(set);
//        System.out.println(set.contains(5));
//        set.remove(15);
//        System.out.println(set);
//        for(int i : set)
//        {
//            System.out.println(i);
//        }

    }
}
