package javaLetcode.ArrayTestLetcode;
/*
给你一个包含 n 个整数的数组nums，判断nums中是否存在三个元素 a，b，c ，使得a + b + c = 0 ？
请你找出所有和为 0 且不重复的三元组。

注意：答案中不可以包含重复的三元组。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/3sum
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    题目分析
    1.首先找到特殊情况，如果存在数组中元素个数小于3，则直接输出为空数组
    2.利用双指针解法
        ①首先对数据进行排序，利用Arrays.sort(nums);
        ②遍历排序后的数组
            各种情况分析：
                Ⅰ 如果首个元素 > 0 则全体输出空矩阵  —> 已经对数组进行排序了，后面的元素不会小于0了。
                Ⅱ 由于答案中，不包含重复的元素（我的想法是，对数组元素变成集合的形式，然后变成数组类型进行判断，怎么实现有点问题）
                 对于重复的元素是跳过处理，避免出现重复的解
 */
public class Two_Pointers_15 {
    public static void main(String [] args)
    {
        System.out.println("Hello World");
    }

}

class Solution15 {
    public List<List<Integer>> threeSum(int[] nums)
    {
        int len = nums.length;
        Arrays.sort(nums);
        List <List<Integer>> lists = new ArrayList<>();
        for(int i = 0;i < len;i++)
        {
            if (nums[i] > 0)
            {
                return lists;
            }
            // 防止相同的数据输出的操作(当i开始循环后，并且前后两个值相同时跳出循环)
            if(i > 0 && nums[i] == nums[i-1]) continue;

            // 定义双指针
            int l = i+1;
            int r = len-1;
            // 当左右指针不相同时，一直进行循环
            while(l < r)
            {
                if(nums[i] + nums[l] +  nums[r] == 0 )
                {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    lists.add(list);
                    while(l < r && nums[l+1] == nums[l]) l++;
                    while(l < r && nums[r-1] == nums[r]) r--;
                    l++;
                    r--;
                }
            // 当值小于0时，此时nums[r]可能已经很大了，
            // 所以l的值增大，减小负值（理论上讲）
                else if(nums[i] + nums[l] +  nums[r] < 0)
                {
                l++;
            }
            else {
                r--;
            }
            }
        }
        return  lists;
    }


}
