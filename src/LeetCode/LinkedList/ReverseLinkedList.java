package LeetCode.LinkedList;

public class ReverseLinkedList {


    public static void main(String[] args) {

        ListNode listNode = new ListNode(3);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(0);
        ListNode listNode4 = new ListNode(-4);


        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;


        System.out.println(reverseNode(listNode));
    }

    public static ListNode reverseNode(ListNode head) {

        // 1 2 3 4 5


        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;

        }
        return head;


    }
}