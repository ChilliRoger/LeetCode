
class Solution {

    static class NodeWrapper {
        ListNode node;
    }

    public int pairSum(ListNode head) {
        if (head.next.next == null) {
            return head.val + head.next.val;
        }

        int[] result = new int[1];
        NodeWrapper q = new NodeWrapper();
        traverse(head, head, result, q);
        return result[0];
    }

    private void traverse(ListNode head,ListNode p,int[] result,NodeWrapper q) {

        if (p != null) {
            q.node = head.next;
            traverse(head.next, p.next.next, result, q);

            result[0] = Math.max(result[0],head.val + q.node.val);
            q.node = q.node.next;
        }
    }
}