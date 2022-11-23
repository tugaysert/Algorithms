package LeetCode;

public class MiddleoftheLinkedList {


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

    }


    public static void main(String[] args) {

        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);


        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;


        int b = middleNode(listNode).val;

        System.out.println(b);
        ;
    }


    public static ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (true) {

            if (fast == null || fast.next == null) {
                return slow;
            }

            slow = slow.next;
            fast = fast.next.next;

        }

    }


}
