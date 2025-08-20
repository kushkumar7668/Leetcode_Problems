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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy = head;
        ListNode small = new ListNode();
        ListNode large = new ListNode();
        ListNode sp = small;
        ListNode lp = large;
        while(head != null){
            if(head.val < x){
                sp.next = head;
                sp = sp.next;
            }
            else{
                lp.next = head;
                lp = lp.next;
            }
            head = head.next;
        }
        lp.next = null;
        sp.next = large.next;
        
        return small.next;
        
    }
}