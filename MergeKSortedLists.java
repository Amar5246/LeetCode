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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> list=new ArrayList<>(); 
        for(ListNode i:lists)
        {
            ListNode temp=i; 
            while(temp!=null)
            {
                list.add(temp.val); 
                temp=temp.next;
            }
        } 
        Collections.sort(list);  
        ListNode head=new ListNode(); 
        ListNode curr=head;
        for(int i:list)
        {
           curr.next=new ListNode(i); 
           curr=curr.next;
        } 
        return head.next;
    }
}