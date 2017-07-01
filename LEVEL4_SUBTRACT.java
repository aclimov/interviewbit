/**
 * Created by alex_
 * Checkpoint: Level 4
 * SUBTRACT
 */
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode subtract(ListNode head) {
	    
	  ListNode p = head;
      ListNode m = head;
      int count=0;
       while(p!=null&&p.next!=null){

           p=p.next.next;
           m=m.next;
           count++;
       }
       ListNode prev = null;
       ListNode next = null;
       p=head;
       while(m!=null){
           next = m.next;
           m.next = prev;
           prev = m;
           m=next;
       }

       p=prev;
       m=head;
       while(count>0){
           m.val = p.val-m.val;

           p=p.next;
           m=m.next;
           count--;
       }
       p=prev;
       ListNode prev1 = null;
       while(p!=null){
           next = p.next;
           p.next = prev1;
           prev1 = p;
           p=next;
       }

       m.next = prev1.next;



        return head;
	    
	}
}
