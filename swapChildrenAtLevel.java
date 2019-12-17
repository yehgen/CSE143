// Write a method swapChildrenAtLevel to be added to the IntTree class. Your method should accept an integer n as a parameter and swap the left and right children of all nodes at level n. In other words, after your method is run, any node at level n + 1 that used to be its parent's left child should now be its parent's right child and vice versa. For this problem, the overall root of a tree is defined to be at level 1, its children are at level 2, etc.

// The table below shows the result of calling this method on an IntTree variable named tree.


// IntTree tree = new IntTree();
// ...
// tree.swapChildrenAtLevel(2);
// Level	Before Call	After Call

// 1




// 2




// 3




// 4
//                   +----+
//                   | 42 |
//                   +----+
//                /          \
//             /                \
//        +----+                +----+
//        | 19 |                | 65 |
//        +----+                +----+
//       /      \              /
//      /        \            /
//  +----+     +----+      +----+
//  | 54 |     | 32 |      | 23 |
//  +----+     +----+      +----+
//              /
//             /
//          +----+
//          | 12 |
//          +----+
//                     +----+
//                     | 42 |
//                     +----+
//                  /          \
//               /                \
//          +----+                +----+
//          | 19 |                | 65 |
//          +----+                +----+
//         /      \                     \     
//        /        \                     \    
//    +----+     +----+                +----+
//    | 32 |     | 54 |                | 23 |
//    +----+     +----+                +----+
//     /
//    /
// +----+
// | 12 |
// +----+
// If n is 0 or less than 0, your method should throw an IllegalArgumentException. If the tree is empty or does not have any nodes at the given level or deeper, it should not be affected by a call to your method.

// For efficiency, your method should not traverse any parts of the tree that it does not need to traverse. Specifically, you should not access any nodes lower than level n + 1, because there is nothing there that would be changed.

// You may define private helper methods to solve this problem, but otherwise you may not call any other methods of the tree class nor create any data structures. Do not construct any new node objects or change the data of any nodes. Your solution must be recursive.

// Assume that you are adding this method to the IntTree class as defined below:

// public class IntTree {
//     private IntTreeNode overallRoot;
//     ...
// }

public void swapChildrenAtLevel(int n) {
  if (n <= 0) {
    throw new IllegalArgumentException();
  }
  swapChildrenAtLevel(n, overallRoot);
}

private void swapChildrenAtLevel(int n, IntTreeNode root) {
  if (root != null) {
    if (n == 1) {
      IntTreeNode temp = root.left;
      root.left = root.right;
      root.right = temp;
    } else if (n > 0) {
      swapChildrenAtLevel(n - 1, root.left);
      swapChildrenAtLevel(n - 1, root.right);
    }
  }
}