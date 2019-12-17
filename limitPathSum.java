// Write a method limitPathSum that removes nodes from a binary tree of integers to guarantee that the sum of the values on any path from the root to a node does not exceed some maximum value. For example, suppose that a variable tree stores a reference to the following tree:

//                         +----+
//                         | 29 |
//                       _ +----+ _
//                   _ /            \ _
//                 /                    \
//             +----+                  +----+
//             | 17 |                  | 15 |
//             +----+                  +----+
//            /      \                /      \
//           /        \              /        \
//       +----+      +----+      +----+      +----+
//       | -7 |      | 37 |      |  4 |      | 14 |
//       +----+      +----+      +----+      +----+
//      /      \           \                /      \
//     /        \           \              /        \
// +----+      +----+      +----+      +----+      +----+
// | 11 |      | 12 |      | 16 |      | -9 |      | 19 |
// +----+      +----+      +----+      +----+      +----+
// Then the call of tree.limitPathSum(50); will remove nodes so as to guarantee that no path from the root to a node has a sum that is greater than 50. This will require removing the node with 12 because the sum of the values from the root to that node is greater than 50 (29 + 17 + -7 + 12 = 51). Similarly, we have to remove the node with 37 because its sum is too high (29 + 17 + 37 = 83). Whenever you remove a node, you remove anything under it as well, so removing 37 also removes 16. We also remove the node with 14 and everything under it because its sum is high enough (29 + 15 + 14 = 58). Thus we produce the following tree:

//                   +----+
//                   | 29 |
//                   +----+
//                  /      \
//                 /        \
//             +----+      +----+
//             | 17 |      | 15 |
//             +----+      +----+
//            /           /
//           /           /
//       +----+      +----+
//       | -7 |      |  4 |
//       +----+      +----+
//      /
//     /
// +----+
// | 11 |
// +----+
// The method would remove all nodes if the data stored at the overallRoot is greater than the given maximum.

// Assume that you are adding this method to the IntTree class as defined below:


// public class IntTree {
//     private IntTreeNode overallRoot;
//     ...
// }

public void limitPathSum(int max) {
  overallRoot = limitPathSum(overallRoot, max, 0);
}

private IntTreeNode limitPathSum(IntTreeNode root, int max, int current) {
  if (root != null) {
    current += root.data;
    if (current > max) {
      root = null;
    } else {
      root.left = limitPathSum(root.left, max, current);
      root.right = limitPathSum(root.right, max, current);
    }
  }
  return root;
}