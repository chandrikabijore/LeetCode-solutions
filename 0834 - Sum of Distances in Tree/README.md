[834. Sum of Distances in Tree](https://leetcode.com/problems/sum-of-distances-in-tree/?envType=daily-question&envId=2024-04-28)
---------------------------------------------------------------------------------------------------------------------------------------------

### Hard
---------------------------------------------------------------------------------------------------------------------------------------------

There is an undirected connected tree with `n` nodes labeled from `0` to `n - 1` and `n - 1` edges.

You are given the integer `n` and the array `edges` where `edges[i] = [ai, bi]` indicates that there is an edge between nodes `ai` and `bi` in the tree.

Return an array `answer` of length n where `answer[i]` is the sum of the distances between the `ith` node in the tree and all other nodes.

#### Example 1:
![834-e1](https://github.com/chandrikabijore/LeetCode-solutions/assets/93921178/fcd108de-c2c0-465f-9ea4-0cad1150453d)
```
Input: n = 6, edges = [[0,1],[0,2],[2,3],[2,4],[2,5]]
Output: [8,12,6,10,10,10]
Explanation: The tree is shown above.
We can see that dist(0,1) + dist(0,2) + dist(0,3) + dist(0,4) + dist(0,5)
equals 1 + 1 + 2 + 2 + 2 = 8.
Hence, answer[0] = 8, and so on.
```
#### Example 2:
![834-e2](https://github.com/chandrikabijore/LeetCode-solutions/assets/93921178/a0c42141-659c-47cd-8b09-075020fec4b1)
```
Input: n = 1, edges = []
Output: [0]
```
#### Example 3:
![834-e3](https://github.com/chandrikabijore/LeetCode-solutions/assets/93921178/9bf023a7-2ef4-4640-b1e5-edb6fcdde471)
```
Input: n = 2, edges = [[1,0]]
Output: [1,1]
```
#### Constraints:
```
1 <= n <= 3 * 104
edges.length == n - 1
edges[i].length == 2
0 <= ai, bi < n
ai != bi
The given input represents a valid tree.
```
