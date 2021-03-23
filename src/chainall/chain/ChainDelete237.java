package chainall.chain;

/**
 * @author yulinsheng
 * @time 2021-03-23 11:43
 */
public class ChainDelete237 {
    public static void main(String[] args) {

    }
}

//给定的是节点信息，正常的删除链表节点是获得要删除节点的上一个节点信息，然后将node.next = node.next.next
//这道题已经给定了需要删除的节点信息，我们可以将要删除的节点变成，下一个节点，然后将下一个节点删除即可。
class Solution237 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}