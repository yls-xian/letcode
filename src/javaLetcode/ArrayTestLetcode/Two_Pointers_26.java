package javaLetcode.ArrayTestLetcode;

/**
 * @author yulinsheng
 * @time 2021-03-03-17:12
 * @email yls4314300@163.com
 */
public class Two_Pointers_26 {
}


class Solution26 {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0 || nums==null){return 0;}

//      定义快慢指针
        int i = 0;int j  = 1;
//      当j的值小于整个数据长度时，进行循环操作
        while(j < nums.length){
//            当块指针的值与慢指针的值不相等的时候，将慢指针后的元素替换成快指针的值，同时慢指针的值+1
            if(nums[i]!=nums[j]){
                nums[i+1] = nums[j];
                i++;
            }
//            每次循环结束后将快指针的值后推
            j++;
        }
//        最终i的值是最终不想等的元素的前一个，因为最终返回的是慢指针的值+1
        return i+1;


    }
}
