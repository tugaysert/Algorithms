package LeetCode.LinkedList;

public class MergeTwoSortedList {


    public static void main(String[] args) {

        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(2);
        ListNode listNode4 = new ListNode(1);


        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;


        ListNode listNodeTwo = new ListNode(1);
        ListNode listNode2Two = new ListNode(2);
        ListNode listNode3Two = new ListNode(2);
        ListNode listNode4Two = new ListNode(1);


        listNodeTwo.next = listNode2Two;
        listNode2Two.next = listNode3Two;
        listNode3Two.next = listNode4Two;


        System.out.println(mergeTwoSortedList(listNode, listNodeTwo));

    }

    public static ListNode mergeTwoSortedList(ListNode list1, ListNode list2) {

        ListNode head = new ListNode();
        ListNode temp = head;

        while (list2 !=null && list1 !=null) {

            if (list1.val > list2.val) {
                temp.next = list2;
                list2 = list2.next;
            } else {
                temp.next = list1;
                list1 = list1.next;
            }
            temp = temp.next;

        }
        if (list2 != null) {
            temp.next = list2;
        } else {
            temp.next = list1;
        }

        return head.next;
    }


}
