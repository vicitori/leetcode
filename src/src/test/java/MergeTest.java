import org.junit.jupiter.api.Test;
import solutions.SolutionMerge;
import solutions.SolutionMerge.*;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeTest {
    public static ListNode makeList(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        ListNode head = new ListNode(arr[0]);
        ListNode tail = head;
        for (int i = 1; i < arr.length; i++) {
            tail.next = new ListNode(arr[i]);
            tail = tail.next;
        }
        return head;
    }

    public static ArrayList<Integer> extractArr(ListNode list) {
        ArrayList<Integer> arr = new ArrayList<>();
        while (list != null) {
            arr.add(list.val);
            list = list.next;
        }
        return arr;
    }

    public static ArrayList<Integer> makeArrList(int[] arr) {
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int num : arr) {
            arrList.add(num);
        }
        return arrList;
    }

    int[] case1ARR = new int[] {1, 2, 3, 4, 5};
    ArrayList<Integer> case1ArrL = makeArrList(case1ARR);
    ListNode case1L = makeList(case1ARR);

    int[] case2ARR = new int[] {1, 2, 3, 4, 5};
    ArrayList<Integer> case2ArrL = makeArrList(case2ARR);
    ListNode case2L = makeList(case2ARR);

    @Test
    public void mergeTest1() {
        ArrayList<Integer> expectedArrL = makeArrList(new int[] {1, 1, 2, 2, 3, 3, 4, 4, 5, 5});
        assertEquals(expectedArrL, extractArr(SolutionMerge.mergeTwoLists(case1L, case2L)));
    }

    @Test
    public void mergeTest2() {
        ListNode list1 = makeList(new int[] {1,2,4});
        ListNode list2 = makeList(new int[] {1,3,4});
        ArrayList<Integer> expected = makeArrList(new int[] {1,1,2,3,4,4});

        assertEquals(expected, extractArr(SolutionMerge.mergeTwoLists(list1, list2)));
    }

    @Test
    public void mergeTest3() {
        ListNode list1 = makeList(new int[] {});
        ListNode list2 = makeList(new int[] {});
        ArrayList<Integer> expected = makeArrList(new int[] {});

        assertEquals(expected, extractArr(SolutionMerge.mergeTwoLists(list1, list2)));
    }
    @Test
    public void mergeTest4() {
        ListNode list1 = makeList(new int[] {});
        ListNode list2 = makeList(new int[] {0});
        ArrayList<Integer> expected = makeArrList(new int[] {0});

        assertEquals(expected, extractArr(SolutionMerge.mergeTwoLists(list1, list2)));
    }

    @Test
    public void mergeTest5() {
        ListNode list1 = makeList(new int[] {3, 3, 4, 5, 10});
        ListNode list2 = makeList(new int[] {0, 100});
        ArrayList<Integer> expected = makeArrList(new int[] {0, 3, 3, 4, 5, 10, 100});

        assertEquals(expected, extractArr(SolutionMerge.mergeTwoLists(list1, list2)));
    }
}
