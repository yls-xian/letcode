package javaLetcode.StackTest;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author yulinsheng
 * @time 2021-03-11-11:56
 * @email yls4314300@163.com
 */
public class ChainStack19 {
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 定义一个头节点连接原始链表
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        //   定义一个链表
        Deque<ListNode> stack = new LinkedList<ListNode>();
        ListNode cur = newHead;
        //   将元素写入到栈中
        while(cur != null){
            stack.push(cur);
            cur = cur.next;
        }
        //   循环返回出栈的元素
        for(int i = 0;i < n;i++){
            stack.pop();
        }
        //   获得栈顶元素（需要删除元素的前一个）
        ListNode prev = stack.peek();
        //   将需要删除的元素剔除
        prev.next = prev.next.next;
        return newHead.next;
    }
}