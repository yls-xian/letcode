package chainall.chain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author yulinsheng
 * @time 2021-03-04-11:54
 * @email yls4314300@163.com
 */
public class ChainOffer06 {
}


class SolutionChainOffer06 {
    public int[] reversePrint(ListNode head) {
//        首先建立一个list列表
        List<Integer> arrRes = new ArrayList<Integer>();
//        初始化链表节点的个数为0
        int count = 0;
//        循环读取链表节点中的值，同时获得链表节点的个数
        while(head != null)
        {
            arrRes.add(head.val);
            head = head.next;
            count++;
        }
//        利用list的反转功能，将list的值反转
        Collections.reverse(arrRes);
//        定义一个数组
        int [] arr = new int [count];
//        循环获取list中的值，并将该值写入到数组中。
        for(int i = 0;i<arrRes.size();i++)
        {
            arr[i] = arrRes.get(i);
        }
        return arr;
    }
}