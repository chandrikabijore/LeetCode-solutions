import java.util.Stack;

public class Solution {
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        if (n < 3) {
            return false;
        }

        Stack<Integer> stack = new Stack<>();
        int max2 = Integer.MIN_VALUE;

        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] < max2) {
                return true;
            }
            while (!stack.isEmpty() && nums[i] > stack.peek()) {
                max2 = stack.pop();
            }
            stack.push(nums[i]);
        }

        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {1, 2, 3, 4};
        System.out.println(solution.find132pattern(nums1)); // Output: false

        int[] nums2 = {3, 1, 4, 2};
        System.out.println(solution.find132pattern(nums2)); // Output: true

        int[] nums3 = {-1, 3, 2, 0};
        System.out.println(solution.find132pattern(nums3)); // Output: true
    }
}
