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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        
        ListNode cur = head;
        int size = 0;
        while(cur != null){
            cur = cur.next;
            size++;
        }
        k = k % size;
        if(k == 0) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = head;
        for(int i=0;i<k;i++){
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        ListNode newHead = slow.next;
        slow.next = null;
        ListNode temp = newHead;
        while(temp != null && temp.next!=null){
            temp = temp.next;
        }
        temp.next = dummy.next;
        
        return newHead;
         // ListNode dummy = new ListNode(head);
    }
}
