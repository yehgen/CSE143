// Write a method removeDuplicates that could be added to the LinkedIntList class from lecture and section. The method should remove any duplicates from the linked list of integers. The resulting list should have the values in the same relative order as their first occurrence in the original list. In other words, a value i should appear before a value j in the final list if and only if the first occurence of i appeared before the first occurrence of j in the original list. For example, if a variable called list stores the following list:

// [14, 8, 14, 12, 1, 14, 11, 8, 8, 10, 4, 9, 1, 2, 5, 2, 4, 12, 12]
// After the call of list.removeDuplicates();, the list should store these values:

// [14, 8, 12, 1, 11, 10, 4, 9, 2, 5]
// Assume that we are adding this method to the LinkedIntList class as seen in lecture and as shown below. You may not call any other methods of the class to solve this problem, you may not construct any new nodes, and you may not use any auxiliary data structures to solve this problem (such as an array, ArrayList, Queue, String, etc.). You also may not change any data fields of the nodes. You must solve this problem by rearranging the links of the list.

//     public class LinkedIntList {
//         private ListNode front;
//         ...
//     }
    
//     public class ListNode {
//         public int data;
//         public ListNode next;
//         ...
//     }

public void removeDuplicates() {
  ListNode current = front;
  while (current != null && current.next != null) {
    ListNode current2 = current;
    while (current2.next != null) {
      if (current2.next.data == current.data) {
        current2.next = current2.next.next;
      } else {
        current2 = current2.next;
      }
    }
    current = current.next;
  }
}