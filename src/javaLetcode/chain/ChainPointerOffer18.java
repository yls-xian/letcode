package javaLetcode.chain;

/**
 * @author yulinsheng
 * @time 2021-03-04-17:01
 * @email yls4314300@163.com
 */
public class ChainPointerOffer18 {
}
class SolutionPointerOffer18 {
    public ListNodeSingle deleteNode(ListNodeSingle head, int val) {
//        头元素相等的特殊情况。
        if (head.val == val) return head.next;
        ListNodeSingle pre = head,cur = head.next;
//       循环寻找相等的前后指针，当相等是跳出循环，此时cur指针指向相等的位置
        while(cur != null && cur.val != val)
        {
            pre = cur;
            cur = cur.next;
        }
//        删除节点操作
        if(cur != null) pre.next = cur.next;
        return head;
    }

}

