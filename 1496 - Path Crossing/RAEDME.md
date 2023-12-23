[1496. Path Crossing](https://leetcode.com/problems/path-crossing/?envType=daily-question&envId=2023-12-23)
---------------------------------------------------------------------------------------------------------------------------------------------

### Easy
---------------------------------------------------------------------------------------------------------------------------------------------

Given a string path, where path[i] = 'N', 'S', 'E' or 'W', each representing moving one unit north, south, east, or west, respectively. You start at the origin (0, 0) on a 2D plane and walk on the path specified by path.

Return true if the path crosses itself at any point, that is, if at any time you are on a location you have previously visited. Return false otherwise.

#### Example 1:
![1496-e1](https://github.com/chandrikabijore/LeetCode-solutions/assets/93921178/0496c6d8-5d9f-432b-a783-af689b8278a6)
```
Input: path = "NES"
Output: false 
Explanation: Notice that the path doesn't cross any point more than once.
```
#### Example 2:
![1496-e2](https://github.com/chandrikabijore/LeetCode-solutions/assets/93921178/063e4985-a0b8-4ab4-93af-0c9ceb26c306)
```
Input: path = "NESWW"
Output: true
Explanation: Notice that the path visits the origin twice.
``` 
#### Constraints:
```
1 <= path.length <= 104
path[i] is either 'N', 'S', 'E', or 'W'.
```
