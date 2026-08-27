/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        int length = 0;
        ListNode fast = head ;
        ListNode slow = head ;
        while (fast!=null && fast.next!=null){
            fast = fast.next.next ;
            slow = slow.next ;
            if (slow ==fast ){
           length= cyclelength(slow);
           break ;
            }
        }
        ListNode s = head ;
        ListNode f = head ;
        if (length==0){
            return null;
        }
        while (length>0){
            s=s.next;
            length--;
        }
        while (s!=f){
            s= s.next;
            f = f.next;
        }
        return s;
    }
    
    public int cyclelength(ListNode head ){
          ListNode fast = head ;
          ListNode slow = head ;
        while (fast!=null && fast.next!=null){
            fast = fast.next.next ;
            slow = slow.next ;
            if (slow ==fast ){
                ListNode temp =slow ;
                int length=0;
                do{
                    temp = temp.next;
                    length++;
                }while(temp!=slow);
                return length;
            }
        }
        return 0;
    }

}