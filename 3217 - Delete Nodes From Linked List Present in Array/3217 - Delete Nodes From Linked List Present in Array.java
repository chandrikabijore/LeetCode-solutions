/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        Stack<ListNode> stack = new Stack<>();
        ListNode current = head;

        for (int i : nums) set.add(i);
        while (current != null) {
            if (!set.contains(current.val)) {
                stack.push(current);
            }
            current = current.next;
        }
        ListNode newHead = null;
        while (!stack.isEmpty()) {
            ListNode node = stack.pop();
            node.next = newHead;
            newHead = node;
        }
        return newHead;
    }
}
