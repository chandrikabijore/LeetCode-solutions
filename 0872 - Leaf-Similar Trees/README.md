[872. Leaf-Similar Trees](https://leetcode.com/problems/leaf-similar-trees/?envType=daily-question&envId=2024-01-09)
---------------------------------------------------------------------------------------------------------------------------------------------

### Easy
---------------------------------------------------------------------------------------------------------------------------------------------

Consider all the leaves of a binary tree, from left to right order, the values of those leaves form a **leaf value sequence**.

![872-e1](https://github.com/chandrikabijore/LeetCode-solutions/assets/93921178/2ca4cea1-d89b-47e2-a503-4bd680793f51)

For example, in the given tree above, the leaf value sequence is **(6, 7, 4, 9, 8)**.

Two binary trees are considered leaf-similar if their leaf value sequence is the same.

Return **true** if and only if the two given trees with head nodes root1 and **root2** are leaf-similar.

#### Example 1:
![872-e2](https://github.com/chandrikabijore/LeetCode-solutions/assets/93921178/7eec239f-4714-479a-af61-3e08c9e8b6dc)
```
Input: root1 = [3,5,1,6,2,9,8,null,null,7,4], root2 = [3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]
Output: true
```
#### Example 2:
![873-e3](https://github.com/chandrikabijore/LeetCode-solutions/assets/93921178/1b6c0c9a-3ea0-479c-bf75-f51a570ba575)
```
Input: root1 = [1,2,3], root2 = [1,3,2]
Output: false
``` 
#### Constraints:
```
The number of nodes in each tree will be in the range [1, 200].
Both of the given trees will have values in the range [0, 200].
```
