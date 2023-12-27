[1578. Minimum Time to Make Rope Colorful](https://leetcode.com/problems/minimum-time-to-make-rope-colorful/?envType=daily-question&envId=2023-12-27)
---------------------------------------------------------------------------------------------------------------------------------------------

### Medium
---------------------------------------------------------------------------------------------------------------------------------------------

Alice has n balloons arranged on a rope. You are given a **0-indexed** string colors where colors[i] is the color of the ith balloon.

Alice wants the rope to be **colorful**. She does not want **two consecutive balloons** to be of the same color, so she asks Bob for help. Bob can remove some balloons from the rope to make it **colorful**. You are given a **0-indexed** integer array neededTime where neededTime[i] is the time (in seconds) that Bob needs to remove the ith balloon from the rope.

Return the **minimum time** Bob needs to make the rope **colorful**.

#### Example 1:
![1578-e1](https://github.com/chandrikabijore/LeetCode-solutions/assets/93921178/3f3a64a1-90d2-4942-8eee-75899dd10a80)
```
Input: colors = "abaac", neededTime = [1,2,3,4,5]
Output: 3
Explanation: In the above image, 'a' is blue, 'b' is red, and 'c' is green.
Bob can remove the blue balloon at index 2. This takes 3 seconds.
There are no longer two consecutive balloons of the same color. Total time = 3.
```
#### Example 2:
![1578-e2](https://github.com/chandrikabijore/LeetCode-solutions/assets/93921178/fcd4f348-0c49-4a28-85fc-3f1f6f62e665)
```
Input: colors = "abc", neededTime = [1,2,3]
Output: 0
Explanation: The rope is already colorful. Bob does not need to remove any balloons from the rope.
```
#### Example 3:
![1578-e3](https://github.com/chandrikabijore/LeetCode-solutions/assets/93921178/be15bb19-9254-42dd-b529-85ca7c6d6383)
```
Input: colors = "aabaa", neededTime = [1,2,3,4,1]
Output: 2
Explanation: Bob will remove the ballons at indices 0 and 4. Each ballon takes 1 second to remove.
There are no longer two consecutive balloons of the same color. Total time = 1 + 1 = 2.
``` 
#### Constraints:
```
n == colors.length == neededTime.length
1 <= n <= 105
1 <= neededTime[i] <= 104
colors contains only lowercase English letters.
```
