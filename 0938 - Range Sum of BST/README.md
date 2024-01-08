[938. Range Sum of BST](https://leetcode.com/problems/range-sum-of-bst/?envType=daily-question&envId=2024-01-08)
---------------------------------------------------------------------------------------------------------------------------------------------

### Easy
---------------------------------------------------------------------------------------------------------------------------------------------

Given the **root** node of a binary search tree and two integers **low** and **high**, return the sum of values of all nodes with a value in the inclusive range **[low, high]**.

#### Example 1:
![938-e1](https://github.com/chandrikabijore/LeetCode-solutions/assets/93921178/74bcc7ab-3d71-4eb8-8eca-d8fa25fe8890)
```
Input: root = [10,5,15,3,7,null,18], low = 7, high = 15
Output: 32
Explanation: Nodes 7, 10, and 15 are in the range [7, 15]. 7 + 10 + 15 = 32.
```
#### Example 2:
![938-e2](https://github.com/chandrikabijore/LeetCode-solutions/assets/93921178/9f32b3fd-7a2d-4bf7-86ae-a54f54f435b8)
```
Input: root = [10,5,15,3,7,13,18,1,null,6], low = 6, high = 10
Output: 23
Explanation: Nodes 6, 7, and 10 are in the range [6, 10]. 6 + 7 + 10 = 23.
```
#### Constraints:
```
The number of nodes in the tree is in the range [1, 2 * 104].
1 <= Node.val <= 105
1 <= low <= high <= 105
All Node.val are unique.
```
