package org.example;

public class Main {
    public static void main(String[] args) {
        Solution tt = new Solution();
        int[] nums = {1, 2, 3, 4};
        tt.runningSum(nums);
        for(int val: nums) System.out.print(val+" ");
    }
}