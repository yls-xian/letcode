package advancedJava.ArrayListBased;

/**
 * @author yulinsheng
 */
/*
    ArrayList类是一个可以动态修改的数组
    与普通数组的区别就是它没有固定的大小的限制
    可以添加和删除元素。
    ArrayList类位于java.util包中
    使用之前需要利用 import java.util.ArrayList,引入ArrayList类
    初始化该类
    ArrrayList <> example = new ArrayList<> ();

    *****
    ArrayList是一个数组队列，提供了相关的添加、删除、修改和遍历等功能
    添加元素
        类实例化.add();
    访问元素
        类实例化.get(数组中元素的索引值);
    删除元素
        类实例化.remove(数组中元素的索引值);
    获取数组的长度
        类实例化.size();
    对数组进行排序（默认升序排列，降序排列需要接口）
        利用java.util中的Collections类，对数组进行排序，从低到高排序
        Collections.sort(test);
        降序排序，需要引入java.util.Comparator
    判断元素是存在数组中
        test.contains();
    返回元素的索引值(第一次出现的索引)
        test.indexOf("元素");
    返回元素索引值（最后以此出现的索引）
        test.lastIndexOf("元素");
    替换动态数组中的指定元素
        test.set(int index,E element);
    删除满足条件的元素值
        test.removeIf(e->(条件));
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class BasedTest {
    public static void main(String[] args) {
        //    初始化
        ArrayList <String> test = new ArrayList<String>();
//        添加入元素
        test.add("nihao");
        test.add("ArrayList");
        test.add("Tom");
        test.add("Aca");

//        显示添加元素后的结果
        System.out.println(test);
//        查找索引值为1的元素
        System.out.println(test.get(1));
//        删除索引值为0的元素
        test.remove(0);
        System.out.println(test);
//        输出数组的大小
        System.out.println(test.size());
//       迭代循环读取数组中的元素
        for(int i = 0;i < test.size();i++){
            System.out.println(test.get(i));
        }
        for(String i : test){
            System.out.println(i);

        }
        Collections.sort(test);
        System.out.println(test);
//      整型元素
        ArrayList <Integer> test2 = new ArrayList<Integer>();
        test2.add(2);
        test2.add(1);
        test2.add(0);
        test2.add(-10);
        test2.add(2);
        test2.add(2);
        test2.add(2);
        System.out.println(test2);
        Collections.sort(test2);
        System.out.println(test2);
        System.out.println(test2.contains(2));
        System.out.println(test2.indexOf(2));
        test2.set(4,8);
        System.out.println(test2);
        test2.sort(Comparator.reverseOrder());
        System.out.println(test2);
        System.out.println(test2.lastIndexOf(2));
        test2.removeIf(e -> (e>2));
        System.out.println(test2);



    }


}
