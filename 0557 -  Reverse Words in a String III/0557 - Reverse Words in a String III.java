class Solution {
public String reverseWords(String s) {
        String[] arr= s.split(" ");
        String res=" ";
        for(int i = 0; i < arr.length; i++){
            String rev=" ";
            char[] ch=arr[i].toCharArray();
            for(int j = 0; j < ch.length; j++){
                rev = arr[i].charAt(j)+rev;
            }
            res+=rev;
        }
        return new String(res.trim());
    }            
}
