package solutions;

public class SolutionMerge {
    public static class ListNode {
        public int val;
        public ListNode next;

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
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // mockery using functional style
//        return switch (list1 == null ? 0 : list2 == null ? 1 : 2 ) {
//            case 0 -> list2;
//            case 1 -> list1;
//            default -> {
//                if (list1.val < list2.val) {
//                    list1.next = mergeTwoLists(list1.next, list2);
//                    yield list1;
//                } else {
//                    list2.next = mergeTwoLists(list1, list2.next);
//                    yield list2;
//                }
//            }
//        };

        // norm iterative implementation
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = new ListNode(list1.val);
                tail = tail.next;
                list1 = list1.next;
            } else {
                tail.next = new ListNode(list2.val);
                tail = tail.next;
                list2 = list2.next;
            }
        }

        if (list1 == null) {
            tail.next = list2;
            return dummy.next;
        }
        tail.next = list1;
        return dummy.next;
    }
}
