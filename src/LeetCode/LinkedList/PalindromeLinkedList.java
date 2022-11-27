package LeetCode.LinkedList;

public class PalindromeLinkedList {


    public static void main(String[] args) {

        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(2);
        ListNode listNode4 = new ListNode(1);


        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;


        System.out.println(isPalindrome(listNode));
    }

    public static boolean isPalindrome(ListNode head) {

        ListNode slow = head, fast = head;


        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow = reverse(slow);
        return compareNode(slow, head);

    }

    public static ListNode reverse(ListNode head) {

        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;

    }

    public static boolean compareNode(ListNode a, ListNode b) {

        while (a != null && b != null) {

            if (a.val != b.val) {
                return false;
            }
            a = a.next;
            b = b.next;
        }
        return true;
    }
}
