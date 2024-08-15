class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fiveCnt = 0, tenCnt = 0;
        for(var bill : bills){
            if(bill == 5)fiveCnt++;
            else if(bill == 10){
                if(fiveCnt == 0)return false;
                else fiveCnt--;
                tenCnt++;
            }else{
                if(fiveCnt == 0 || (fiveCnt < 3 && tenCnt == 0))return false;
                else{
                    if(tenCnt == 0)fiveCnt -= 3;
                    else{
                        fiveCnt--;
                        tenCnt--;
                    }
                }
            }
            
        }
        return true;
    }
}
