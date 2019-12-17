// Write a method removeMatchingLeaves that could be added to the IntTree class from lecture and section. The method accepts a second IntTree as its parameter and removes any leaf nodes (nodes without children) that "match" with a corresponding node in the other tree. For this problem, two nodes "match" if they contain the same data value and are located in exactly the same place in the tree relative to the trees' overall roots. For a node to be removed by your method, it must be a leaf in your tree; but it need not be a leaf in the other tree passed as a parameter. If the second tree doesn't contain a node at that corresponding location or the value there is different, it does not match.

// For example, suppose two variables of type IntTree named tree1 and tree2 store the following elements:

// tree1	tree2
//                   +----+
//                   |  3 |
//                   +----+
//                /          \
//             /                \
//        +----+                +----+
//        |  4 |                |  7 |
//        +----+                +----+
//       /      \              /      \
//      /        \            /        \
//  +----+     +----+      +----+    +----+
//  |  0 |     |  9 |      |  2 |    |  5 |
//  +----+     +----+      +----+    +----+
//              /  \
//             /    \
//         +----+  +----+
//         |  8 |  |  6 |
//         +----+  +----+
//                   +----+
//                   |  3 |
//                   +----+
//                /          \
//             /                \
//        +----+                +----+
//        | 28 |                |  7 |
//        +----+                +----+
//       /      \              /
//      /        \            /
//  +----+     +----+      +----+
//  |  0 |     |  9 |      |  2 |
//  +----+     +----+      +----+
//      \          \           \
//       \          \           \
//      +----+    +----+      +----+
//      |  8 |    |  6 |      | 31 |
//      +----+    +----+      +----+
// The call of tree1.removeMatchingLeaves(tree2); would modify tree1 to store the elements below. The leaf nodes containing 0, 2, and 6 have been removed because they match the corresponding nodes in tree2. The other leaves from tree1, which contain the values 8 and 5, are not removed because they aren't matched in tree2.

// tree1
//                   +----+
//                   |  3 |
//                   +----+
//                /          \
//             /                \
//        +----+                +----+
//        |  4 |                |  7 |
//        +----+                +----+
//              \                     \
//               \                     \
//             +----+                +----+
//             |  9 |                |  5 |
//             +----+                +----+
//              /
//             /
//         +----+
//         |  8 |
//         +----+
// You may define private helper methods, but otherwise you may not call any other methods of the class nor create any data structures. You should not construct any new node objects or modify the tree passed in as the parameter. It may be helpful for you to note that your method can directly access the other tree's overallRoot field with an expression such as tree2.overallRoot (this is allowed in Java because they are objects of the same class).

// Your solution must be recursive and utilize the x = change(x) pattern discussed in the Building Java Programs textbook.

// Assume that you are adding this method to the IntTree class as defined below:

// public class IntTree {
//     private IntTreeNode overallRoot;
//     ...
// }

public void removeMatchingLeaves(IntTree other) {
  overallRoot = removeMatchingLeaves(overallRoot, other.overallRoot);
}

private IntTreeNode removeMatchingLeaves(IntTreeNode node, IntTreeNode otherNode) {
  if (node != null && otherNode != null) {
    if (node.left == null && node.right == null && node.data == otherNode.data) {
      node = null;
    } else {
      node.left = removeMatchingLeaves(node.left, otherNode.left);
      node.right = removeMatchingLeaves(node.right, otherNode.right);
    }
  }
  return node;
}