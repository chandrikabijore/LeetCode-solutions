import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public String[] longestSubsequence(int n, String[] words, int[] groups) {
        // Create a map to store words by their group
        Map<Integer, List<String>> groupToWords = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int group = groups[i];
            groupToWords.computeIfAbsent(group, k -> new ArrayList<>()).add(words[i]);
        }

        // Initialize the result as an empty list
        List<String> result = new ArrayList<>();

        // Iterate through the indices
        for (int i = 0; i < n; i++) {
            int currentGroup = groups[i];
            List<String> currentWords = groupToWords.get(currentGroup);
            String currentWord = words[i];

            // Check if the current group has more than one word
            if (currentWords.size() > 1) {
                result.add(currentWord);
                return result.toArray(new String[0]);
            }

            // Otherwise, find a word with Hamming distance 1 in a different group
            for (int j = 0; j < result.size(); j++) {
                String previousWord = result.get(j);

                if (currentWord.length() == previousWord.length()) {
                    int hammingDistance = 0;
                    for (int k = 0; k < currentWord.length(); k++) {
                        if (currentWord.charAt(k) != previousWord.charAt(k)) {
                            hammingDistance++;
                        }
                    }

                    if (hammingDistance == 1) {
                        result.add(currentWord);
                        return result.toArray(new String[0]);
                    }
                }
            }
        }

        // If no longer subsequence can be found, return an empty array
        return new String[0];
    }
}
