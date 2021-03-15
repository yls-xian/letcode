package javaLetcode.ArrayTestLetcode;

public class BinarySearch153 {

}

/*
    利用二分法查找
    可能会快点
 */

class Solution153Two {
    public int findMin(int[] nums) {
//        获得最后一个元素的值
        int last = nums[nums.length-1];
//        定义二分法模板，最大的索引和最小的索引值
        int left = 0;
        int right = nums.length-1;
//        当索引不相同时，循环查找
        while(left <= right){
//            获得中间元素的索引
            int mid = (left + right) / 2;
//            将元素中间值与最后的值比较
//            最后的值小于中间的值，则最小值在右边元素
            if(last < nums[mid])
            {
                left = mid + 1;
            }
//            如果大于中间元素，则最小值在左边元素区，同时改变最小值的结果
            else{
                right = mid - 1;
                last = nums[mid];
            }

        }
//        最终返回最小值
        return last;
    }
}
