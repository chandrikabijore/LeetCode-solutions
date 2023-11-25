class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int max = 0;
        for(int i=0;i<nums.length;i++){
            int counter = 1;
            int num = nums[i];
            while(set.contains(--num)){
                counter++;
                set.remove(num);
            }
            num = nums[i];
            while(set.contains(++num)){
                counter++;
                set.remove(num);
            }
            if(counter > max){
                max = counter;
            }
        }
        return max;        
    }
}
