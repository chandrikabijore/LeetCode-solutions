package com.YouCanBro;

public class Leet_2486_Append_characters_to_string
{
    public int appendCharacters(String s, String t)
    {
        int m = s.length();
        int n = t.length();

        int i = 0, j = 0;                                           // Initialize two pointers i and j

        while (i < m && j < n)                                      // Iterate through both strings
        {
            if (s.charAt(i) == t.charAt(j)) j++;                    // If the characters match, move the pointer of string t (j)
            i++;                                                    // Always move the pointer of string s (i)
        }

        return n - j;                                               // The number of characters to append to s to make t a subsequence
    }

    public static void main(String[] args)
    {
        Leet_2486_Append_characters_to_string solution = new Leet_2486_Append_characters_to_string();

        // Test case 1
        String s1 = "coaching";
        String t1 = "coding";
        System.out.println("Test case 1: " + solution.appendCharacters(s1, t1)); // Expected output: 4
                                               // jitne char match ni honge utna o/p hoga
        // Test case 2
        String s2 = "abc";
        String t2 = "abcd";
        System.out.println("Test case 2: " + solution.appendCharacters(s2, t2)); // Expected output: 1

        // Test case 3
        String s3 = "abc";
        String t3 = "def";
        System.out.println("Test case 3: " + solution.appendCharacters(s3, t3)); // Expected output: 3

        // Test case 4
        String s4 = "a";
        String t4 = "aaaa";
        System.out.println("Test case 4: " + solution.appendCharacters(s4, t4)); // Expected output: 3

        // Test case 5
        String s5 = "abcd";
        String t5 = "abef";
        System.out.println("Test case 5: " + solution.appendCharacters(s5, t5)); // Expected output: 2
    }
}
