package javaLetcode.chain;

/**
 * @author yulinsheng
 */
public class Chain203 {
    public static void main(String[] args) {

    }
}
//这个容易理解，利用一个虚拟头节点信息，将后面的所有节点信息重新排列。
class Solution203Two{
    public ListNode removeElements(ListNode head,int val){
//        建立一个虚拟头节点
        ListNode dummyNode = new ListNode(0);
//        将头节点连接到链表中
        dummyNode.next = head;
//        获得新的链表的头节点指针
        ListNode pre = dummyNode;
//        对指针进行循环，找到与val值相同的节点。
//        当找到与val值相同的节点时，将当前节点的下一个指针，变成下下个指针。
        while(pre.next != null){
            if(pre.next.val ==val){
                pre.next = pre.next.next;
            }
//            若与val节点不相同时，将指针进行改变。
            else{
                pre = pre.next;
            }
        }



        return dummyNode.next;
    }

}
/*
    没太看懂
 */
class Solution203{
    public ListNode removeElements(ListNode head,int val){
//        首先考虑
        while(head!=null && head.val == val) {
            head = head.next;
        }
        if(head == null){
            return head;
        }
//        将头节点给新定义的节点
        ListNode pre = head;
        while(pre.next!=null){
            if(pre.next.val == val){
                pre.next = pre.next.next;
            }
            else{
                pre = pre.next;
            }
        }



        return head;
    }
}