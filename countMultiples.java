// Write a method countMultiples that could be added to the IntTree class from lecture and section. The method returns a count of the number of multiples of a particular value in the binary tree. Given a number n, a value m is considered a multiple of n if it can be expressed as (k * n) for some integer k. For example, suppose that an IntTree variable tree stores a reference to the following tree:

//                +---+
//                | 6 |
//            ___ +---+ ___
//          /               \
//      +---+               +---+
//      | 2 |               | 9 |
//      +---+               +---+
//     /     \                   \
// +---+     +---+               +---+
// | 5 |     | 3 |               | 4 |
// +---+     +---+               +---+
//          /     \             /     \
//      +---+     +---+     +---+     +---+
//      | 8 |     | 6 |     | 7 |     | 0 |
//      +---+     +---+     +---+     +---+
// The table below shows various calls and the values they should return:

// Call	                  Value Returned	Reason
// tree.countMultiples(2);	6	              six multiples of 2 : 6, 2, 8, 6, 4, 0
// tree.countMultiples(4);	3	              three multiples of 4 : 8, 4, 0
// tree.countMultiples(3);	5	              five multiples of 3 : 6, 3, 6, 9, 0
// tree.countMultiples(1);	10	            all ten values are multiples of 1
// Your method should throw an IllegalArgumentException if passed the value 0.

// You may define private helper methods to solve this problem, but otherwise you may not call any other methods of the class nor create any data structures such as arrays, lists, etc. Your method should not change the structure or contents of the tree.

// Assume that you are adding this method to the IntTree class as defined below:

// public class IntTree {
//     private IntTreeNode overallRoot;
//     ...
// }

public int countMultiples(int value) {
  if (value == 0) {
    throw new IllegalArgumentException();
  }
  return countMultiples(overallRoot, value);
}

private int countMultiples(IntTreeNode root, int value) {
  if (root == null) {
    return 0;
  } else {
    int sum = countMultiples(root.left, value) + countMultiples(root.right, value);
    if (root.data % value == 0) {
      return 1 + sum;
    } else {
       return sum;
    }
  }
}