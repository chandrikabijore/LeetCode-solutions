public class Solution {
    // you need to treat n as an unsigned value
    // we can check the right most bit if it is one then 
    // increment the count
    // and right shift the number by 1
    public int hammingWeight(int n) {
          int count = 0;
          
          while(n !=0 ){
              count += (n&1);
              n = n>>>1;
          }
        return count;
    }
}





