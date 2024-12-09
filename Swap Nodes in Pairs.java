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
    public ListNode swapPairs(ListNode head) {
        if(head==null)
        return null;
        ListNode temp=head;
        int co=0;
        while(temp.next!=null){
            if(co%2==0){
            int n=temp.val;
            temp.val=temp.next.val;
            temp.next.val=n;}
            co++;
            temp=temp.next;
        }
        return head;
    }
}
