package javaLetcode.ArrayTestLetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author yulinsheng
 */
public class Array989 {
    public static void main(String[] args) {
        System.out.println(1/10);
    }
}



class Solution989 {
    public List<Integer> addToArrayForm(int[] A, int K) {
        int n = A.length;
        List <Integer> result = new ArrayList<Integer>();
        for(int i = n-1;i>=0;i--){
//           对K值取余获得值。
            int sum = A[i] + K%10;
//            将K值除以10获得剩下的元素值
            K /= 10;
//            一旦sum值大于10，将原始元素进位，同时将存储的值改变
            if(sum>=10){
                K++;
                sum -= 10;
            }
            result.add(sum);

        }
//        单独考虑当元素的值，超过数组的个数时
        for(;K>0;K/=10){
            result.add(K%10);
        }
        //不用考虑数组个数大于，因为1/10等于0，等于几个的时候
        Collections.reverse(result);
        return result;
    }
}