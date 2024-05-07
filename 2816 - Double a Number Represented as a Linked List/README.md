[2816. Double a Number Represented as a Linked List](https://leetcode.com/problems/double-a-number-represented-as-a-linked-list/?envType=daily-question&envId=2024-05-07)
---------------------------------------------------------------------------------------------------------------------------------------------

### Medium
---------------------------------------------------------------------------------------------------------------------------------------------

You are given the `head` of a **non-empty** linked list representing a non-negative integer without leading zeroes.

Return _the `head` of the linked list after **doubling** it_.

#### Example 1:
![2816-e1](https://github.com/chandrikabijore/LeetCode-solutions/assets/93921178/c654f10b-3e8d-4ec6-98d2-0ca731182771)
```
Input: head = [1,8,9]
Output: [3,7,8]
Explanation: The figure above corresponds to the given linked list which represents the number 189. Hence, the returned linked list represents the number 189 * 2 = 378.
```
#### Example 2: 
![2816-e2](https://github.com/chandrikabijore/LeetCode-solutions/assets/93921178/b7b4af4b-5821-4931-b12a-df2d14be19dc)
```
Input: head = [9,9,9]
Output: [1,9,9,8]
Explanation: The figure above corresponds to the given linked list which represents the number 999. Hence, the returned linked list reprersents the number 999 * 2 = 1998. 
```
#### Constraints:
```
The number of nodes in the list is in the range [1, 104]
0 <= Node.val <= 9
The input is generated such that the list represents a number that does not have leading zeros, except the number 0 itself.
```
