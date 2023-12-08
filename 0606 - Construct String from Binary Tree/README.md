[606. Construct String from Binary Tree](https://leetcode.com/problems/construct-string-from-binary-tree/?envType=daily-question&envId=2023-12-08)
---------------------------------------------------------------------------------------------------------------------------------------------

### Easy
---------------------------------------------------------------------------------------------------------------------------------------------

Given the **root** of a binary tree, construct a string consisting of parenthesis and integers from a binary tree with the preorder traversal way, and return it.

Omit all the empty parenthesis pairs that do not affect the one-to-one mapping relationship between the string and the original binary tree.

#### Example 1:
![606-e1](https://github.com/chandrikabijore/LeetCode-solutions/assets/93921178/3075c1ef-af04-488b-8ec5-9bb52038731f)
```
Input: root = [1,2,3,4]
Output: "1(2(4))(3)"
Explanation: Originally, it needs to be "1(2(4)())(3()())", but you need to omit all the unnecessary empty parenthesis pairs. And it will be "1(2(4))(3)"
```
#### Example 2:
![606-e2](https://github.com/chandrikabijore/LeetCode-solutions/assets/93921178/7b70648a-5869-4951-b7cd-13397d1062b4)
```
Input: root = [1,2,3,null,4]
Output: "1(2()(4))(3)"
Explanation: Almost the same as the first example, except we cannot omit the first parenthesis pair to break the one-to-one mapping relationship between the input and the output.
``` 
#### Constraints:
```
The number of nodes in the tree is in the range [1, 104].
-1000 <= Node.val <= 1000
```
