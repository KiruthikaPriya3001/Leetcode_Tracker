// Last updated: 9/21/2026, 2:26:22 PM
class Solution {
    public int getDecimalValue(ListNode head) {
        int result =0;
        while(head != null){
            result = result * 2 + head.val;
            head = head.next;
        }
        return result;
    }
}
