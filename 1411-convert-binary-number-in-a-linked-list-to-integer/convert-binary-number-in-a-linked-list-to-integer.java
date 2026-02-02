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
    public int getDecimalValue(ListNode head) {
        //refer to codestorywithMIK for explaination
        //apprach 1 reverse ll and then use (head.val * Math.pow(2, index)) ->


        //approach 2 -> bit manipilation sort of thing
        int ans  = 0;
        while(head != null){
            ans = ans *2 + head.val;
            head = head.next;
        }

        return ans;
    }
}