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
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String num1 = "";
        String num2 = "";
        while (l1 != null) {
            num1 = l1.val + num1;
            l1 = l1.next;
        }
        while (l2 != null) {
            num2 = l2.val + num2;
            l2 = l2.next;
        }
        java.math.BigInteger n1 = new java.math.BigInteger(num1);
        java.math.BigInteger n2 = new java.math.BigInteger(num2);
        java.math.BigInteger sum = n1.add(n2);
        String s = sum.toString();
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int i = s.length() - 1; i >= 0; i--) {
            current.next = new ListNode(s.charAt(i) - '0');
            current = current.next;
        }
        return dummy.next;
    }
}
