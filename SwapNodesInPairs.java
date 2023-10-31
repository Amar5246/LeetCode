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
        ListNode curr=head;
        if(head==null||curr.next==null)
        {
            return head;
        }  
        ListNode temp=curr.next; 
        ListNode prv=head;
        while(curr.next!=null)
        {
            if(curr==head&&temp!=null){
            curr.next=temp.next; 
            temp.next=curr; 
            head=temp; 
            }  
            if(head.next.next==null)
            {
            	return head;
            }
            prv=curr;
            curr=curr.next; 
            temp=curr.next; 
            if(temp!=null) {
            prv.next=temp;  
            curr.next=temp.next; 
            temp.next=curr; 
            }
        } 
        return head;
    }
}