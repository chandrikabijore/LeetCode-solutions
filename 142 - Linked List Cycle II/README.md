[142. Linked List Cycle II](https://leetcode.com/problems/linked-list-cycle-ii/)
---------------------------------------------------------------------------------------------------------------------------------------------

### Easy
---------------------------------------------------------------------------------------------------------------------------------------------

Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.

Do not modify the linked list.

#### Example 1:
![142-e1](https://github.com/chandrikabijore/LeetCode-solutions/assets/93921178/f9c3b2f6-be61-480b-ae09-f06d53a2590f)
```
Input: head = [3,2,0,-4], pos = 1
Output: tail connects to node index 1
Explanation: There is a cycle in the linked list, where tail connects to the second node.
```
#### Example 2:
![142-e2](https://github.com/chandrikabijore/LeetCode-solutions/assets/93921178/dbebc102-b195-44a1-87ab-40379d451edc)
```
Input: head = [1,2], pos = 0
Output: tail connects to node index 0
Explanation: There is a cycle in the linked list, where tail connects to the first node.
```
#### Example 3:
![143-e3](https://github.com/chandrikabijore/LeetCode-solutions/assets/93921178/9ea72235-a787-4d2d-a890-faf762ed0bd2)
```
Input: head = [1], pos = -1
Output: no cycle
Explanation: There is no cycle in the linked list.
```
#### Constraints:
```
The number of the nodes in the list is in the range [0, 104].
-105 <= Node.val <= 105
pos is -1 or a valid index in the linked-list.
```
