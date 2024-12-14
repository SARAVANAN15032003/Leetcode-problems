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
    public ListNode doubleIt(ListNode head) {
       List<Integer> list=new ArrayList<>();
       ListNode temp=head,prev=null;
       while(temp!=null){
list.add(temp.val);
prev=temp;
temp=temp.next;
       }
       int rem=0,u=0;
       for(int i=list.size()-1;i>=0;i--){
      u=(list.get(i)*2)+rem;
 ListNode newnode=new ListNode(u%10);
     if(u>9){
        rem=u/10;
     }
     else{
        rem=0;
     }
 newnode.next=prev.next;
prev.next=newnode;
       }
       if(rem>0){
        ListNode newnode=new ListNode(rem);
        newnode.next=prev.next;
prev.next=newnode;
       }
       head=prev.next;
        return head;
    }
}
