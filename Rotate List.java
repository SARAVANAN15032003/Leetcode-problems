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
    public ListNode rotateRight(ListNode head, int k) {
       if (head == null || head.next == null || k == 0)
            return head;
        int size=0;
        ListNode t=head;
        while(t!=null){
size++;
t=t.next;
        }
        k=k%size;
        for(int i=0;i<k;i++){
            ListNode temp=head;
           int n=temp.val;
            while(temp.next!=null){
                int y=temp.next.val;
                temp.next.val=n;
                n=y;
                temp=temp.next;
            }
            head.val=n;
        }
        return head;
    }
}
