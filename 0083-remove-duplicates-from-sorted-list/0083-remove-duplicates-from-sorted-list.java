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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode th = head;
        while(th!=null && th.next!=null){
            if(th.val==th.next.val){
                th.next=th.next.next;
            }
            else{
                th=th.next;
            }
        }
        return head;
    }
}