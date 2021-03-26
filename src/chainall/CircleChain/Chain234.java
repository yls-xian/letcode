package chainall.CircleChain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yulinsheng
 * @time 2021-03-26 18:53
 */
public class Chain234 {
}

//回文链表判断元素是否回文
class Solution {
    public boolean isPalindrome(ListNode head) {
//       初始化一个列表存储节点数据
        List<Integer> list = new ArrayList<>();
//       定义一个指针指向head节点
        ListNode temp = head;
//        循环节点，将节点的数据写入到list中
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
//        定义前后指针，循环判断是否是回文节点
        int left = 0;
        int right = list.size()-1;
//        左右指针不相等时继续循环，（不能用！=,防止偶数个数无线循环）
        while(left < right){
//            一旦前后的值不相等，就判断不是回文指针
            if(list.get(right) != list.get(left)){
                return false;

            }
//            相等的话继续判断下一个
            left++;
            right--;
        }
        return true;

    }
}