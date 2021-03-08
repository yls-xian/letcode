package advancedJava.HashMapBased;

/**
 * @author yulinsheng
 */
/*
   HashMap是一个散列表，它存储的内容是键值对（key-value）映射
   它实现了Map接口，根据HashCode值存储数据，具有很快的访问速度，最多允许
   一条记录为null,不支持线程同步。
   HashMap是无序的，不会记录插入的顺序。
   使用时，同样需要引入java.util包
   初始化HashMap时需要考虑键值对的数据类别

   添加数据操作,
        map.put(key,value)
   通过key值获得value值
        map.get(key)
   通过key值删除value
        map.remove(key)
   获取map的大小
        map.size()
   获取map的key
        map.keySet()
   获取map的value
        map.value()
   是否存在对应的key
        map.containsKey()
    是否存在对应的value值
        map.containsValue()
    替换指定key值得value
        map.replace(key,value)

 */
import java.util.HashMap;
import java.util.HashSet;

public class BasedTest {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"first");
        map.put(2,"second");
        System.out.println(map.size());
        System.out.println(map);
        System.out.println(map.get(1));
        map.remove(2);
        System.out.println(map);
        map.put(2,"second");
        map.put(3,"third");
        map.put(4,"fourth");
        map.put(5,"five");
        for(Integer i : map.keySet()){
            System.out.println(i);
        }
        for(String v : map.values()){
            System.out.println(v);
        }
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("first"));
        map.replace(2,"replace");
        System.out.println(map);


    }
}
