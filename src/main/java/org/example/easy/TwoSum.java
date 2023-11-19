package org.example.easy;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] twoSum = new int[2];
        boolean isTrue = false;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target) {
                    twoSum[0] = i;
                    twoSum[1] = j;
                    isTrue = true;
                    break;
                }
            }
            if (isTrue) {
                break;
            }
        }
        return twoSum;
    }
}
