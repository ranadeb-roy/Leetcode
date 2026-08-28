// 2. Add Two Numbers
// time - 1 ms
// space - 46.43 MB

class Solution {
    
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int extra = 0;
        int total = 0;
        ListNode l3 = new ListNode();
        ListNode ans = l3;
        while (l1 != null && l2 != null) {
            total = l1.val + l2.val + extra;
            l3.next = new ListNode(total % 10);
            extra = total / 10;
            l1 = l1.next;
            l2 = l2.next;
            l3 = l3.next;
        }
        while (l1 != null) {
            total = l1.val + extra;
            l3.next = new ListNode(total % 10);
            extra = total / 10;
            l1 = l1.next;
            l3 = l3.next;
        }
        while (l2 != null) {
            total = l2.val + extra;
            l3.next = new ListNode(total % 10);
            extra = total / 10;
            l2 = l2.next;
            l3 = l3.next;
        }
        if (extra > 0) {
            l3.next = new ListNode(extra);
        }
        return ans.next;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode l1 = solution.new ListNode(2,
                solution.new ListNode(4,
                        solution.new ListNode(3)));
        ListNode l2 = solution.new ListNode(5,
                solution.new ListNode(6,
                        solution.new ListNode(4)));

        ListNode result = solution.addTwoNumbers(l1, l2);
        while (result != null) {
            System.out.print(result.val);
            if (result.next != null) {
                System.out.print(" -> ");
            }
            result = result.next;
        }
    }
}