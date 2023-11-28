[2147. Number of Ways to Divide a Long Corridor](https://leetcode.com/problems/number-of-ways-to-divide-a-long-corridor/?envType=daily-question&envId=2023-11-28)
---------------------------------------------------------------------------------------------------------------------------------------------

### Hard
---------------------------------------------------------------------------------------------------------------------------------------------

Along a long library corridor, there is a line of seats and decorative plants. You are given a 0-indexed string corridor of length n consisting of letters 'S' and 'P' where each 'S' represents a seat and each 'P' represents a plant.

One room divider has already been installed to the left of index 0, and another to the right of index n - 1. Additional room dividers can be installed. For each position between indices i - 1 and i (1 <= i <= n - 1), at most one divider can be installed.

Divide the corridor into non-overlapping sections, where each section has exactly two seats with any number of plants. There may be multiple ways to perform the division. Two ways are different if there is a position with a room divider installed in the first way but not in the second way.

Return the number of ways to divide the corridor. Since the answer may be very large, return it modulo 109 + 7. If there is no way, return 0.

#### Example 1:
![2147-e1](https://github.com/chandrikabijore/LeetCode-solutions/assets/93921178/3a65b809-2a3a-4af4-b6fa-3b92a8ecfea8)
```
Input: corridor = "SSPPSPS"
Output: 3
Explanation: There are 3 different ways to divide the corridor.
The black bars in the above image indicate the two room dividers already installed.
Note that in each of the ways, each section has exactly two seats.
```
#### Example 2:
![2147-e2](https://github.com/chandrikabijore/LeetCode-solutions/assets/93921178/b4f7037a-6d26-4ff5-a6b9-d4666f28703b)
```
Input: corridor = "PPSPSP"
Output: 1
Explanation: There is only 1 way to divide the corridor, by not installing any additional dividers.
Installing any would create some section that does not have exactly two seats.
```
#### Example 3:
![2147-e3](https://github.com/chandrikabijore/LeetCode-solutions/assets/93921178/598237bc-11d9-478a-b296-aa301619d81d)
```
Input: corridor = "S"
Output: 0
Explanation: There is no way to divide the corridor because there will always be a section that does not have exactly two seats.
``` 
#### Constraints:
```
n == corridor.length
1 <= n <= 105
corridor[i] is either 'S' or 'P'.
```
