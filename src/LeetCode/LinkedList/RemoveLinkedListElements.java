package LeetCode.LinkedList;

public class RemoveLinkedListElements {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(7);
        ListNode listNode2 = new ListNode(7);
        ListNode listNode3 = new ListNode(7);
        ListNode listNode4 = new ListNode(1);


        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode2;


        System.out.println(removeLinkedList(listNode, 7));
    }

    public static ListNode removeLinkedList(ListNode head, int val) {

        ListNode temp = head, prev = null, next = head;

        while (next != null) {

            next = temp.next;

            if (head.val == val) {
                head = head.next;
                temp = head;
                continue;
            }

            if (temp.val == val) {
                prev.next = next;
            } else prev = temp;
            temp = next;

        }
        return head;
    }

}
