[1361. Validate Binary Tree Nodes](https://leetcode.com/problems/validate-binary-tree-nodes/description/)
---------------------------------------------------------------------------------------------------------------------------------------------

### Medium
---------------------------------------------------------------------------------------------------------------------------------------------

You have **n** binary tree nodes numbered from **0** to **n - 1** where node **i** has two children **leftChild[i]** and **rightChild[i]**, return **true** if and only if **all** the given nodes form **exactly one** valid binary tree.

If node **i** has no left child then **leftChild[i]** will equal **-1**, similarly for the right child.

Note that the nodes have no values and that we only use the node numbers in this problem.

#### Example 1:
![1361 - e1](https://github.com/chandrikabijore/LeetCode-solutions/assets/93921178/2d364bb8-f052-4ae4-add6-e99b35828ca9)
```
Input: n = 4, leftChild = [1,-1,3,-1], rightChild = [2,-1,-1,-1]
Output: true
```
#### Example 2:
![1361 - e2](https://github.com/chandrikabijore/LeetCode-solutions/assets/93921178/82ea0bb8-2572-42c8-96db-78676ed810b7)
```
Input: n = 4, leftChild = [1,-1,3,-1], rightChild = [2,3,-1,-1]
Output: false
```
#### Example 3:
![1361 - e3](https://github.com/chandrikabijore/LeetCode-solutions/assets/93921178/f914d8b4-4965-4d56-9072-c3a65340dc35)
```
Input: n = 2, leftChild = [1,0], rightChild = [-1,-1]
Output: false
```
#### Constraints:
```
n == leftChild.length == rightChild.length
1 <= n <= 104
-1 <= leftChild[i], rightChild[i] <= n - 1
```
