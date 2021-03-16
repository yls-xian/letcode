package arrayall.ArrayTestLetcode;
/*
输入：nums = [3,2,2,3], val = 3
输出：2, nums = [2,2]
解释：函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。
你不需要考虑数组中超出新长度后面的元素。
例如，函数返回的新长度为 2 ，而 nums = [2,2,3,3] 或 nums = [2,2,0,0]，也会被视作正确答案。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/remove-element
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

 */
public class TwoPointer27 {
    public static void main(String [] args){
        int [] arr = {1,2,2,3,4};
        int test = 2;
        Solution27  s1 = new Solution27();
        int result = s1.removeElement(arr,test);
        System.out.println(result);
    }
}

/*
    暴力写，两层循环
    一层循环查找数据，一层循环将数组中的数据提前。
 */
class Solution27 {
    public int removeElement(int[] nums, int val) {
//        初始化要返回的数据个数
        int size = nums.length;
//        一层循环读取数据，找到其中相似的
        for(int i = 0;i < nums.length;i++)
        {
//            如果相等的话，将数据前移
            if(nums[i] == val)
            {
//                返回的数据个数-1
                size--;
//                循环将需要的数据前移
                for(int j = i+1;j < nums.length;j++)
                {
                    nums[j-1] = nums[j];
                }
//                由于数据前移了一个，因此i索引需要重新判定
                i--;
            }
        }
        return size;
    }
}

//快慢指针
//将不重复的值，重新写入到数组中。
class Solution27Two {
    public int removeElement(int[] nums, int val) {
//        定义一个初始指针
        int i = 0 ;
//        循环读取数据
        for(int j = 0;j < nums.length;j++)
        {
//          循环读取的数据不与需要的数据相等时，重新写入到数组中
            if(nums[j] != val)
            {
                nums[i++] = nums[j];
            }
        }
//        返回数组中真正数据的个数
        return i;
    }
}