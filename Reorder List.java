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
    public void reorderList(ListNode head) {
        List<Integer> li1=new ArrayList<>();
        ListNode temp=head;
        boolean t=true;
        int size=0;
        while(temp!=null){
size++;
li1.add(temp.val);
temp=temp.next;
        }
        temp=head;
        System.out.println(li1);
    int i=0,j=li1.size()-1;    

while(temp!=null){
    if(t){
        temp.val=li1.get(i);
        //System.out.print(li1.get(i));
        i++;
        t=false;
    }
    else{
    temp.val=li1.get(j);
    //System.out.print(li1.get(j));
        j--;
        t=true;   
    }
    temp=temp.next;
}
        
    }
}
