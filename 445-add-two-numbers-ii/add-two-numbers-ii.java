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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        Stack<Integer> st3 = new Stack<>();
        while(l1 !=null || l2 != null){
            if(l1 != null){
                st1.push(l1.val);
                l1 = l1.next;
            }
            if(l2 != null){
                st2.push(l2.val);
                l2 = l2.next;
            }
            
        }
        // while(l2 !=null){
        //     st2.push(l2.val);
        //     l2 = l2.next;
        // }
        int carry = 0;
        while(!st1.isEmpty() && !st2.isEmpty()){
            int n = st1.pop() + st2.pop() + carry;
            carry = n/10;
            st3.push(n%10);
        }
        if(!st1.isEmpty()){
            while(!st1.isEmpty()){
                int n = st1.pop() +carry;
                carry = n/10;
                st3.push(n%10);
            }
        }
        else{
            while(!st2.isEmpty()){  
                int n = st2.pop() +carry;
                carry = n/10;
                st3.push(n%10);
            }
        }

        if(carry==1) st3.push(1);
        ListNode head = new ListNode(st3.pop());
        ListNode temp = head; 
        while(!st3.isEmpty()){
            ListNode neww = new ListNode(st3.pop());
            head.next = neww;
            head = head.next;
        }
        return temp;


    }
}