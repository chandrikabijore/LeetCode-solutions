class Solution {
    public int minCost(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        // Directions based on the arrow value:
        // 1 -> right   (dx = 0,  dy = +1)
        // 2 -> left    (dx = 0,  dy = -1)
        // 3 -> down    (dx = +1, dy = 0)
        // 4 -> up      (dx = -1, dy = 0)
        // For convenience, we'll store them in an array such that:
        // directions[d-1] = {dx, dy}
        int[][] directions = {
            { 0,  1},  // 1
            { 0, -1},  // 2
            { 1,  0},  // 3
            {-1,  0}   // 4
        };
        
        // dist[i][j] will store the minimum cost (number of changes) to reach (i, j)
        int[][] dist = new int[m][n];
        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        dist[0][0] = 0;
        
        // Use a double-ended queue (Deque) for 0-1 BFS
        Deque<int[]> deque = new ArrayDeque<>();
        deque.offer(new int[]{0, 0}); // Start from (0,0)
        
        while (!deque.isEmpty()) {
            int[] cell = deque.pollFirst();
            int x = cell[0], y = cell[1];
            int currentCost = dist[x][y];
            
            // 1) Follow the current arrow (0-cost move)
            int d = grid[x][y];
            int nx = x + directions[d - 1][0];
            int ny = y + directions[d - 1][1];
            if (isValid(nx, ny, m, n)) {
                if (currentCost < dist[nx][ny]) {
                    dist[nx][ny] = currentCost;
                    deque.offerFirst(new int[]{nx, ny});
                }
            }
            
            // 2) Change the arrow to each of the other 3 directions (1-cost move)
            for (int dir = 0; dir < 4; dir++) {
                if (dir + 1 == d) continue;  // Skip the original direction
                int cx = x + directions[dir][0];
                int cy = y + directions[dir][1];
                if (isValid(cx, cy, m, n)) {
                    int newCost = currentCost + 1;
                    if (newCost < dist[cx][cy]) {
                        dist[cx][cy] = newCost;
                        deque.offerLast(new int[]{cx, cy});
                    }
                }
            }
        }
        
        return dist[m - 1][n - 1];
    }
    
    // Helper to check if a cell is inside the grid
    private boolean isValid(int x, int y, int m, int n) {
        return (x >= 0 && x < m && y >= 0 && y < n);
    }
}
