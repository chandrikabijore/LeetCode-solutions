[988. Smallest String Starting From Leaf]( )
---------------------------------------------------------------------------------------------------------------------------------------------

### MEdium
---------------------------------------------------------------------------------------------------------------------------------------------

You are given the `root` of a binary tree where each node has a value in the range `[0, 25]` representing the letters `'a'` to `'z'`.

Return the **lexicographically smallest** string that starts at a leaf of this tree and ends at the root.

As a reminder, any shorter prefix of a string is **lexicographically smaller**.

- For example, `"ab"` is lexicographically smaller than `"aba"`.

A leaf of a node is a node that has no children.

#### Example 1:
![988-e1](https://github.com/chandrikabijore/LeetCode-solutions/assets/93921178/f483c031-d2e2-4661-b284-3c5698fbca83)
```
Input: root = [0,1,2,3,4,3,4]
Output: "dba"
```
#### Example 2:
![988-e2](https://github.com/chandrikabijore/LeetCode-solutions/assets/93921178/d84208f6-e273-40c1-aef5-d96ea9a91540)
```
Input: root = [25,1,3,1,3,0,2]
Output: "adz"
```
#### Example 3:
![988-e3](https://github.com/chandrikabijore/LeetCode-solutions/assets/93921178/44e5ce21-1452-47d7-a879-7bdf4439d6aa)
```
Input: root = [2,2,1,null,1,0,null,0]
Output: "abc"
```
#### Constraints:
```
The number of nodes in the tree is in the range [1, 8500].
0 <= Node.val <= 25
```
