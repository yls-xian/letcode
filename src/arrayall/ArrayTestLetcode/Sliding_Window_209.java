package arrayall.ArrayTestLetcode;

/**
 * @author yulinsheng
 * @time 2021-03-01-16:07
 * @email yls4314300@163.com
 */
/*
给定一个含有n个正整数的数组和一个正整数 target 。

找出该数组中满足其和 ≥ target 的长度最小的 连续子数组
[numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。

示例 1：
输入：target = 7, nums = [2,3,1,2,4,3]
输出：2
解释：子数组[4,3]是该条件下的长度最小的子数组。
示例 2：

输入：target = 4, nums = [1,4,4]
输出：1
示例 3：

输入：target = 11, nums = [1,1,1,1,1,1,1,1]
输出：0


来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/minimum-size-subarray-sum
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Sliding_Window_209 {
}

/*
    分析题目：
        这个题目理解起来，需要注意，需要求的是数组和中最小的数组链的长度，使得数组链的和
        大于target。
        比较简单的想法就是利用双层循环，找到其中最小的数组链的长度。（写起来需要注意很多地方）
        思路就是：
            一层循环读取所有的数据，中间套层循环计算数据和



 */
class Solution209 {
    public int minSubArrayLen(int target, int[] nums) {
        // 由于求的是最小的值，因此考虑到其中可能正好与数组的长度相同
        // 因此将最大的值定义为数组长度+1
        // 同时若不存在大于target的值，那么返回的值为0
        int result = nums.length + 1;
        //    一层循环读取数组中的各个数据。
        for(int i = 0;i < nums.length;i++){
            // 定义数组段的和的总值
//            数组和
            int sum = 0;
//            数组个数值
            int count = 0;
            // 二层循环开始寻找大于target的数据地址
            for(int j = i;j < nums.length;j++){
//                循环求和，一旦大于target,停止循环，并将当前长度值赋值给最终的结果值（同时判断长度是否是最小的）
                sum += nums[j];
                if(sum >= target){
                    count  = j - i + 1;
                    if(result > count){
                        result = count;
                    }
                    break;
                }
            }


        }
//        判断值是否改变，没有改变的话变成0，改变的话值不变
        if (result == nums.length + 1){
            return 0;
        }
        else {
            return result;
        }

    }
}

/*
    滑动窗口法，
    利用滑动窗口的方法，减小循环的次数
 */
class Solution209Two {
    public int minSubArrayLen(int target, int[] nums) {
        //   滑动窗口法
        // 利用双指针法，进行窗口的滑动
//        定义总的数组和值为0
        int sum = 0;
//        定义初始的循环指针的位置
        int j = 0;
//        定义最终的最小的长度
        int result = nums.length + 1;
//        循环得到数组的和
        for(int i = 0;i < nums.length;i++){
            sum += nums[i];
//            一旦数组的和大于或者等于target，则获得数组的长度
//            并且与原来的长度比较留下最小的
            // 同时改变初始的数组指针位置，后移一个
            while(sum >= target){
                int length = i - j + 1;
                if(length < result){ result = length; }
                sum -= nums[j++];

            }
        }
        if(result == nums.length + 1){return 0;}
        else{return result;}


    }
}