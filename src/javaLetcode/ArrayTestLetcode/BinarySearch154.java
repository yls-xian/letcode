package javaLetcode.ArrayTestLetcode;

/*
把一个数组最开始的若干个元素搬到数组的末尾，
我们称之为数组的旋转。
输入一个递增排序的数组的一个旋转，
输出旋转数组的最小元素。
例如，数组[3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。

示例 1：

输入：[3,4,5,1,2]
输出：1

示例 2：

输入：[2,2,2,0,1]
输出：0

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

 */
public class BinarySearch154 {
    public static void main(String [] arg)
    {
        Solution154Two s1 = new Solution154Two();
        int [] arrTest = {4,0,1,1,2,3};
        int result = s1.minArray(arrTest);
        System.out.println(result);
    }
}

class Solution154 {
    public int minArray(int[] numbers) {
        int min = numbers[0];
        for(int i = 1;i<numbers.length;i++) {
            if(min > numbers[i]){
                min = numbers[i];
            }

        }
        return min;

    }
}

//由于存在重复数据，因此需要考虑多种情况
//首先，他是由两个数组组成，都是升序排列
class Solution154Two{
    public int minArray(int [] numbers){
        int left = 0;
        int right = numbers.length - 1;
        while(left <= right){
//            当左右不相等时，循环读取数据
//            获得中间值的索引
            int mid = (left + right) / 2;

/*
       用最右边元素与中间元素对比
       判断可能出现的情况，三种
                ① 右边元素大于中间元素
                ② 右边元素小于中间元素
                ③ 右边元素等于中间元素
 */
            if(numbers[mid] > numbers[right]){
                left = mid - 1;
            }
            else if(numbers[mid] < numbers[right]){
//                因为不能保证最小值不是mid的值，所以为了保证最小值，需要重新考虑这种情况
//                此外由于是升序排列的，因此此最小值在左半段
                right = mid;
            }
//            剩下的相等的情况，将left值后退（同样是考虑）
            else{
                left = left - 1;
            }
        }
        return numbers[right+1];

    }
}