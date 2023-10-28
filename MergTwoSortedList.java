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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3=null;   
        ListNode temp=null; 
        if(list1==null&&list2!=null)
        {
            return list2;
        }
        else if(list2==null&&list1!=null)
        {
            return list1;
        } 
        else if(list2==null&&list1==null)
        {
            return null;
        }
        list3=list2.val>list1.val?list1:list2;  
        temp=list3==list1?list2:list1;  
        list1=list3;
        while(list1!=null&&list2!=null)
        {
            while(list1.next!=null&&list1.next.val<temp.val)
            {
                list1=list1.next;
            }
            list2=temp.next;   
            temp.next=list1.next;
            list1.next=temp; 
            list1=list1.next;  
            temp=list2; 
            if(list2==null)
            {
            	break;
            }
            while(list1.next!=null&&list1.next.val<list2.val)
            {
                list1=list1.next;
            }
        } 
        return list3;
    }
}