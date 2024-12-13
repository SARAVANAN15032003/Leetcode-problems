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
    public ListNode swapNodes(ListNode head, int k) {
        int co=0;
        ListNode temp=head;
        while(temp!=null){
            co++;
            temp=temp.next;
        }
        temp=head;
        ListNode f=head;
        ListNode l=head;
        int la=co-k+1;
        System.out.print(la);
        for(int i=1;i<=co;i++){
if(i==k){
    f=temp;
}
 if(i==la){
    l=temp;

}
 temp=temp.next;
        }
        la=f.val;
        f.val=l.val;
        l.val=la;
        return head;
    }
}
