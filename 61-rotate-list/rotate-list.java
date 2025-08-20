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
        
        if(k==0 || head == null || head.next == null) return head;
        ListNode curr = head;
        ListNode dummy = head;
        int size = length(head);
        while(dummy.next != null){
            dummy = dummy.next;
        }
        int n = k%size;
        if(n==0) return head;
        
        for(int i =0; i < size-n-1; i++){
            curr = curr.next;
        }

        ListNode newHead = curr.next;
        curr.next = null;
        dummy.next = head;

        return newHead;
        
    }

    public int length(ListNode head){
        int c = 0;
        while(head != null){
            c += 1;
            head = head.next;
        }
        return c;
    }
}