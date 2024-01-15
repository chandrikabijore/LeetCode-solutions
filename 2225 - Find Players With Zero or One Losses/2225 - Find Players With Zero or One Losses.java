import java.util.*;

class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=matches.length;

        for(int i=0;i<n;i++){
            if(!map.containsKey(matches[i][0]))
                map.put(matches[i][0], 0);

            if(map.containsKey(matches[i][1]))
                map.put(matches[i][1], map.get(matches[i][1])+1);
            else
                map.put(matches[i][1], 1);
        }

        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();

        for(int key:map.keySet()){
            if(map.get(key)==0){
                list1.add(key);
            }
            if(map.get(key)==1){
                list2.add(key);
            }
        }

        Collections.sort(list1);
        Collections.sort(list2);
        res.add(list1);
        res.add(list2);
        return res;
    }
}
