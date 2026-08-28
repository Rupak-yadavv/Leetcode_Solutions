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
    public boolean isPalindrome(ListNode head) {
     ListNode mid = middle(head);
     ListNode secondhead = reverseList(mid);
     ListNode temp = secondhead;
     while (head!=null && secondhead!=null){
        if (head.val !=secondhead.val){
            break;
        }
     
     head = head.next ;
     secondhead = secondhead.next ;
     }
     reverseList(temp);
     return head==null ||secondhead==null;
     }
     public ListNode middle (ListNode head ){
      ListNode fast = head;
      ListNode slow = head;
      while (fast!=null && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next ;
      } 
      return slow ;
     } 
     public ListNode reverseList(ListNode head) {
        if (head ==null){
            return head ;
        }
       ListNode prev = null;
       ListNode present = head ;
       ListNode next = present.next;
       while (present!=null){
        present.next = prev;
        prev = present;
        present = next ;
        if (next!=null){
            next = next.next;
        }
       }
       head =prev ;
       return prev ;
    }
     
}