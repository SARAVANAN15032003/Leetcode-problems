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
    public ListNode middleNode(ListNode head) {
        int sum=0,c=0;
        ListNode temp=head;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
    int y=(c/2);
    while(y>0){
        head=head.next;
        --y;
    }
    return head;
    }
}
