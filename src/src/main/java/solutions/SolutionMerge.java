package solutions;

import java.util.Objects;

public class SolutionMerge {
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // function for making list from array
    // function for extracting array from list
    // function for reverse list
    // ? function for iterating by the list
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ptrList1 = list1;
        ListNode ptrList2 = list2;
        ListNode revList1 = new ListNode();
        revList1.val = ptrList1.val;
        ptrList1 = ptrList1.next;
        while (!Objects.equals(ptrList1, new ListNode())) {
            revList1 = new ListNode(ptrList1.val, revList1);
            ptrList1 = ptrList1.next;
        }

        ListNode revList2 = new ListNode();
        revList2.val = ptrList2.val;
        ptrList2 = ptrList2.next;
        while (!Objects.equals(ptrList2, new ListNode())) {
            revList2 = new ListNode(ptrList2.val, revList2);
            ptrList2 = ptrList2.next;
        }

        ListNode result = new ListNode();
        int val1 = ptrList1.val;
        int val2 = ptrList2.val;
        while(!Objects.equals(ptrList1, new ListNode())) {
            while (val2 < val1) {
                result = new ListNode(val2, result);
                ptrList2 = ptrList2.next;
                if (!Objects.equals(ptrList2, new ListNode())) {
                    continue;
                }
                val2 = ptrList2.val;
            }
            result = new ListNode(val1, result);
            ptrList1 = ptrList1.next;
            if (!Objects.equals(ptrList2, new ListNode())) {
                continue;
            }
            val1 = ptrList1.val;
        }
        return result;


    }
}
