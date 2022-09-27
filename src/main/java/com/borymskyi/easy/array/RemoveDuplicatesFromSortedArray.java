package com.borymskyi.easy.array;

import java.util.Arrays;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class RemoveDuplicatesFromSortedArray {

    public static int[] removeDuplicates(int[] nums) {
        if (nums.length < 1) {
            throw new IllegalArgumentException("(nums.length < 1)");
        }
        int count = nums.length;
        for (int i = 0; i < count; i++) {
            for (int j = i+1; j < count; j++) {
                if (nums[j] == nums[i]) {
                    for (int k = j; k < count - 1; k++) {
                        nums[k] = nums[k+1];
                    }
                    if (i > 0) i--;
                    if (j > 0) j--;
                    count--;
                }
            }
        }
        int[] newArr = new int[count];
        for (int i = 0; i < count; i++) {
            newArr[i] = nums[i];
        }
        return newArr;
    }

    public static int[] removeDuplicatesStream(int[] nums) {
        return Arrays.stream(nums).distinct().toArray();
    }

    public static int[] removeDuplicatesThird(int[] A) {
        int j=0;
        for (int i=0; i<A.length; i++)
            if (A[i]!=A[j]) A[++j]=A[i];
        return A;
    }

    public static int[] removeDuplicatesFourth(int[] nums) {
        int temp = 1;
        for (int i = 1; i< nums.length;i++){
            if (nums[i - 1] != nums[i]){
                nums[temp] = nums[i];
                temp++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 1, 1};
        int[] ar2 = new int[] {1, 1, 2};
        int[] ar3 = new int[] {1, 1, 3, 3, 4, 5, 6, 6};
        int[] ar4 = new int[] {1, 1, 3, 3, 4, 5, 6, 1};
        int[] ar5 = new int[] {1};

        int[] getarr1 = removeDuplicates(ar4);
        int[] getarr2 = removeDuplicatesStream(ar4);
        int[] getarr3 = removeDuplicatesThird(arr);
        int[] getarr4 = removeDuplicatesThird(ar4);
        System.out.println(Arrays.toString(getarr4));
    }
}
