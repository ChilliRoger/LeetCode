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
    public ListNode middleNode(ListNode head) {
        ListNode th = head;
        int count = 0;

        while(th!=null){
            th=th.next;
            count++;
        }
        for (int i=0;i<count/2;i++){
            head=head.next;
        }
        return head;
    }
}