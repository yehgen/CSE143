// Write a method removeRange that could be added to the LinkedIntList class from lecture and section. The method takes two integer parameters, min and max, and removes all elements from the list whose values are between min and max, inclusive. It should return the number of elements removed.

// Suppose a LinkedIntList variable named list stores the following values:

// [4, 2, 1, 10, 15, 8, 7, 4, 20, 36, -3, 40, 5]
// The call of list.removeRange(4, 20) would return 8 and change the list to store the following elements:

// [2, 1, 36, -3, 40]
// If the value of the max parameter is less than that of the min parameter you should throw an IllegalArgumentException. If the list is empty or does not contain any elements between or equal to min and max, it should return 0 and leave the list unchanged after a call to removeRange.

// Obey the following restrictions in your solution:

// The method should run in no worse than O(N) time, where N is the length of the list.
// For full credit, you should make only one pass over the list.
// Do not call any methods of the linked list class to solve this problem.
// Note that the list does not have a size field, and you are not supposed to call its size method.
// Do not use auxiliary data structures such as arrays, ArrayList, Queue, String, etc.
// Do not modify the data field of any nodes; you must solve the problem by changing the links between nodes.
// You may not create new ListNode objects. You may create as many ListNode variables as you like.

public int removeRange(int min, int max) {
  if (max < min) {
    throw new IllegalArgumentException();
  }

  ListNode current = front;
  int count = 0;
  while (front != null && front.data >= min && front.data <= max) {
    front = front.next;
    count++;
  }
  
  while (current != null && current.next != null) {
    if (current.next.data >= min && current.next.data <= max) {
      current.next = current.next.next;
      count++;
    } else {
      current = current.next;
    }
  }
  return count;
}