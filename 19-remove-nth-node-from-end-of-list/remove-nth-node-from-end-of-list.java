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
        ListNode count=head;
        int c=0;
    while (count!=null){
        count=count.next;
        c++;
    }
    if (c==n)return head.next;
    count=head;
    for (int i =0;i<c-n-1;i++){
        count= count.next;
    }
    count.next=count.next.next;
    return head ;
    }
}