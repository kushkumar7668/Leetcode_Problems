/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    //     int c1 = length(headA);
    //     int c2 = length(headB);
    //     // ListNode tempA = headA;
    //     // ListNode tempB = headB;
    //     if(c1 > c2){
    //         for(int i = 1; i<= c1-c2; i++){
    //             headA  = headA.next;
    //         }
    //     }
    //    else{
    //         for(int i = 1; i<= c2-c1; i++){
    //             headB  = headB.next;
    //         }
    //     }
    //     while(headA != headB){
    //         headA = headA.next;
    //         headB= headB.next;
    //     }
    //     return headA;
    // }

    // public static int length(ListNode head){
      
    //     int count  = 0;
    //     while(head != null){
    //         count++;
    //         head = head.next;
    //     }
    //     return count;
//----------------------------------------------------------------------------//

    //  monu bhaiya method - vishal and vishal's gf :-
        ListNode v = headA;
        ListNode vgf = headB;

        while(v != vgf){
            if(v == null) v = headB;
            else v = v.next;

            if(vgf == null) vgf  = headA;
            else vgf = vgf.next;
        }
        return v;
    }
}