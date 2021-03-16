package chainall.doublechain;

/**
 * @author yulinsheng
 * @time 2021-03-09-16:06
 * @email yls4314300@163.com
 */
public class doubleChain707 {
}


class MyLinkedList {
    //        定义链表的大小
    int size;
    //        定义链表的头和尾
    ListNode head,tail;
    /** Initialize your data structure here. */
    public MyLinkedList() {
//        初始化链表的长度
        size = 0;
//        初始化头尾节点
        head = new ListNode(0);
        tail = new ListNode(0);
//        连接head和tail
        head.next = tail;
        tail.pre = head;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index >= size || index < 0){return -1;}
        ListNode  curr = head;
        if(index < size - index ){
            for(int i = 0;i <= index;i++){

                curr = curr.next;
            }
        }
        else{
            curr = tail;
            for(int i = 0;i <= size - index ;i++){

                curr = curr.pre;
            }

        }
        return curr.val;

    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {

        addAtIndex(0,val);

    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        addAtIndex(size,val);


    }


    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index > size){return;}
        if(index < 0){index = 0;}
        ListNode pre,succ;
//        由于是双链表,,因此我们需要考虑如何插入元素最快
//        可以正向插入，也可以反向插入
        if(index < size - index){
//            靠近左边，正向插入元素
            pre = head;
            for(int i = 0;i < index;i++){
                pre = pre.next;
            }
//            确定插入的元素的节点位置
            succ = pre.next;
        }
//        靠近尾节点时，反向插入元素
        else{
            succ = tail;
            for(int i = 0;i < size - index ;i++)
            {
                succ = succ.pre;
            }
            pre = succ.pre;
        }
//        插入元素后，整个长度+1
        ++size;
//        定义要插入的节点
        ListNode toAdd = new ListNode(val);
//        节点的前指针是pre
        toAdd.pre = pre;
//        节点的后指针是succ
        toAdd.next = succ;
        pre.next = toAdd;
        succ.pre = toAdd;

        }


    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index < 0 || index > size){return;}
        ListNode pred,succ;
        if(index < size - index ){
            pred = head;

            for(int i = 0;i < index;i++) {
                pred = pred.next;
            }
            succ = pred.next.next;
        }
        else{
                succ = tail;
            for(int i = 0;i < size - index;i++){
                succ = succ.pre;
            }
            pred = succ.pre.pre;

        }
        size--;
        pred.next = succ;
        succ.pre = pred;



    }
}