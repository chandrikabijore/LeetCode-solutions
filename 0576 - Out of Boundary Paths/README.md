[576. Out of Boundary Paths](https://leetcode.com/problems/out-of-boundary-paths/?envType=daily-question&envId=2024-01-26)
---------------------------------------------------------------------------------------------------------------------------------------------

### Medium
---------------------------------------------------------------------------------------------------------------------------------------------

There is an m x n grid with a ball. The ball is initially at the position [startRow, startColumn]. 
You are allowed to move the ball to one of the four adjacent cells in the grid (possibly out of the 
grid crossing the grid boundary). You can apply **at most** maxMove moves to the ball.

Given the five integers m, n, maxMove, startRow, startColumn, return the number of paths to move the
ball out of the grid boundary. Since the answer can be very large, return it **modulo** 109 + 7.

#### Example 1:
![576-e1](https://github.com/chandrikabijore/LeetCode-solutions/assets/93921178/54ce2bc9-1af2-46d4-98b9-0623ab154d34)
```
Input: m = 2, n = 2, maxMove = 2, startRow = 0, startColumn = 0
Output: 6
```
#### Example 2:
![576-e2](https://github.com/chandrikabijore/LeetCode-solutions/assets/93921178/129e43a2-c706-49aa-84fe-759dc478d0bb)
```
Input: m = 1, n = 3, maxMove = 3, startRow = 0, startColumn = 1
Output: 12
``` 
#### Constraints:
```
1 <= m, n <= 50
0 <= maxMove <= 50
0 <= startRow < m
0 <= startColumn < n
```
