class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode prev=list1;
        ListNode curr=new ListNode(-1);
        ListNode ans=curr;
        int k=-1;
        while(prev!=null){
            k++;
            if(k<a || k>b){
                curr.next=new ListNode(prev.val);
                curr=curr.next;
            }
            else if(k==a){
                while(list2!=null)
                {
                    curr.next=new ListNode(list2.val);
                    curr=curr.next;
                    list2=list2.next;
                }
            }
            prev=prev.next;
        }
        return ans.next;
    }
}