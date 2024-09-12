class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean present[] = new boolean[123];
        for(char ch : allowed.toCharArray()) {
            present[ch] = true;
        }
        int result = 0;
        for(String str : words) {
            if(check(str, present)) result++;
        }
        return result;
    }
    boolean check(String str, boolean[] present) {
        for(int i = 0; i < str.length(); i++) {
            if(present[str.charAt(i)] == false) return false;
        }
        return true;
    }
}
