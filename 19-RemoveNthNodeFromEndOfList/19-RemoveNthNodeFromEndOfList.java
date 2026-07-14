// Last updated: 7/14/2026, 2:19:33 PM
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
        ListNode temp =head;
        int c = 0;
        while(temp!=null){
            c++;
            temp = temp.next;
        }
        if(c==n) return head.next;
         temp = head;
        for(int i=0;i<c-n-1;i++){
            temp = temp.next;
        }
        if(temp.next!=null) temp.next = temp.next.next;
        return head;
    }
}