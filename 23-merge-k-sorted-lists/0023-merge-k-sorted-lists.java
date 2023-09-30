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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> list = new ArrayList<>();
        
        if(lists.length == 0) return null;
        for(int i=0;i<lists.length;i++){
            ListNode head = lists[i];
             
            while(head != null){
                list.add(head.val);
                head = head.next;
            }
        }
         Collections.sort(list);
        if(list.size() == 0) return null;
        ListNode cur = new ListNode(list.get(0));
        ListNode n = cur;
        for(int i=1;i<list.size();i++){
            ListNode ans = new ListNode(list.get(i));
            n.next = ans;
            n = ans;
        }
        return cur;
    }
}
