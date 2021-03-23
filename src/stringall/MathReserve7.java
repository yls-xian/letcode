package stringall;

/**
 * @author yulinsheng
 * @time 2021-03-23 10:58
 */
public class MathReserve7 {
    public static void main(String[] args) {
        Solution7 s1 = new Solution7();
        int result = s1.reverse(321);
        System.out.println(result);
    }

}

//需要考虑越界问题
class Solution7 {
    public int reverse(int x) {

        int [] res = new int [32];
        long result = 0;
        int i = 0;
        int a = 0;
        if(x > 0){
            a = 1;
        }
        else{
            a = -1;
            x = -x;
        }
        while(x > 0){
            result = result*10 + x%10;
            x = x/10;

        }
//        while(x > 0){
//            res[i] = x % 10;
//            x = x / 10;
//            i++;
//
//        }
//        for(int j = 0;j < i;j ++ ){
//            result += res[j]*Math.pow(10,i-j-1);
//        }
         if( (result <=  Math.pow(-2,31)) || (result >= (Math.pow(2,31)-1)) ){
             return 0;
         }
        return (int)(a*result);
    }
}