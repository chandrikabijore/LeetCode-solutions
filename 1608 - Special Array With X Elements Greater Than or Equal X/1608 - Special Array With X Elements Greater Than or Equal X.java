package com.chandrikabijore;

import java.util.Arrays;

public class Special_Array
{
    public static void main(String[] args)
    {
        Solutions sol = new Solutions();

        int[] nums1 = {3, 5, 0, 0, 4, 1};
        int result1 = sol.specialArray(nums1);
        System.out.println("Test Case 1: " + result1 + "\n");  // Expected output: 3
        // 0, 0, 1, 3, 4, 5
        // 0 = 6
        // 0 = 5
        // 1 = 4
        // 3 = 3
        // 4 = 2
        // 5 = 1

        int[] nums2 = {0, 4, 3, 0, 4};
        int result2 = sol.specialArray(nums2);
        System.out.println("Test Case 2: " + result2 + "\n");  // Expected output: 3
        // 0, 0, 3, 4, 4
        // 0 = 5
        // 0 = 4
        // 3 = 3
        // 4 = 2
        // 4 = 2

        int[] nums3 = {3, 6, 7, 7, 0};
        int result3 = sol.specialArray(nums3);
        System.out.println("Test Case 3: " + result3 + "\n");  // Expected output: -1
        // 0, 3, 6, 7, 7
        // 0 = 5
        // 3 = 4
        // 6 = 3
        // 7 = 2
        // yha koi same number ni mila to X is not special then the o/p wil be -1

        int[] nums4 = {3, 9, 7, 8, 3, 8};
        int result4 = sol.specialArray(nums4);
        System.out.println("Test Case 4: " + result4 + "\n");  // Expected output: 4
        // 3, 3, 7, 8, 8, 9
        // 3 = 6
        // 3 = 6
        // 7 = 4
        // 8 = 3
        // 9 = 1
    }
}
class Solutions
{
    public int specialArray(int[] nums)
    {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int N = nums.length;
        
        if (nums[0] >= N)
        {
            return N;
        }

        for (int i = 1; i <= N; i++)
        {
            if (nums[N - i] >= i && (N - i - 1 < 0 || nums[N - i - 1] < i))
            {
                return i;
            }
        }
       return -1;
    }
}
