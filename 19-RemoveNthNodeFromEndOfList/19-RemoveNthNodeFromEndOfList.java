// Last updated: 7/14/2026, 2:12:43 PM
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        temp=head;
        System.out.println(size);
        int i=1;
        if(size-n==0){
            return head.next;
        }
        while(i<size-n){
            temp=temp.next;
            i++;
        }
        if(temp.next!=null)
            temp.next=temp.next.next;
        
        return head;
    }
}