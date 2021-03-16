package arrayall.ArrayTestLetcode;

/**
 * @author yulinsheng

 */
public class round_59 {
}

class Solution59 {
    public int[][] generateMatrix(int n) {
        int [][] arr = new int [n][n];
        int l = 0;
        int r = n - 1;
        int b = n -1;
        int t = 0;
        int count =  1;
        int compare = n * n;
        while(count <= compare){
            // 从左到右循环
            for(int i = l;i <= r ;i++){
                arr[t][i] = count++;}
            //   循环结束后上边界下移了一个

            t++;
            //   从上到下循环
            for(int i = t ;i <= b  ; i++){
                arr[i][r] = count++;
            }
            //   循环结束后右边界少了一个
            r--;
            // 从右到左
            for( int i = r;i >= l;i--){
                arr[b][i] = count++;
            }
            // 循环结束后下边界少了一个
            b--;
            // 从下到上
            for(int i = b;i >= t;i--){
                arr[i][l] = count++;
            }
            // 左边界右移了一个
            l++;

        }
        return arr;
    }
}