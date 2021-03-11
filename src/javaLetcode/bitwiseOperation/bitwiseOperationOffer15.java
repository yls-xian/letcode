package javaLetcode.bitwiseOperation;

/**
 * @author yulinsheng
 * @time 2021-03-11-16:49
 * @email yls4314300@163.com
 */
public class bitwiseOperationOffer15{
    public static void main(String[] args) {

    }

}
class SolutionOffer15 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
//        逐个元素判断是否等于1
//        初始化1的个数为0
        int res = 0;
//        当n的值不会0时，循环操作
        while( n!= 0){
//            个数+1，每个位与1比较，如果是1则加1
            res += n&1;
//            n无符号左移一位
            n >>>= 1;
        }
        return res;
    }
}

//利用n&(n-1)的特性，最终得到0
class SolutionOffer15Two {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res  = 0 ;
        while(n!= 0){
            res++;
            n &= (n-1);
        }
        return res;
    }
    }