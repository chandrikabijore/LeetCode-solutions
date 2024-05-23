public class Main 
{
    public static void main(String[] args) 
    {
        Solution solution = new Solution();
      
        // Test cases
        int[] testCase1 = {1, 2, 3, 4};
        int[] testCase2 = {1, 2, 3, 1};
        int[] testCase3 = {1, 1, 1, 1};
        int[] testCase4 = {};
        int[] testCase5 = {1};
        
        // Running the tests
        System.out.println("Test Case 1: " + solution.containsDuplicate(testCase1)); // Expected: false
        System.out.println("Test Case 2: " + solution.containsDuplicate(testCase2)); // Expected: true
        System.out.println("Test Case 3: " + solution.containsDuplicate(testCase3)); // Expected: true
        System.out.println("Test Case 4: " + solution.containsDuplicate(testCase4)); // Expected: false
        System.out.println("Test Case 5: " + solution.containsDuplicate(testCase5)); // Expected: false
    }
}

class Solution 
{
    public boolean containsDuplicate(int[] nums) 
    {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }
}

