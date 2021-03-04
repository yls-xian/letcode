package javaLetcode.ArrayTestLetcode;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author yulinsheng
 * @time 2021-03-04-10:46
 * @email yls4314300@163.com
 */
public class HashSetOffer03 {
}

class SolutionOffer03{
    public int findRepeatNumber(int [] nums){
//        定义一个集合
        Set <Integer> set = new HashSet<Integer>();
//        定义重复的值
        int repeat = -1;
//        重复循环读取数组中的元素
        for(int num: nums){
//            一旦数组中的元素与集合中的元素不相等时，返回重复元素的值
            if(!set.add(num)){
                repeat = num;

            }
        }
        return repeat;



    }
}
