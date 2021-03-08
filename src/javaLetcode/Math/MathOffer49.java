package javaLetcode.Math;

/**
 * @author yulinsheng
 * @time 2021-03-08-17:24
 * @email yls4314300@163.com
 */
public class MathOffer49 {
    public static void main(String[] args) {
        int n = 15;
        int a = 0, b = 0, c = 0;
        int[] dp = new int[n];
        dp[0] = 1;
        for(int i = 1; i < n; i++) {
            int n2 = dp[a] * 2, n3 = dp[b] * 3, n5 = dp[c] * 5;
            dp[i] = Math.min(Math.min(n2, n3), n5);
            if(dp[i] == n2) a++;
            if(dp[i] == n3) b++;
            if(dp[i] == n5) c++;
        }
       for(int i = 0;i < dp.length;i++)
       {
           System.out.println(dp[i]);
       }
    }


    }

