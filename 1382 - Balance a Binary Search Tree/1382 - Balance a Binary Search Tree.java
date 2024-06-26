/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
  List<Integer> list = new ArrayList<>();

  private void dfs(TreeNode node) {
    if (node == null) return;

    dfs(node.left);
    list.add(node.val);
    dfs(node.right);
  }

  private TreeNode constructTree(int l, int r) {
    if (l > r) return null;

    var m = l + (r - l) / 2;

    return new TreeNode(list.get(m), constructTree(l, m-1), constructTree(m+1, r));
  }

  public TreeNode balanceBST(TreeNode root) {
    dfs(root);
    return constructTree(0, list.size() - 1);
  }
}
