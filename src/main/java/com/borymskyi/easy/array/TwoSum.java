package com.borymskyi.easy.array;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (i+1 <= nums.length) {
                for (int j = i+1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
        }
        return new int[]{0};
    }

    public static void main(String[] args) {
        int[] nums = new int[] {3,2,3};
        int target = 6;
        int[] result = twoSum(nums, target);

        for (int i = 0; i < result.length; i++) {
            System.out.println("result: [" + result[i] + "]");
        }
    }
}