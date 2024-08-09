class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int x = grid.length, y = grid[0].length, res=0;
        for(int i=0; i<=x-3; i++){
            for(int j=0; j<=y-3; j++){
                if(magicConditions(grid, i, j))
                    res++;
            }
        }
        return res;
    }

    private boolean magicConditions(int[][] grid, int x, int y) {
        boolean distinct = false;
        int sum = grid[x][y]+grid[x][y+1]+grid[x][y+2];
        for(int i=0; i<3; i++){
            int xsum = 0;
            int ysum = 0;
            for(int j=0; j<3; j++){
                if(grid[x+i][y+j]>9 || grid[x+i][y+j]<1){
                    return false;
                } else{
                    xsum = xsum + grid[x+i][y+j];
                    ysum = ysum + grid[x+j][y+i];
                }
                if(grid[x+i][y+j]!=5)
                distinct=true;
            }
            if(xsum!=sum || ysum!=sum){
                return false;
            }
        }
        if(!distinct){
            return false;
        }
        if(grid[x][y]+grid[x+1][y+1]+grid[x+2][y+2] != sum && sum != grid[x][y+2]+grid[x+1][y+1]+grid[x+2][y])
            return false;
        return true;
    }
}
