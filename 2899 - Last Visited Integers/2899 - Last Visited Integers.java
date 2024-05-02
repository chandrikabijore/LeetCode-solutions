import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> lastVisitedIntegers(int[] nums) {
        List<Integer> seen=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                seen.add(0,nums[i]);
            }
            else{
                if(i!=0 && nums[i-1]!=-1){
                    k=1;
                }
                else{
                    k++;
                }
                
                if(k<=seen.size()){
                    ans.add(seen.get(k-1));
                }
                else{
                    ans.add(-1);
                }
            }
        }
        return ans;
    }
}
