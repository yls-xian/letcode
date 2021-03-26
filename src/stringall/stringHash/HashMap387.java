package stringall.stringHash;

import java.util.HashMap;

/**
 * @author yulinsheng
 * @time 2021-03-26 18:13
 */
public class HashMap387 {
}

//统计每个字符出现的次数，根据次数判断是否出现重复
class Solution387Two {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap();
        for(int i = 0;i < s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),2);
            }
            else {
                map.put(s.charAt(i), 1);
            }

        }
        for(int j = 0;j < s.length();j++){
            if(map.get(s.charAt(j)) == 1)
            {
                return j;
            }
        }
        return -1;
    }


}



//查找第一个不重复的字符，利用String自带的查找工具（第一次出现和最后一次出现的函数，只要两个函数的值相等即可判定没有重复）
class Solution387 {
    public int firstUniqChar(String s) {
        for(int i = 0;i < s.length();i++){
            if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))){
                return i;
            }
        }
        return -1;
    }
}

