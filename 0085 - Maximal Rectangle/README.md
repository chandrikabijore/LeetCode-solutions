[85. Maximal Rectangle](https://leetcode.com/problems/maximal-rectangle/?envType=daily-question&envId=2024-04-13)
---------------------------------------------------------------------------------------------------------------------------------------------

### Hard
---------------------------------------------------------------------------------------------------------------------------------------------

Given a `rows x cols` binary `matrix` filled with `0`'s and `1`'s, find the largest rectangle containing only `1`'s and return its area.

#### Example 1:
![85-e1](https://github.com/chandrikabijore/LeetCode-solutions/assets/93921178/e277490c-5107-4cc3-b06c-40150fa3e62f)
```
Input: matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
Output: 6
Explanation: The maximal rectangle is shown in the above picture.
```
#### Example 2:
```
Input: matrix = [["0"]]
Output: 0
```
#### Example 3:
```
Input: matrix = [["1"]]
Output: 1
```
#### Constraints:
```
rows == matrix.length
cols == matrix[i].length
1 <= row, cols <= 200
matrix[i][j] is '0' or '1'.
```
