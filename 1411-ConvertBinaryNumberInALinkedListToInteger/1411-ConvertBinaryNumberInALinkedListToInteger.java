// Last updated: 7/14/2026, 2:09:46 PM
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
