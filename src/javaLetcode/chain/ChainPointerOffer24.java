package javaLetcode.chain;

/**
 * @author yulinsheng
 * @time 2021-03-04-16:04
 * @email yls4314300@163.com
 */
public class ChainPointerOffer24 {
}
class SolutionPointerOffer24 {
    public ListNodeSingle reverseList(ListNodeSingle head) {
//        定义前一个节点和后一个节点
            ListNodeSingle pre = null;
            ListNodeSingle curr = head;
            while(curr != null)
            {
//                首先存储好下一个链表的指针
                ListNodeSingle next = curr.next;
//                然后将链表的指针互转，后一个指针变成前一个
                curr.next = pre;
//                改变后，将后一个指针变成当前节点
                pre = curr;
//                当前节点，继续下一个节点
                curr = next;
            }
            return pre;



    }
}

class SolutionRecurrenceOffer24 {
    public ListNodeSingle reverseList(ListNodeSingle head) {
//        当数据仅仅存在一个元素是不需要进行反转了
        if(head != null || head.next != null){
            return head;
        }
        //调用递归
        ListNodeSingle newHead = reverseList(head.next);
//        1 -> 2 -> 3 -> null   3->2->1->null
//        2 -> 3 -> null
//        将2这个节点的next 3的next变成1，变成了
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}