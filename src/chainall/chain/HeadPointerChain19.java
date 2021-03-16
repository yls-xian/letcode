package chainall.chain;

/**
 * @author yulinsheng
 * @time 2021-03-11-11:41
 * @email yls4314300@163.com
 */
public class HeadPointerChain19 {
    public static void main(String[] args) {
        System.out.println((-12)%(-5));
    }
}
//快慢指针法
class SolutionTwoPointer19{
    public ListNode removeNthFromEnd(ListNode head,int n){
//        定义两个指针，两个指针相差n，后一个指针达到的最后，则前一个指针指向的就是倒数第几个元素
        ListNode fast,slow;

        ListNode preHead = new ListNode(0);

//        构建头节点
        preHead.next = head;
        fast  = preHead.next;
        slow = preHead;
        for(int i = 0;i < n;i++)
        {
            fast = fast.next;
        }
        while(fast != null)
        {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
//        建立一个新的头节点
        ListNode newHead = new ListNode(0);
//        定义一个指针，指向原始的头节点
        ListNode cur = head;
//        将新定义的头节点连接到原始链表上
        newHead.next = head;
//        初始化链表的长度为0
        int count = 0;
        while(cur != null){
            count++;
            cur = cur.next;

        }
//        将原始的索引，定义到新的链表上
        cur = newHead;
//        循环读取到需要删除的节点的头一个节点上
        for(int i = 0;i < count - n;i++){
            cur = cur.next;
        }
//        将需要删除的节点跳过
        cur.next = cur.next.next;
        return newHead.next;

    }
}
