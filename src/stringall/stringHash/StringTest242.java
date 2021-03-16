package stringall.stringHash;

import java.util.Arrays;

/**
 * @author yulinsheng
 * @time 2021-03-16 11:31
 */
public class StringTest242 {
}

//判断两个字符串是否是异位词
//aacc accc就不是异味词，需要考虑单词的个数和单词是否存在不同的字母
class Solution242 {
    public boolean isAnagram(String s, String t) {
//        首先获得字符串的长度
       int lengths = s.length();
       int lengtht = t.length();
//       一旦两个字符串不相等，直接返回
        if(lengths!=lengtht){
            return false;
        }
//        将字符串转换为数组类型
        char [] str1 = s.toCharArray();
        char [] str2 = t.toCharArray();
//        利用数组的排序将字符串数组排序
        Arrays.sort(str1);
        Arrays.sort(str2);
//        判断是否相等
        return Arrays.equals(str1,str2);
    }
}