[1026. Maximum Difference Between Node and Ancestor](https://leetcode.com/problems/maximum-difference-between-node-and-ancestor/?envType=daily-question&envId=2024-01-11)
---------------------------------------------------------------------------------------------------------------------------------------------

### Medium
---------------------------------------------------------------------------------------------------------------------------------------------

Given the **root** of a binary tree, find the maximum value **v** for which there exist **different** nodes **a** and **b** where **v = |a.val - b.val|** and **a** is an ancestor of **b**.

A node **a** is an ancestor of **b** if either: any child of **a** is equal to **b** or any child of **a** is an ancestor of **b**.

#### Example 1:
![1026-e1](https://github.com/chandrikabijore/LeetCode-solutions/assets/93921178/b23c5d83-2d49-4219-b969-5b8cad085894)
```
Input: root = [8,3,10,1,6,null,14,null,null,4,7,13]
Output: 7
Explanation: We have various ancestor-node differences, some of which are given below :
|8 - 3| = 5
|3 - 7| = 4
|8 - 1| = 7
|10 - 13| = 3
Among all possible differences, the maximum value of 7 is obtained by |8 - 1| = 7.
```
#### Example 2:
![1026-e2](https://github.com/chandrikabijore/LeetCode-solutions/assets/93921178/6dcd68d2-1e89-490f-a43d-892fd4d11c74)
```
Input: root = [1,null,2,null,0,3]
Output: 3
```
#### Constraints:
```
The number of nodes in the tree is in the range [2, 5000].
0 <= Node.val <= 105
```
