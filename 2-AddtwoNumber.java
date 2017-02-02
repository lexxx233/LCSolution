/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        
        ListNode res = new ListNode(0);
        
        while (l1 != null || l2 != null || carry != 0) {
            int t1 = (l1 != null)? l1.val:0;
            int t2 = (l2 != null)? l2.val:0;
            carry += t1 + t2;
            res.next = new ListNode(carry % 10);
            carry = carry / 10;
            
            l1 = (l1 == null)? l1 : l1.next;
            l2 = (l2 == null)? l2 : l2.next;
        }
        
        return res;
    }
}