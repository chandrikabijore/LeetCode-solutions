package com.YouCanBro;

import java.util.Arrays;

public class SHEET_0010_Kth_Largest_Element_in_an_Array
{
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public static void main(String[] args) {
        SHEET_0010_Kth_Largest_Element_in_an_Array sc = new SHEET_0010_Kth_Largest_Element_in_an_Array();
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int result = sc.findKthLargest(nums, k);
        System.out.println("The " + k + "th largest element is " + result);
    }
}
