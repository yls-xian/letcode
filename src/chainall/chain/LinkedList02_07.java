package chainall.chain;
import java.util.HashSet;

public class LinkedList02_07 {
}


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
class Solution02_07 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode result = null;
        while(headA != null){
            set.add(headA);
            headA = headA.next;
        }
        while(headB !=null){
            if(set.contains(headB))
            {
                result = headB;
                break;
            }
            headB = headB.next;
        }
        return result;
    }
}