// Write a method flip that could be added to the IntTree class from lecture and section. The method reverses the tree about its left/right axis so that any node that used to be its parent's left child will become its parent's right child and vice versa. The table below shows the result of calling this method on an IntTree variable tree.


// IntTree tree = new IntTree();
// ...
// tree.flip();
// Before Call	After Call
//                   +----+
//                   | 67 |
//                   +----+
//                /          \
//             /                \
//        +----+                +----+
//        | 80 |                | 52 |
//        +----+                +----+
//       /      \              /
//      /        \            /
//  +----+     +----+      +----+
//  | 16 |     | 21 |      | 99 |
//  +----+     +----+      +----+
//              /
//             /
//          +----+
//          | 45 |
//          +----+
//            +----+
//            | 67 |
//            +----+
//         /          \
//      /                \
// +----+                +----+
// | 52 |                | 80 |
// +----+                +----+
//       \              /      \
//        \            /        \
//      +----+     +----+      +----+
//      | 99 |     | 21 |      | 16 |
//      +----+     +----+      +----+
//                      \
//                       \
//                     +----+
//                     | 45 |
//                     +----+
// If a tree has no nodes or is a leaf, it should not be affected by a call to your method.

// You may define private helper methods to solve this problem, but otherwise you may not call any other methods of the tree class nor create any data structures such as arrays, lists, etc. You should not change the data of any nodes.

// Assume that you are adding this method to the IntTree class as defined below:

// public class IntTree {
//     private IntTreeNode overallRoot;
//     ...
// }

public void flip() {
  overallRoot = flip(overallRoot);
}

private IntTreeNode flip(IntTreeNode node) {
  if (node != null) {
    IntTreeNode temp = flip(node.left);
    node.left = flip(node.right);
    node.right = temp;
  }
  return node;
}