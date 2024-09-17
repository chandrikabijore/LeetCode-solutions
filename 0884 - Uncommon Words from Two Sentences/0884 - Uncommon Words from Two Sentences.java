class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String [] str1 = s1.split(" ");
        String [] str2 = s2.split(" ");

        HashMap<String, Integer> map = new HashMap<>();
        for(String s : str1){
            map.put(s, map.getOrDefault(s,0)+1);
        }

        for(String s : str2){
            map.put(s, map.getOrDefault(s,0)+1);
        }

        List<String> list = new ArrayList<>();
        for(String i : map.keySet()){
            if(map.get(i)==1) list.add(i);
            
        }
        String [] arr = new String[list.size()];
        for(int i=0; i<list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}
