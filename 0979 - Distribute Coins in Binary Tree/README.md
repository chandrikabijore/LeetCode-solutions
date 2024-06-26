[979. Distribute Coins in Binary Tree](https://leetcode.com/problems/distribute-coins-in-binary-tree/description/?envType=daily-question&envId=2024-05-18)
---------------------------------------------------------------------------------------------------------------------------------------------

### Medium
---------------------------------------------------------------------------------------------------------------------------------------------

You are given the `root` of a binary tree with `n` nodes where each `node` in the tree has `node.val` coins. There are `n` coins in total throughout the whole tree.

In one move, we may choose two adjacent nodes and move one coin from one node to another. A move may be from parent to child, or from child to parent.

Return _the **minimum** number of moves required to make every node have **exactly** one coin_.

#### Example 1:
![979-e1](https://github.com/chandrikabijore/LeetCode-solutions/assets/93921178/fe1e7d65-b1f7-4ab0-8d3d-6c208c8a5c09)
```
Input: root = [3,0,0]
Output: 2
Explanation: From the root of the tree, we move one coin to its left child, and one coin to its right child.
```
#### Example 2:
![979-e2](https://github.com/chandrikabijore/LeetCode-solutions/assets/93921178/9608496e-ecef-4ff3-98b0-f575bbf348c7)
```
Input: root = [0,3,0]
Output: 3
Explanation: From the left child of the root, we move two coins to the root [taking two moves]. Then, we move one coin from the root of the tree to the right child.
``` 
#### Constraints:
```
The number of nodes in the tree is n.
1 <= n <= 100
0 <= Node.val <= n
The sum of all Node.val is n.
```
