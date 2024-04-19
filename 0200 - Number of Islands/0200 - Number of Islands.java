class Solution {
    class pair{
        int first;
        int second;
        public pair(int first,int second){
            this.first=first;
            this.second=second;
        }
    }
    public void bfs(int r,int c,int[][] vis,char[][] grid){
        vis[r][c]=1;
        int n=grid.length;
        int m=grid[0].length;
        Queue<pair>q=new LinkedList<pair>();
         int[] arow={-1,0,0,1};
        int[] acol={0,-1,+1,0};
        q.offer(new pair(r,c));
        while(!q.isEmpty()){
            int row=q.peek().first;
            int col=q.peek().second;
            q.remove();
            for(int i=0;i<arow.length;i++){
                
                    int newrow=row+arow[i];
                    int newcol=col+acol[i];
                    if(newrow>=0 && newrow<n && newcol>=0 && newcol<m && vis[newrow][newcol]==0 && grid[newrow][newcol]=='1'){
                        vis[newrow][newcol]=1;
                        q.add(new pair(newrow,newcol));
                        
                    }
                }
            }

        }
        
    
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        int [][]vis =new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==0 && grid[i][j]=='1'){
                    count++;
                    bfs(i,j,vis,grid);
                }
            }
        }
        return count; 
    }
}
