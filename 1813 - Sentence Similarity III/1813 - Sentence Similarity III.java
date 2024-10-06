public class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] s1 = sentence1.split(" ");
        String[] s2 = sentence2.split(" ");
        
        if (s1.length > s2.length) {
            int fi = 0, si = 0, flag = 0;
            while (fi < s2.length && si < s1.length && flag < 2) {
                if (s2[fi].equals(s1[si])) {
                    fi++;
                    si++;
                } else {
                    flag++;
                    int mf = 0;
                    for (int i = si + 1; i < s1.length; i++) {
                        if (s2[fi].equals(s1[i])) {
                            mf = i;
                        }
                    }
                    si = mf + 1;
                    fi++;
                }
            }
            if (si < s1.length) flag++;
            if (fi < s2.length) flag++;

            return flag <= 1;
        } else if (s1.length < s2.length) {
            int fi = 0, si = 0, flag = 0;
            while (fi < s1.length && si < s2.length && flag < 2) {
                if (s1[fi].equals(s2[si])) {
                    fi++;
                    si++;
                } else {
                    flag++;
                    int mf = 0;
                    for (int i = si + 1; i < s2.length; i++) {
                        if (s1[fi].equals(s2[i])) {
                            mf = i;
                        }
                    }
                    si = mf + 1;
                    fi++;
                }
            }
            if (si < s2.length) flag++;
            if (fi < s1.length) flag++;

            return flag <= 1;
        } else {
            for (int i = 0; i < s1.length; i++) {
                if (!s1[i].equals(s2[i])) {
                    return false;
                }
            }
            return true;
        }
    }
}
