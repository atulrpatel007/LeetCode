/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        insertNode(head);
        randomNode(head);

        return nextRandom(head);
    }

    static void insertNode(Node head) {
        Node curr = head;

        while (curr != null) {
            Node newNode = new Node(curr.val);

            newNode.next = curr.next;
            curr.next = newNode;

            curr = newNode.next;
        }
    }

    static void randomNode(Node head) {
        Node curr = head;

        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }

            curr = curr.next.next;
        }
    }

    static Node nextRandom(Node head) {
        Node curr = head;

        Node dummy = new Node(0);
        Node copyCurr = dummy;

        while (curr != null) {
            Node copy = curr.next;

            curr.next = copy.next;

            copyCurr.next = copy;
            copyCurr = copy;

            curr = curr.next;
        }

        return dummy.next;
    }
}