// Write a method removeAll that could be added to the LinkedIntList class from lecture and section. The method should efficiently remove from a sorted list of integers all values appearing in a second sorted list of integers. For example suppose LinkedIntList variables list1 and list2 refer to the following lists:

// list1: [1, 3, 5, 7]
// list2: [1, 2, 3, 4, 5]
// If the call list1.removeAll(list2); is made, the lists should store the following values after the call:

// list1: [7]
// list2: [1, 2, 3, 4, 5]
// Notice that all of the values from list1 that appear in list2 have been removed and list2 is unchanged. If the call instead had been list2.removeAll(list1);, the lists would have these values afterwards:

// list1: [1, 3, 5, 7]
// list2: [2, 4]
// Both lists are guaranteed to be in sorted (non-decreasing) order, although there might be duplicates in either list. Because the lists are sorted you can solve this problem very efficiently with a single pass through the data. Your solution is required to run in O(M + N) time where M and N are the lengths of the two lists.

// Assume that we are adding this method to the LinkedIntList class as seen in lecture and as shown below. You may not call any other methods of the class to solve this problem, you may not construct any new nodes, and you may not use any auxiliary data structures to solve this problem (such as an array, ArrayList, Queue, String, etc.). You also may not change any data fields of the nodes. You must solve this problem by rearranging the links of the lists.

// public class LinkedIntList {
//     private ListNode front;
//     ...
// }

// public class ListNode {
//     public int data;
//     public ListNode next;
//     ...
// }

public void removeAll(LinkedIntList other) {
  front = removeAllHelper(ListNode front1, ListNode front2) {
    if (front1 == null || front2 == null ) {
      return front1;
    } else if (front1.data < front2.data ) {
      front1.next = removeAllHelper(front1.next, front2);
    } else if (front1.data == front2.data) {
      front1 = removeAllHelper(front1.next, front2);
    } else { // front1.data > front2.data 
      front1 = removeAllHelper(front1, front2.next);
    }
    return front1;
  }
}