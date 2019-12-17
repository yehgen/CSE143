// Write a method nodesAtLevels that could be added to the IntTree class from lecture and section. The method accepts minimum and maximum integers as parameters and returns a count of how many elements exist in the tree at those levels, inclusive. Recall that the root of a tree is at level 1, its children are at level 2, their children at level 3, and so on. The table below shows the results of several calls on an IntTree variable tree:

// levels	tree	call	value returned
//                          +----+
//                          | 20 |
//                    _____ +----+ _____
//                   /                  \
//               +----+                   +----+
//               | 76 |                   | 11 |
//         _____ +----+               ___ +----+
//        /           \              /
//     +----+         +----+   +----+
//     | 24 |         | 42 |   | 98 |
//     +----+         +----+   +----+
//    /      \                      \
// +----+   +----+                  +----+
// | -8 |   | 80 |                  | -2 |
// +----+   +----+                  +----+
//               \                  /    \
//             +----+           +----+  +----+
//             | 57 |           |  1 |  | 27 |
//             +----+           +----+  +----+
// tree.nodesAtLevels(2, 4)	8
// tree.nodesAtLevels(4, 5)	6
// tree.nodesAtLevels(1, 2)	3
// tree.nodesAtLevels(3, 3)	3
// tree.nodesAtLevels(7, 9)	0
// tree.nodesAtLevels(5, 9)	3
// tree.nodesAtLevels(1, 1)	1
// For example, tree.nodesAtLevels(4, 5) returns 6 because -8, 80, -2, 57, 1, and 27 are in that range of levels.

// Your method should throw an IllegalArgumentException if the minimum passed is less than 1 or greater than the maximum passed. It is legal for the minimum and/or maximum to be larger than the height of the tree; a tree has 0 nodes at any levels that exceed its height. An empty tree contains 0 nodes at any level.

// You may define private helper methods to solve this problem, but otherwise you may not call any other methods of the class nor create any data structures such as arrays, lists, etc. Your method should not change the structure or contents of the tree being examined.

// Assume that you are adding this method to the IntTree class as defined below:

// public class IntTree {
//     private IntTreeNode overallRoot;
//     ...
// }

public int nodesAtLevels(int min, int max) {
  if (min < 0 || min > max) {
    throw new IllegalArgumentException();
  }
  return nodesAtLevels(overallRoot, 1, min, max);
}

private int nodesAtLevels(IntTreeNode root, int level, int min, int max) {
  if (root == null || level > max) {
    return 0;
  } else if (level < min) {
    return nodesAtLevels(root.left, level + 1, min, max) + nodesAtLevels(root.right, level + 1, min, max);
  } else {
    return 1 + nodesAtLevels(root.left, level + 1, min, max)
           + nodesAtLevels(root.right, level + 1, min, max);
  }
}