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
    public int[] nextLargerNodes(ListNode head) {
     if(head==null)
     return new int[0];
     ListNode temp=head,cur=temp.next;
     int n=0;
     while(temp!=null){
n++;
temp=temp.next;
     }
int arr[]=new int[n];
     temp=head;
     int p=0;
     while(temp.next!=null){
        if(temp.val>=cur.val){
            cur=cur.next;
        }
        else{
arr[p++]=cur.val;
temp=temp.next;
cur=temp.next;
        }
        if(cur==null&&temp.next!=null){
            arr[p++]=0;
            temp=temp.next;
            cur=temp.next;            
        }
     }
     return arr;   
    }
}
