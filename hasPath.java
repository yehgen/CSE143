// Write a method hasPath that could be added to the IntTree class from lecture and section. The method accepts start and end integers as parameters and returns true if a path can be found in the tree from start down to end. In other words, both start and end must be found in the tree, and end must be in one of start's subtrees; otherwise the method returns false. The result is trivially true if start and end are the same; in such a case, you are simply checking whether a node exists in the tree with that value.

// For example, suppose a variable of type IntTree called tree stores the following elements:

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
// The table below shows what the state of the tree would be if various calls were made:

// Call	                Result	Reason
// tree.hasPath(67, 99)	true	  path exists 67 -> 52 -> 99
// tree.hasPath(80, 45)	true	  path exists 80 -> 21 -> 45
// tree.hasPath(67, 67)	true	  node exists with data of 67
// tree.hasPath(16, 16)	true	  node exists with data of 16
// tree.hasPath(52, 99)	true	  path exists 52 -> 99
// tree.hasPath(99, 67)	false	  nodes do exist, but in wrong order
// tree.hasPath(80, 99)	false	  nodes do exist, but there is no path from 80 to 99
// tree.hasPath(67, 100)	false	  end of 100 doesn't exist in the tree
// tree.hasPath(-1, 45)	false	  start of -1 doesn't exist in the tree
// tree.hasPath(42, 64)	false	  start/end of -1 and 45 both don't exist in the tree
// An empty tree does not contain any paths, so if the tree is empty, your method should return false. You should not assume that your tree is a binary search tree (BST); its elements could be stored in any order.

// You may define private helper methods to solve this problem, but otherwise you may not call any other methods of the class nor create any data structures (arrays, lists, etc.). You should not modify the tree in any way in your code.

// Assume that you are adding this method to the IntTree class as defined below:

// public class IntTree {
//     private IntTreeNode overallRoot;
//     ...
// }

public boolean hasPath(int start, int end) {
  return hasPath(overallRoot, start, end);
}

private boolean hasPath(IntTreeNode node, int start, int end) {
  if (node == null) {
    return false;
  } else {
    if (node.data == start) {
      start = end;
    }
    return (node.data == start && node.data == end) ||
            hasPath(node.left, start, end) ||
            hasPath(node.right, start, end);
  }
}