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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp=head;
        while(temp.next!=null){
            ListNode newnode=new ListNode(gcd(temp.val,temp.next.val));
            newnode.next=temp.next;
            temp.next=newnode;
            temp=temp.next.next;
        }
        return head;
    }
    public int gcd(int n1, int n2) {
   int min = n1 < n2 ? n1 : n2; 
   int max = n1 < n2 ? n2 : n1;
            while (min != 0) {
        int temp = min;        
        min = max % min;      
        max = temp;              
    }
    return max;         
}
 
}
