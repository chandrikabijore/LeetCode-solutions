[1669. Merge In Between Linked Lists](https://leetcode.com/problems/merge-in-between-linked-lists/?envType=daily-question&envId=2024-03-20)
---------------------------------------------------------------------------------------------------------------------------------------------

### Medium
---------------------------------------------------------------------------------------------------------------------------------------------

You are given two linked lists: **list1** and **list2** of sizes **n** and **m** respectively.

Remove **list1**'s nodes from the **ath** node to the **bth** node, and put **list2** in their place.

The blue edges and nodes in the following figure indicate the result:

![1669 - e1 ](https://github.com/chandrikabijore/LeetCode-solutions/assets/93921178/43837bcb-5959-49a2-8af7-e98a8629b75d)

_Build the result list and return its head._

### Example 1:
![1669 - e2](https://github.com/chandrikabijore/LeetCode-solutions/assets/93921178/eddebf39-51f6-4749-b472-dba1375ef75c)
```
Input: list1 = [10,1,13,6,9,5], a = 3, b = 4, list2 = [1000000,1000001,1000002]
Output: [10,1,13,1000000,1000001,1000002,5]
Explanation: We remove the nodes 3 and 4 and put the entire list2 in their place. The blue edges and nodes in the above figure indicate the result.
```
### Example 2:
![1669 - e3](https://github.com/chandrikabijore/LeetCode-solutions/assets/93921178/ed2bc3b6-0cc4-4d9b-82ff-cb9ac335710f)
```
Input: list1 = [0,1,2,3,4,5,6], a = 2, b = 5, list2 = [1000000,1000001,1000002,1000003,1000004]
Output: [0,1,1000000,1000001,1000002,1000003,1000004,6]
Explanation: The blue edges and nodes in the above figure indicate the result.
``` 
### Constraints:
```
3 <= list1.length <= 104
1 <= a <= b < list1.length - 1
1 <= list2.length <= 104
```
