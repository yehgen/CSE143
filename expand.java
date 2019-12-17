// Write a method expand that could be added to the LinkedIntList class from lecture and section. The method accepts an integer f as a parameter and replaces every element value i with f copies of the value (i/f). Suppose a LinkedIntList variable list stores the following values:

// [21, 8, 15, 0, 32]
// The call list.expand(3); should change the list to store the following values:

// [7, 7, 7, 2, 2, 2, 5, 5, 5, 0, 0, 0, 10, 10, 10]
// For full credit, your solution must run in O(N) time where N is the length of the list.

// Assume that we are adding this method to the LinkedIntList class as seen in lecture and as shown below. You may not call any other methods of the class to solve this problem, and you may not use any auxiliary data structures to solve this problem (such as an array, ArrayList, Queue, String, etc.).

// public class LinkedIntList {
//     private ListNode front;
//     ...
// }

// public class ListNode {
//     public int data;
//     public ListNode next;
//     ...
// }

public void expand(int f) {
  if (f <= 0) {
    front = null;
  } else {
    ListNode current = front;
    while (current != null) {
      current.data = current.data / f;
      for (int i = 1; i < f; i++) {
        current.next = new ListNode(current.data, current.next);
        current = current.next
      }
      current = current.next;
    }
  }
}