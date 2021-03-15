package javaLetcode.ArrayTestLetcode;
/*
一个长度为n-1的递增排序数组中的所有数字都是唯一的，
并且每个数字都在范围0～n-1之内。
在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，
请找出这个数字。

示例 1:

输入: [0,1,3]
输出: 2
示例 2:

输入: [0,1,2,3,4,5,6,7,9]
输出: 8
 */
public class BinarySearch53 {
    public static void main(String [] args)
    {
        Solution53Two s2  = new Solution53Two();
        int [] arrTest = {0,1,2,3,5,6,7};
        int result = s2.missingNumber(arrTest);
        System.out.println(result);
    }
}

//硬解法
/*
思路
    这个问题其实很简单，就是从已经排好的数组序列中找到不存在的这个数即可，
    同时下标和数字是一一对应，因此返回的下标就是缺失的数字。
 */
class Solution53 {
    public int missingNumber(int[] nums) {
//循环读取数据
        for(int i = 0;i < nums.length;i++)
        {
//            当数据与索引值不对应时返回缺失的数据值
            while (i != nums[i]){
                return i;
            }
        }
//        当所有的情况都满足条件，返回缺失的最后一个数据
        return nums.length;
    }
}

/*
    二分法查找
    通过寻找中间元素与下标索引的值是否对应，判断值是否在前半段或者在后半段
 */
class Solution53Two {
    public int missingNumber(int[] nums) {
//        定义左右两个索引，套路
        int left = 0;
        int right = nums.length-1;
//        当左右索引不相等时，连续循环判断数据
        while(left <= right){
            int mid = (left + right) / 2;
//            当中间的索引与值相等时，缺失的数据就在后半段
            if(mid == nums[mid]){
                left = mid + 1;
            }
//            当不相等时缺失的就在左半段
            else{
                right = mid - 1;
            }

        }
        return right + 1;
    }
}
