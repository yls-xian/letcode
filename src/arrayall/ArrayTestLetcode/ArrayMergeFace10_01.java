package arrayall.ArrayTestLetcode;
import java.util.Arrays;

public class ArrayMergeFace10_01 {
    public static void main(String[] args) {
        int [] a = new int []{1,6,9,11,11,};
        int [] b = new int []{2,5,6,7,9,14};
        Solution10_01 solutionTest = new Solution10_01();
        solutionTest.merge(a,5,b,6);
        Arrays.toString(a);
        System.out.println(a);
    }
}


class Solution10_01 {
    public void merge(int[] A, int m, int[] B, int n) {
        for(int i = 0;i < n;i++)
        {
            A[m + i] = B[i];
        }
        Arrays.sort(A);
    }
}

class Solution10_01Two {
    public void merge(int[] A, int m, int[] B, int n) {
        int i = 0,j = 0,temp = 0;
        int [] arr = new int [m+n];
        while(i!=m && j!=n)
        {
            if(A[i] > B[j]){
                arr[temp] = B[j];
                j++;
                temp++;
            }
            else{
                arr[temp] = A[i];
                i++;
                temp++;
            }
        }
        if(i == m){
            while(j!=n)
            {
                arr[temp] = B[j];
                j++;
                temp++;

            }
        }
        else{
            while(i!=m){
                arr[temp] = A[i];
                i++;
                temp++;
            }
        }
        for(int q = 0;q < (m+n);q++)
        {
            A[q] = arr[q];
        }
    }

}