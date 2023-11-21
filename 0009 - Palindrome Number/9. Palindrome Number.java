class Solution {
    public boolean isPalindrome(int x) {
    // Convert the integer to a string
    String str = Integer.toString(x);
    
    // Create a StringBuilder to reverse the string
    StringBuilder reversed = new StringBuilder(str);
    reversed.reverse();
    
    // Compare the original string with the reversed string
    return str.equals(reversed.toString());
}

}

