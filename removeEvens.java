// Write a method removeEvens that could be added to the LinkedIntList class from lecture and section. The method removes all elements from the list that store even numbers (numbers divisible by 2, such as 14, -6, 48, 0, 22, etc). Your method should also add a value to the end of the linked list that stores a count of how many elements were removed. (This might be an even number; that's okay.) Suppose a LinkedIntList variable named list stores the following values:

// [4, 2, 1, 10, 15, 8, 7, 4, 20, 36, -3, 40, 5]
// The call of list.removeEvens(); would change the list to store the following elements:

// [1, 15, 7, -3, 5, 8]
// Note that the 8 on the end of the list signifies that the call removed 8 elements. If the list is empty or does not contain any even elements, it is unchanged except that a new node will be added to the end containing the value 0 (because no nodes were removed).

// [50, 60, 70]
// You should obey the following restrictions in your solution:

// The method should run in no worse than O(N) time, where N is the length of the list. (You can make up to 2 passes over the list, but you may not make N passes over the entire list.)
// Do not call any methods of the linked list class to solve this problem. (Note that the list does not have a size field, and that you are not supposed to call its size method.)
// Do not use auxiliary data structures such as an array, ArrayList, Queue, String, etc.
// Do not modify the data field of any nodes; you must solve the problem by changing the links between nodes.
// You may not create new ListNode objects, except for the single new node that you are to add to the end of the list. You may create as many ListNode variables as you like.
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

public void removeEvens() {
  front = removeEvens(front, 0);
}

private ListNode removeEvens(ListNode current, int removed) {
  if (current == null) {
    current = new ListNode(removed);
  } else if (current.data % 2 == 0) {
    current = removeEvens(current.next, removed + 1);
  } else { 
    current.next = removeEvens(current.next, removed);
  }
  return current;
}