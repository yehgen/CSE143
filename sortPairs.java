// Write a method sortPairs that could be added to the LinkedIntList class. The method compares each pair of consecutive elements in the list (the pair at indexes 0 and 1, and then the pair at indexes 2 and 3, and then the pair at indexes 4 and 5, etc.), and swaps the order of the two nodes if necessary so that the smaller data value of the two comes first. If the list is of odd size, the last element is left unmodified.

// Suppose a LinkedIntList variable named list stores the following values. Notice that for some pairs, the first element in the pair is larger than the second in the pair.

// index   0   1   2   3   4   5  6  7    8    9  10  11  12
//       [20, 10, 15, 11, 32, 28, 5, 7, 314, 100, 17, 29, 44]
// The call of list.sortPairs(); would change the list to store the elements in the following order. Notice that whenever there is a pair where the larger value came first (such as 15 and 11 at indexes 2 and 3), they have swapped places so that the smaller of the two now comes first.

//       [10, 20, 11, 15, 28, 32, 5, 7, 100, 314, 17, 29, 44]
// If the list is empty or contains only a single element, it is unchanged by a call to your method.

// You should obey the following restrictions in your solution:

// The method should run in no worse than O(N) time, where N is the length of the list. (You should solve the problem by making a single pass over the list.)
// Do not call any methods of the linked list class to solve this problem. (Note that the list does not have a size field, and that you are not supposed to call its size method.)
// Do not use auxiliary data structures such as an array, ArrayList, Queue, String, etc.
// Do not modify the data field of any nodes; you must solve the problem by changing the links between nodes.
// You may not create new ListNode objects. You may create as many ListNode variables as you like.
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

public void sortPairs() {
  front = sortPairs(front);
}

private ListNode sortPairs(ListNode current) {
  if (current != null && current.next != null) {
    if (current.data > current.next.data) {
      ListNode second = current.next;
      current.next = current.next.next;
      second.next = current;
      current = second;
    }
    current.next.next = sortPairs(current.next.next);
  }
  return current;
}