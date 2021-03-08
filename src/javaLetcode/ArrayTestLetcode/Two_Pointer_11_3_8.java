package javaLetcode.ArrayTestLetcode;

/**
 * @author yulinsheng

 */
public class Two_Pointer_11_3_8 {

}

class Solution {
    public int maxArea(int[] height) {
//      定义前后指针
        int i = 0;
        int j = height.length-1;
//        定义最大面积
        int maxarea = 0;
//        循环读取数据，当i和j不想等时，找到area的最大值
        while(i!=j){
            if(maxarea < (j-i)*(Math.min(height[i],height[j]))){
                maxarea = (j-i)*(Math.min(height[i],height[j]));

            }
//            由于面积限制于最小的值，因此通过谁最小判断，谁进谁退
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxarea;
    }
}