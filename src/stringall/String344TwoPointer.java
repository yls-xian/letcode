package stringall;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author yulinsheng
 * @time 2021-03-23 10:19
 */
public class String344TwoPointer {
    public static void main(String[] args) {
        char [] s = new char []{'h','e','l','l','o','w'};
        Solution344Two s1 = new Solution344Two();
        s1.reverseString(s);
        System.out.println(s);
    }

}

//耗内存还慢，用系统自带的反转方法Collections.reverse()
class Solution344Two {
    public void reverseString(char[] s) {
        ArrayList<Character> arr = new ArrayList<Character>();
        for (int i = 0; i < s.length; i++) {
            arr.add(s[i]);
        }
//
        Collections.reverse(arr);
        for (int j = 0; j < arr.size(); j++) {
            s[j] = arr.get(j);

        }
    }
}
//双指针
class Solution344 {
    public void reverseString(char[] s) {
//        定义一个前指针，一个后指针，循环读取数据
        int i = 0;
        int j = s.length-1;
//        不能是i!=j,容易超过索引值
        while(i < j){
//            将前后指针的值交换
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}