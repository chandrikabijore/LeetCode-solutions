class Solution {
    public int slidingPuzzle(int[][] board) 
    {
            String s = "123450";
    
    int m = board.length;
    int n = board[0].length;
    
    StringBuilder sb = new StringBuilder("");
    
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            sb.append(board[i][j]);
        }
    }
    
    HashSet<String> vis = new HashSet<>();
    
    vis.add(sb.toString());
    
    Queue<String> q = new LinkedList<>();
    
    q.add(sb.toString());
    
    int dir[][] = {{1,3},{0,2,4},{1,5},{0,4},{1,3,5},{2,4}};
    
    int count = 0;
    
    while(!q.isEmpty())
    {
        int size = q.size();
        
        for(int i=0;i<size;i++)
        {
            String rem = q.remove();
            
            if(rem.equals(s))
            {
                return count;
            }
            
            int idx = -1;
            
            for(int j=0;j<6;j++)
            {
                if(rem.charAt(j)=='0')
                {
                    idx=j;
                    break;
                }
            }
            
            for(int k =0;k<dir[idx].length;k++)
            {
                String str = swapEle(rem,idx,dir[idx][k]);
                
                if(!vis.contains(str))
                {
                    q.add(str);
                    vis.add(str);
                }
            }
        }
        
        count++;
    }
    
    return -1;
}

public String swapEle(String rem,int i,int j)
{
    StringBuilder sb=new StringBuilder(rem);
    
    sb.setCharAt(i,rem.charAt(j));
    sb.setCharAt(j,rem.charAt(i));
    
    return sb.toString();        
    }
}
