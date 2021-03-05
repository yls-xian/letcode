package javaLetcode.chain;

/**
 * @author yulinsheng

 */
public class ChainOperate707 {
    public static void main(String[] args) {

    }
}


/*
        单链表实现
 */

class MyLinkedListSingleChain {
    int size;
    ListNode head;
    /** Initialize your data structure here. */
    public MyLinkedListSingleChain() {
        size = 0;
        head = new ListNode(0);
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index < 0 || index >= size) return -1;
        ListNode curr = head;
        for(int i = 0;i <= index;i++ )
        {
            curr = curr.next;
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

    /** Add a node of value val before the index-th node in the linked list.
     * If index equals to the length of linked list,
     * the node will be appended to the end of linked list.
     * If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
//        第一种情况，当index大于链表的长度，则不将元素插入
        if(index > size){
            return;
        }
//        当index < 0时，拆入到元素头
        if(index < 0){
            index = 0;
        }
//      要插入原始时节点的个数要+1
        size++;
        ListNode pre = head;
        for(int i = 0;i < index;i++){
            pre = pre.next;
        }
//        定义要插入的节点
        ListNode toAdd = new ListNode(val);
//        首先将add的后指针连接到节点的后指针上，然后将节点的下一个指针，连接到要拆入的节点上
        toAdd.next  = pre.next;
        pre.next = toAdd;

    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
//      当要删除的索引，小于0或者查过节点的个数，不删除元素
        if(index > size || index < 0)
        {
            return;
        }
        size--;
        ListNode pre = head;
        for(int i = 0; i < index;i++){
            pre = pre.next;
        }
        pre.next = pre.next.next;

    }
}
