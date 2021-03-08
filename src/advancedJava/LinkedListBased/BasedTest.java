package advancedJava.LinkedListBased;

/**
 * @author yulinsheng
 */

/*
LinkedList 继承了 AbstractSequentialList 类。
LinkedList 实现了 Queue 接口，可作为队列使用。
LinkedList 实现了 List 接口，可进行列表的相关操作。
LinkedList 实现了 Deque 接口，可作为队列使用。
LinkedList 实现了 Cloneable 接口，可实现克隆。
LinkedList 实现了 java.io.Serializable 接口，即可支持序列化，能通过序列化去传输。
 */
/*
    LinkedList(链表)类似于ArrayList
    对比来说它对添加和删除的操作效率更高，查找和修改的效率较低。
    对比不同的情况使用，ArrayList和LinkedList
    以下情况使用 ArrayList :
        频繁访问列表中的某一个元素。
        只需要在列表末尾进行添加和删除元素操作。
    以下情况使用 LinkedList :
        你需要通过循环迭代来访问列表中的某些元素。
        需要频繁的在列表开头、中间、末尾等位置进行添加和删除元素操作。


    LinkedList同样位于java.util的包中，使用之前必须引用这个包
    初始化操作：
    LinkedList <> list = new LinkedList<>();
    在开头添加元素
    test.addFirst("元素值");
    在尾部添加元素
    test.addLast("元素值");
    移除开头元素
    test.removeFirst();
    移除最后元素
    test.removeLast();
    获取头部元素
    test.getFirst();
    test.getLast();
    获得链表的长度
    test.size();
 */
import java.util.LinkedList;
public class BasedTest {
    public static void main(String[] args) {
        LinkedList <String>  list = new LinkedList<String>();
        list.add("aca");
        list.add("bsc");
        list.add("tom");
        System.out.println(list);
        list.addFirst("first");
        System.out.println(list);
        list.addLast("last");
        System.out.println(list);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        for(int i = 0;i < list.size();i++){
            System.out.println(list.get(i));
        }
        for(String i : list){
            System.out.println(i);
        }



    }


}
