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
    public ListNode deleteMiddle(ListNode head) {
        int co=0;
        ListNode temp=head;
        while(temp!=null){
            co++;
            temp=temp.next;
        }
        if(co==1)return head=null;
        co=(co/2);
        ListNode prev=null;
        temp=head;
        for(int i=0;i<co;i++){
prev=temp;
temp=temp.next;
        }
        prev.next=temp.next;
 return head;
    }
}
