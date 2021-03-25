package arrayall.ArrayTestLetcode;

/**
 * @author yulinsheng
 * @time 2021-03-25 21:40
 */
public class ArrayMove189 {
}
/*
    最简单想法就是每个元素改变值是代表 nums.length+k对nums.length取余
 */
class Solution189Two{
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int [] newArr = new int [n];
        for(int i = 0;i < n;i++){
            newArr[(i+k)%n] = nums[i];
        }
        for(int i = 0;i < n;i++){
            nums[i] = newArr[i];
        }
//        数组复制
//        System.arraycopy(newArr,0,nums,0,n);
    }

}
// 简单思路，考虑到前一个元素没变，后几个元素没变，只是位置稍微改变了一下。（内存占用较大，循环较多）想的比较多
class Solution189 {
    public void rotate(int[] nums, int k) {
//        定义一个新的数组，存储结果
        int [] res = new int [nums.length];
//        获得需要移动的次数，取余是为了防止k大整个数组的长度造成重复
        int x = k % nums.length;
//        将前面的元素后移，移动的个数是取余的值，循环将需要移动的值以此放入到新的数组中
        for(int i = x ;i < nums.length;i++){
            res[i] = nums[i-x];
        }
//        后面的元素前移动，移动的值也是取余后的值
        for(int i = 0;i < x;i++){
            res[i] = nums[nums.length-x+i];
        }
//        将新数组的值写入到原始数组中
        for(int i = 0;i < nums.length;i++){
            nums[i] = res[i];
        }
    }
}