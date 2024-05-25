class Solution {
    List<String> results;
    HashSet<String> dict;
    public List<String> wordBreak(String s, List<String> wordDict) {
        results = new ArrayList<>();
        dict = new HashSet<String>();
        for(String word: wordDict)dict.add(word);
        backTrack(s,0,new StringBuilder());
        return results;
        
    }
    
    public void backTrack(String s, int start, StringBuilder currentSentence){
        if(start==s.length()) results.add(currentSentence.toString().trim());
        for(int i = start; i<s.length();i++){
            if(dict.contains(s.substring(start,i+1))) {
                int len = currentSentence.length();
                currentSentence.append(s.substring(start,i+1));
                currentSentence.append(" ");
                backTrack(s,i+1,currentSentence);
                currentSentence.setLength(len);
            }
        }
    }
}
