// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {
    public String tree2str(TreeNode root) {
        if (root == null) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        result.append(root.val);

        if (root.left != null || root.right != null) {
            result.append("(").append(tree2str(root.left)).append(")");
        }

        if (root.right != null) {
            result.append("(").append(tree2str(root.right)).append(")");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Example usage:
        Solution solution = new Solution();

        // Construct the binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.right = new TreeNode(3);

        // Output the result
        System.out.println(solution.tree2str(root));  // Output: "1(2(4))(3)"
    }
}
