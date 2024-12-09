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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)return null;
        List<Integer> list=new ArrayList<>();
        ListNode temp=head;
        while(temp.next!=null){
            if(temp.val==temp.next.val)
            list.add(temp.val);
            temp=temp.next;
        }
        temp=head;
while(head!=null&&list.contains(head.val)){
    head=head.next;
    
}
if(head!=null){
        temp=head;
        while(temp.next!=null){
            if(list.contains(temp.next.val)){
                temp.next=temp.next.next;
            }
            else
            temp=temp.next;
        }}
        return head;
    }
}
