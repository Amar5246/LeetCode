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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr=head;  
        int size=0;
        while(curr!=null)
        {
            size++; 
            curr=curr.next;
        }  
        curr=head; 
        if(size==0||size==1)
        {
            head=null;
            return head;
        }
        int nth=1; 
        if(size==n)
        {
            return head.next;
        }
        while(nth!=size-n) 
        {
            curr=curr.next; 
            nth++;
        } 
        ListNode temp=curr; 
        temp=curr.next;
        curr.next=temp.next; 
        temp.next=null; 


        return head;

    }
}