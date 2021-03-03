package javaLetcode.ArrayTestLetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Two_Pointers_18 {
}


class Solution18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int len = nums.length;
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0;i < len - 3;i++ )
        {
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for( int j = i + 1; j < len - 2 ;j++)
            {
                if(j > i+1 && nums[j] == nums[j-1]) continue;
                int data = nums[i] + nums[j];
                int left = j + 1;
                int right = len - 1;
                while(left  < right){
                    int sum =  data + nums[left] + nums[right];
                    if(sum == target){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        lists.add(list);
                        while(left < right && nums[left+1] == nums[left]) left++;
                        while(left < right && nums[right-1] == nums[right]) right--;
                        left++;
                        right--;
                    }
                    else if(sum > target){
                        right--;
                    }
                    else{
                        left++;
                    }
                }
            }
        }
        return lists;

    }
}