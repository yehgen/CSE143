// Write a method sumLeaves to be added to the IntTree class shown below. Your method should return the sum of the data stored in all of the leaf nodes. Your method should not alter the tree. For example, the following tree has four leaves (nodes 1, 4, 8, and 9):

//                +---+
//                | 5 |
//                +---+
//               /     \
//           +---+     +---+
//           | 3 |     | 6 |
//           +---+     +---+
//          /     \         \
//      +---+     +---+     +---+
//      | 2 |     | 4 |     | 7 |
//      +---+     +---+     +---+
//     /                   /     \
// +---+               +---+     +---+
// | 1 |               | 8 |     | 9 |
// +---+               +---+     +---+
// A call on sumLeaves would return 22. If the tree is empty a call to your method should return 0.

// You may define private helper methods to solve this problem, but otherwise you may not call any other methods of the tree class nor create any data structures such as arrays, lists, etc. You should not construct any new node objects or change the data of any nodes. For full credit, your solution must be recursive.

public int sumLeaves() {
  return sumLeaves(overallRoot);
}

private int sumLeaves(IntTreeNode root) {
  if (root != null) {
    if (root.left == null && root.right == null) {
      return root.data;
    } else {
      return sumLeaves(root.left) + sumLeaves(root.right);
    }
  }
  return 0; // if function gets here without returning
}