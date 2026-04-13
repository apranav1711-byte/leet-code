/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> tree = new Stack<>();
        TreeNode current = root;
        while (current != null || !tree.isEmpty()) {
            while (current != null) {
                tree.push(current);
                current = current.left;
            }
            current = tree.pop();
            list.add(current.val);

            current = current.right;
        }
        return list;
    }
}
