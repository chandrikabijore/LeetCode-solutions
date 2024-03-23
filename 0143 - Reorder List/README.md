[143. Reorder List](https://leetcode.com/problems/two-sum/)
---------------------------------------------------------------------------------------------------------------------------------------------

### Medium
---------------------------------------------------------------------------------------------------------------------------------------------

You are given the head of a singly linked-list. The list can be represented as:

**L0 → L1 → … → Ln - 1 → Ln**

Reorder the list to be on the following form:

**L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …**

You may not modify the values in the list's nodes. Only nodes themselves may be changed.

#### Example 1:
![143 - e1](https://github.com/chandrikabijore/LeetCode-solutions/assets/93921178/4e9ff997-906d-4881-88c3-e4c014e694e8)
```
Input: head = [1,2,3,4]
Output: [1,4,2,3]
```
#### Example 2:
![143 - e2](https://github.com/chandrikabijore/LeetCode-solutions/assets/93921178/5982e188-ab50-451f-ae67-9dda15a045da)
```
Input: head = [1,2,3,4,5]
Output: [1,5,2,4,3]
```
#### Constraints:
```
The number of nodes in the list is in the range [1, 5 * 104].
1 <= Node.val <= 1000
```
