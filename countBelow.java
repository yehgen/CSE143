// Write a method countBelow that could be added to the IntTree class from lecture and section. The method accepts an integer parameter representing a given level of the tree and returns an integer representing the count of the number of nodes in exist in the tree at that level or deeper. For example, if 3 is passed, you should count the number of nodes at levels 3, 4, 5, 6, ... For this problem, the root of a tree is defined to be at level 1, its children are at level 2, etc. If the tree is empty or does not have any nodes at the given level or deeper, you should return 0. If a negative value or 0 is passed, your method should throw an IllegalArgumentException. The following diagram and table show the results of several calls of your method on a particular tree:


// IntTree tree = new IntTree();
// ...
//                                                        Level
//                   +----+
//                   | 67 |                                 1
//                   +----+
//                /          \
//             /                \
//        +----+                +----+
//        | 80 |                | 52 |                      2
//        +----+                +----+
//       /      \              /
//      /        \            /
//  +----+     +----+      +----+
//  | 16 |     | 21 |      | 99 |                           3
//  +----+     +----+      +----+
//              /  \            \
//             /    \            \
//         +----+  +----+       +----+
//         | 45 |  | 33 |       | 67 |                      4
//         +----+  +----+       +----+
// Call	Returns
// tree.countBelow(3)	6
// tree.countBelow(4)	3
// tree.countBelow(5)	0
// tree.countBelow(1)	9
// tree.countBelow(0)	IllegalArgumentException
// tree.countBelow(-2)	IllegalArgumentException
// You may define private helper methods to solve this problem, but otherwise you may not call any other methods of the tree class nor create any data structures. Do not construct any new node objects or change the data of any nodes.

// Assume that you are adding this method to the IntTree class as defined below:

// public class IntTree {
//     private IntTreeNode overallRoot;
//     ...
// }

public int countBelow(int min) {
  if (min <= 0) {
    throw new IllegalArgumentException();
  } else {
    return countBelow(overallRoot, min);
  }
}

private int countBelow(IntTreeNode node, int min) {
  int count = 0;
  if (node != null) {
    if (min <= 1) {
      count++;
    }
    count += countBelow(node.left, min - 1) + countBelow(node.right, min - 1);
  }
  return count;
}