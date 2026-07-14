// Last updated: 7/14/2026, 2:10:48 PM
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
    public ListNode oddEvenList(ListNode head) {
        if(head==null)
        {
            return head;
        }
        ListNode t1=head;
        ListNode t2=t1.next;
        ListNode t3=t2;
        while(t1.next!=null && t1.next.next!=null)
        {
            t1.next=t2.next;
            t1=t1.next;
            t2.next=t1.next;
            t2=t2.next;
        }
        t1.next=t3;
        return head;
    }
}
