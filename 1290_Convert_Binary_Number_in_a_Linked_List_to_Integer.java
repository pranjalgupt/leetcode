class Solution {
    public int getDecimalValue(ListNode head) {
        int n=head.val;
        while(head.next!=null){
            n=n*2+head.next.val;
            head=head.next;
        }
        return n;
    }
}