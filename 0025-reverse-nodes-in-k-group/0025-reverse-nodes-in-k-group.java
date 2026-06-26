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
       if (head == null || k <= 1) return head;

        ListNode temp = head;
        ListNode prevGroupTail = null;

        while (temp != null) {

            ListNode kNode = getKthNode(temp, k);

            // Not enough nodes left to reverse
            if (kNode == null) {
                if (prevGroupTail != null) {
                    prevGroupTail.next = temp;
                }
                break;
            }

            ListNode nextGroup = kNode.next;
            kNode.next = null;

            // Reverse current k-group
            ListNode newGroupHead = reverse(temp);

            if (temp == head) {
                head = newGroupHead;
            } else {
                prevGroupTail.next = newGroupHead;
            }

            // temp is now the tail of the reversed group
            prevGroupTail = temp;
            temp.next = nextGroup;

            temp = nextGroup;
        }

        return head;
    }

    static ListNode getKthNode(ListNode head, int k) {
        ListNode temp = head;

        while (temp != null && k > 1) {
            temp = temp.next;
            k--;
        }

        return temp;
    }

    static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}