package org.example;


public class Solution {

    /**
     * Calculates the running sum of an array of integers.
     *
     * @param nums an array of integers
     * @return an array of running sums
     */
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }

        return nums;
    }
}
