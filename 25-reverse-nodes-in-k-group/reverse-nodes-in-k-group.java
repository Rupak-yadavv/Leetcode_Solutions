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
    public ListNode reverseKGroup(ListNode head, int k) {
           if (k<=1 ||head==null){
          return head ;
          } 
         ListNode present = head ;
            ListNode prev = null;
            while(true){
                ListNode temp = present ;
                for (int i =0;i<k;i++){
                  if (temp==null ){
                    return head ;
                }
                   temp = temp.next ;
                }

            ListNode last = prev ;
            ListNode newEnd = present;
            ListNode next = present.next;
            for (int i =0; i<k;i++){
              present.next = prev;
                 prev = present;
                 present = next ;
                if (next!=null){
                 next = next.next;
                }
            }
            if (last!=null){
               last.next =prev;
            }else{
                head = prev;
            }
            newEnd.next = present;
           if (present==null){
            break ;
           }
           prev = newEnd;
            }
           return head ;
       }
    }