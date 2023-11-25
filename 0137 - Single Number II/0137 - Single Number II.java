class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        System.out.print(map);
        // int arr[] = new int[2];
        // int count = 0;
          for (Map.Entry<Integer,Integer> entry : map.entrySet()) 
            {
                if(entry.getValue() < 2) {
                    return  entry.getKey();
                }
            }
        return -1;
    }
}
