// Write a method called mirror that doubles the size of a list of integers by appending the mirror image of the original sequence to the end of the list. The mirror image is the same sequence of values in reverse order. For example, if a variable called list stores this sequence of values:

//         [1, 3, 2, 7]
// and you make the following call:

//         list.mirror();
// then it should store the following values after the call:

//         [1, 3, 2, 7, 7, 2, 3, 1]
// Notice that it has been doubled in size by having the original sequence appearing in reverse order at the end of the list.

// You are writing a method for the ArrayIntList class discussed in lecture:

//         public class ArrayIntList {
//             private int[] elementData; // list of integers
//             private int size;          // current # of elements in the list

//             <methods>
//         }
// You are not to call any other ArrayIntList methods to solve this problem, you are not allowed to define any auxiliary data structures (no array, ArrayList, etc). You may assume that the array has sufficient capacity to store the new values.

public void mirror() {
  int x = size;
  for (int i = size - 1; i >= 0; i--) {
    elementData[x] = elementData[i];
    x++;
  }
  size = size * 2;
}