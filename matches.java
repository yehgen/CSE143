// Write a method matches that could be added to the IntTree class from lecture and section. The method returns a count of the number of nodes in one tree that match nodes in another tree. A match is defined as a pair of nodes that are in the same position in the two trees relative to their [overallRoot] and that store the same data.

// For example, suppose IntTree variables t1 and t2 refer to the following trees (matches underlined):

// t1	t2
//           +---+
//           | 3 |
//           +---+
//          /     \
//      +---+     +---+
//      | 4 |     | 7 |
//      +---+     +---+
//     /     \         \
// +---+     +---+     +---+
// | 0 |     | 9 |     | 2 |
// +---+     +---+     +---+
//                \
//                +---+
//                | 8 |
//                +---+
//           +---+
//           | 3 |
//           +---+
//          /     \
//      +---+     +---+
//      | 6 |     | 7 |
//      +---+     +---+
//     /         /     \
// +---+     +---+     +---+
// | 0 |     | 9 |     | 2 |
// +---+     +---+     +---+
//      \
//      +---+
//      | 8 |
//      +---+
// The calls of t1.matches(t2) and t2.matches(t1) would each return 4. The overallRoot of the two trees match (both are 3). The nodes at the top of the left subtrees of the overallRoot match (both are 7). The next level of the tree has two matches for the nodes storing 0 and 2 (there are two nodes that each store 9 at this level, but they are in different positions relative to the overallRoot of the tree). The nodes at the lowest level both store 8, but they aren't a match because they are in different positions.

// You may define private helper methods to solve this problem, but otherwise you may not call any other methods of the class nor create any data structures such as arrays, lists, etc. Your method should not change the structure or contents of either of the two trees being compared.

// Assume that you are adding this method to the IntTree class as defined below:

// public class IntTree {
//     private IntTreeNode overallRoot;
//     ...
// }

public int matches(IntTree other) {
  return matches(overallRoot, other.overallRoot);
}

private int matches(IntTreeNode root1, IntTreeNode root2) {
  if (root1 == null || root2 == null) {
    return 0;
  } else {
    int sum = matches(root1.left, root2.left) + matches(root1.right, root2.right);
    if (root1.data == root2.data) {
      return 1 + sum;
    } else {
      return sum;
    }
  }
}