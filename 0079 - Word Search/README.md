[79. Word Search](https://leetcode.com/problems/two-sum/)
---------------------------------------------------------------------------------------------------------------------------------------------

### Easy
---------------------------------------------------------------------------------------------------------------------------------------------

Given an `m x n` grid of characters `board` and a string `word`, return `true` _if `word` exists in the grid_.

The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.

#### Example 1:
![79-e1](https://github.com/chandrikabijore/LeetCode-solutions/assets/93921178/325c67fd-c067-4dfa-b030-a363161ba2af)
```
Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
Output: true
```
#### Example 2:
![79-e2](https://github.com/chandrikabijore/LeetCode-solutions/assets/93921178/0bd97770-53b1-458f-8207-d0591d46b99e)
```
Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
Output: true
```
#### Example 3:
![79-e3](https://github.com/chandrikabijore/LeetCode-solutions/assets/93921178/61205c39-b5f9-448a-893a-10105f355534)
```
Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
Output: false
```
#### Constraints:
```
m == board.length
n = board[i].length
1 <= m, n <= 6
1 <= word.length <= 15
board and word consists of only lowercase and uppercase English letters.
``` 
