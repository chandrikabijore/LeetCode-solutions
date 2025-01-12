class Solution {
    public boolean canBeValid(String s, String locked) {
        int n = s.length();
        if (n % 2 != 0) return false;

        int open = 0, close = 0, unlocked1 = 0, unlocked2 = 0;
        for (int i = 0; i < n; i++) {
            // Left-to-right
            if (locked.charAt(i) == '0') unlocked1++;
            else if (s.charAt(i) == '(') open++;
            else if (s.charAt(i) == ')') open--;
            if (open + unlocked1 < 0) return false;

            // Right-to-left
            int j = n - i - 1;
            if (locked.charAt(j) == '0') unlocked2++;
            else if (s.charAt(j) == ')') close++;
            else if (s.charAt(j) == '(') close--;
            if (close + unlocked2 < 0) return false;
        }
        return true;
    }
}
