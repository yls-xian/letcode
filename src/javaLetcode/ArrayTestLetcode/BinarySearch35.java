package javaLetcode.ArrayTestLetcode;
/*
编号35：搜索插入位置
给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
        你可以假设数组中无重复元素。

        示例 1:
        输入: [1,3,5,6], 5
        输出: 2

        示例 2:
        输入: [1,3,5,6], 2
        输出: 1

        示例 3:
        输入: [1,3,5,6], 7
        输出: 4

        示例 4:
        输入: [1,3,5,6], 0
        输出: 0
 */

/*
分析上题：
插入的位置有四种情况
    在所有元素之前
    在现有元素中间
    存在与值对应的元素
    在所有元素之后
 */
public class BinarySearch35 {
     public static void main(String [] args)
     {
         Solution s1 = new Solution();
         int [] a = {1,4,5,7,9,12};
         System.out.println(a.length);
         int target = 8;
         int result = s1.searchInsert(a,target);
         System.out.println(result);
     }


}

//硬解法
class Solution {
    public int searchInsert(int[] nums, int target) {
//        首先利用循环读取所有的数据
//        找到第一个大于或者等于target的元素，返回这个元素的下标
//        理解的话是，大于target的第一个元素，下标就是插入元素的下标，此时若相等则直接返回下标
//        [1,3,5,6]  4  找到的为5的下标，在5的下标出插入新的4元素
//        [1,3,5,6]  3  找到的为3的下标
//        [1,3,5,6]  0  找到的为1的下标，在1的下标出插入新的4元素
        for(int i = 0;i < nums.length;i++){
           if(nums[i] >= target){
               return i;
           }

       }
//        [1,3,5,6]  7  以上情况都没有找到，则再最后的位置插入新元素。
        return nums.length;

    }
}

/*
利用二分法查找元素
    二分法查找的前提是有序的（并且需要没有重复的数据）
    [1,4,7,8,9,11,15,17]
    二分法的原理

 */

class SolutionTwo {
    public int searchInsert(int[] nums, int target) {

//        定义最低索引和最高索引
        int max = nums.length-1;
        int min = 0;
//      当max和min不相等时循环寻找操作
        while(max >= min){
            int mid = (max + min) / 2;
//            当数值在中间数据的右边时
            if(target > nums[mid]){
//                最小索引变成中间数据右边第一个值
                min = mid + 1;
            }
//            当数据在中间数据的左边时
            else if(target < nums[mid]){
//                最大索引变成中间数据左边第一个值
                max = mid - 1;
            }
//            直接与中间数据相等时
            else{
                return mid;
            }

        }
//        [1,3,5,6,7]  4  [1,3] 5 [6,7]
//        第一次循环找到中间5这个元素，小于5 变成了在1，3中寻找
//        min = 0 max = 1
//        再次在[1,3]中寻找，没有此时 mid = 0
//        min = 1 max = 1 返回 2


//        [1,3,5,6]  4
//        min = 0 max = 3 mid = 1
//        第一次循环找到中间3这个元素，大于3
//        min = 2 max = 3 mid = 2
//        再次在[5,6]中寻找，找到元素5
//        min = 2 max = 1 返回 2
        return max+1;
    }
}

