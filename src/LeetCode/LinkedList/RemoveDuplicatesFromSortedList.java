package LeetCode.LinkedList;

public class RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(7);
        ListNode listNode2 = new ListNode(7);
        ListNode listNode3 = new ListNode(7);
        ListNode listNode4 = new ListNode(1);


        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode2;


        System.out.println(deleteDuplicates(listNode));
    }

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode temp = head;


        while (temp !=null) {
            if (temp.next == null) {
                break;
            }

            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }
}
