// Write a method trimEnds that could be added to the LinkedIntList class. The method accepts an integer parameter k and removes k elements from the front of the list and k elements from the back of the list. Suppose a LinkedIntList variable list stores the following values:

// [10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110]
// The call list.trimEnds(3); would change the list to store the following elements:

// [40, 50, 60, 70, 80]
// If we followed this by a second call of list.trimEnds(1);, the list would store the following elements:

// [50, 60, 70]
// If the list is not large enough to remove k elements from each side, throw an IllegalArgumentException. If the list contains exactly 2k elements, it should become empty as a result of the call. If k is 0 or negative, the list should remain unchanged.

// For full credit, obey the following restrictions in your solution:

// The method should run in no worse than O(N) time, where N is the length of the list. (You can make more than one pass over the list, but you may not make N passes over the entire list.)
// Do not call any methods of the linked list class to solve this problem. (Note that the list does not have a size field, and that you are not supposed to call its size method.)
// Do not use auxiliary data structures such as an array, ArrayList, Queue, String, etc.
// Do not modify the data field of any nodes; you must solve the problem by changing the links between nodes.
// You may not create new ListNode objects, though you may create as many ListNode variables as you like.
// Assume that we are adding this method to the LinkedIntList class as shown below:

// public class LinkedIntList {
//     private ListNode front;
//     ...
// }

// public class ListNode {
//     public int data;
//     public ListNode next;
//     ...
// }

public void trimEnds(int k) {
  int size = 0;
  ListNode current = front;
  while (current != null) {
    current = current.next;
    size++;
  }
  if (size < 2 * k) {
    throw new IllegalArgumentException();
  } else if (size == 2 * k) {
    front = null;
  } else if (k > 0) {
    int count = 0;
    while (count < k) {
      front = front.next;
      count++;
    }
    current = front;
    while (count < size - k - 1) {
      current = current.next;
      count++;
    }
    current.next = null;
  }
}