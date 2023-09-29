class Solution {
    public List<List<Integer>> threeSum(int[] A) {
        int X = 0;
        int n =A.length;
        Arrays.sort(A);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        HashSet<ArrayList<Integer>> set = new HashSet<>();
         for(int i=0;i<n;i++){
            int l = i+1;
             int r = n-1;
             while(l<r){
                   if((A[i] + A[l] + A[r]) == X){
                       ArrayList<Integer> l1 = new ArrayList<>();
                        l1.add(A[i]);
                       l1.add(A[l]);
                       l1.add(A[r]);
                       l++;
                       r--;
                          
                       if(!set.contains(l1)){
                           
                       set.add(l1);
                       list.add(l1);
                       }                     
                   }else if((A[i] + A[l] + A[r]) < X){
                       l++;
                   }else{
                       r--;
                   }
               }            
           }      
        return list;
    }
}
