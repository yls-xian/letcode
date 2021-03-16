package chainall.CircleChain;

import java.util.HashSet;

/**
 * @author yulinsheng
 * @time 2021-03-10-17:00
 * @email yls4314300@163.com
 */
public class CircleChain141 {
    public static void main(String[] args) {
        int fast = 3;
        int slow = 10;
        while (fast != slow){
            fast += 2;
            slow += 1;
        }
        System.out.println(fast);
        System.out.println(slow);
    }
}
//方法二，快慢指针
class SolutionCircleChain141Two{
    public boolean hasCycle(ListNode head){
        if(head == null || head.next == null){
            return  false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(slow != fast){
            if(fast == null || fast.next == null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
//方法一，HashSet
class SolutionCircleChain141{
    public boolean hasCycle(ListNode head){
        HashSet<ListNode> set = new HashSet<>();
//        如果set中存在元素，则add(相同元素)->false,判断
//        但是没有的元素会判断为true
        while(head != null){
            if(!set.add(head)){
                return true;
            }
        }
        return false;

    }
}