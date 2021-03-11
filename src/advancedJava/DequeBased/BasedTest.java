package advancedJava.DequeBased;

/**
 * @author yulinsheng
 */
/*
    Deque接口，提供了双端队列Deque的功能，继承了Queue接口
    双端队列的工作原理
        在常规队列中，元素是从后面添加的，而从前面删除的。
        但是，在双端队列中，我们可以从前后插入和删除元素。
    实现Deque的类，为了实现Deque的接口功能，我们需要实现接口的类
    ArrayDeque
    LinkedList


    Deque的使用，类似
        import java.util.Deque
    初始化Deque的两种方式
    Deque<String> stack = new ArrayDeque<>();
    Deque<String> stack = new LinkedList<>();

    由于Deque继承了Queue接口，因此它继承了Queue接口的所有方法。
    Queue接口的一些常用方法是：
        add() - 将指定的元素插入队列。如果任务成功，则add()返回true，否则将引发异常。
        offer() - 将指定的元素插入队列。如果任务成功，则offer()返回true，否则返回false。
        element() - 返回队列的开头。如果队列为空，则引发异常。
        peek() - 返回队列的开头。 如果队列为空，则返回null。
        remove() - 返回并删除队列的头部。如果队列为空，则引发异常。
        poll() - 返回并删除队列的开头。 如果队列为空，则返回null。
   Deque本身的方法：
    addFirst() - 在双端队列的开头添加指定的元素。如果双端队列已满，则引发异常。
    addLast() - 在双端队列的末尾添加指定的元素。如果双端队列已满，则引发异常。
    offerFirst() - 在双端队列的开头添加指定的元素。如果双端队列已满，则返回false。
    offerLast() - 在双端队列的末尾添加指定的元素。如果双端队列已满，则返回false。
    getFirst() - 返回双端队列的第一个元素。如果双端队列为空，则引发异常。
    getLast() - 返回双端队列的最后一个元素。如果双端队列为空，则引发异常。
    peekFirst() - 返回双端队列的第一个元素。如果双端队列为空，则返回null。
    peekLast() - 返回双端队列的最后一个元素。如果双端队列为空，则返回null。
    removeFirst() - 返回并删除双端队列的第一个元素。如果双端队列为空，则引发异常。
    removeLast() - 返回并删除双端队列的最后一个元素。如果双端队列为空，则引发异常。
    pollFirst() - 返回并删除双端队列的第一个元素。如果双端队列为空，则返回null。
    pollLast() - 返回并删除双端队列的最后一个元素。如果双端队列为空，则返回null。


    Deque作堆栈时的方法
        push() - 在双端队列的开头添加元素
        pop() - 从双端队列的开头删除元素
        peek() - 从双端队列的开头返回一个元素


 */
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class BasedTest {
    public static void main(String[] args) {
        Deque<String> stack1 = new ArrayDeque<>();
        Deque<String> stack2 = new LinkedList<>();
////        Queue接口的基本操作
//        stack1.add("1");
//        stack1.offer("2");
//        System.out.println(stack1);
//        System.out.println(stack1.element());
//        System.out.println(stack1.peek());
//        stack1.remove();
//        System.out.println(stack1);
//        stack1.poll();
//        System.out.println(stack1);
//        Deque本身的操作
//        stack2.addFirst("1");
//        stack2.addLast("2");
//        System.out.println(stack2);
//        stack2.offerFirst("3");
//        stack2.offerLast("4");
//        System.out.println(stack2);
//        System.out.println(stack2.getFirst());
//        System.out.println(stack2.getLast());
//        System.out.println(stack2.peekFirst());
//        System.out.println(stack2.peekLast());
//
//        stack2.removeFirst();
//        System.out.println(stack2);
//        stack2.removeLast();
//        System.out.println(stack2);
//        stack2.pollFirst();
//        System.out.println(stack2);
//        stack2.pollLast();
//        System.out.println(stack2);


//       双端队列作堆栈实现的方法
        stack2.push("1");
        stack2.push("2");
        System.out.println(stack2);
        stack2.pop();
        System.out.println(stack2);
        System.out.println(stack2.peek());


    }
}

