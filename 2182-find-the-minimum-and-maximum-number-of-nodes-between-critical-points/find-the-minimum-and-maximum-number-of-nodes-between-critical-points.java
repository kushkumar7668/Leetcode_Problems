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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] arr = new int[2];
        ListNode prev = head;
        ListNode front = head.next.next;
        ListNode dummy  = head.next;
        int i =1;
        int cFirst = -1, cprev = -1 , clast = -1, min = Integer.MAX_VALUE, max  = Integer.MIN_VALUE;
        while(front != null){
            if(dummy.val < prev.val && dummy.val < front.val || dummy.val > prev.val && dummy.val > front.val ){
                if(cFirst == -1){
                    cFirst = i;
                    cprev = i;
                }
                else{
                    if(clast == -1){
                        clast = i;
                    }
                    min = Math.min(min, i - cprev);
                    cprev = i;
                }

                max = Math.max(max, i - cFirst );
            }
            prev = prev.next;
            dummy = dummy.next;
            front = front.next;
            i++;
        }
        arr[0] = min == Integer.MAX_VALUE ? -1 : min;
        if(clast == -1) max = -1;
        arr[1] = max == Integer.MIN_VALUE ? -1 : max;
        return arr;
    }
}