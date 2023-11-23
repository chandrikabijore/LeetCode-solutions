public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        
        // Find the left boundary
        int left = findLeftBoundary(nums, target);
        if (left == -1) {
            return result; // Target not found
        }
        
        // Find the right boundary
        int right = findRightBoundary(nums, target);
        
        result[0] = left;
        result[1] = right;
        return result;
    }
    
    private int findLeftBoundary(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int leftBoundary = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                leftBoundary = mid;
                right = mid - 1; // Continue searching on the left side
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }        
        return leftBoundary;
    }
    
    private int findRightBoundary(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int rightBoundary = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                rightBoundary = mid;
                left = mid + 1; // Continue searching on the right side
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return rightBoundary;
    }

    public static void main(String[] args) {
        Solution searchRange = new Solution();
        
        int[] nums1 = {5, 7, 7, 8, 8, 10};
        int target1 = 8;
        int[] result1 = searchRange.searchRange(nums1, target1);
        System.out.println(Arrays.toString(result1)); // Output: [3, 4]
        
        int[] nums2 = {5, 7, 7, 8, 8, 10};
        int target2 = 6;
        int[] result2 = searchRange.searchRange(nums2, target2);
        System.out.println(Arrays.toString(result2)); // Output: [-1, -1]
        
        int[] nums3 = {};
        int target3 = 0;
        int[] result3 = searchRange.searchRange(nums3, target3);
        System.out.println(Arrays.toString(result3)); // Output: [-1, -1]
    }
}
