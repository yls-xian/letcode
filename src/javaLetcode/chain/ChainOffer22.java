package javaLetcode.chain;

/**
 * @author yulinsheng
 * @time 2021-03-03-19:54
 * @email yls4314300@163.com
 */
public class ChainOffer22 {
}
//利用双指针的方式求，首先利用快慢指针，找到需要得到的节点个数，然后快慢指针同时移动，最终快指针达到终点结束循环
class SolutionOffer22Two {
    public ListNode getKthFromEnd(ListNode head, int k) {
//        定义快慢指针的头节点
        ListNode lres = head;
        ListNode rres = head;
        for(int i = 1;i <= k;i++)
        {
            rres = rres.next;
        }
        while(rres != null)
        {
            lres =  lres.next;
            rres = rres.next;
        }
        return lres;

    }

}

//简单思想，首先求出整个链表的长度，然后利用倒数值，求出正数的第几个节点
class SolutionOffer22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        int count = 1;
        ListNode result = head;
        while(head.next != null){
            count++;
            head = head.next;
        }
        for(int i = 1;i <= count - k ;i++){
            result = result.next;

        }
        return result;
    }
}