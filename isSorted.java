// Write a method called isSorted that takes a stack of integers and returns true if the stack is sorted and false otherwise. A stack is considered sorted when its integers are in non-decreasing order (i.e. increasing order with duplicates allowed) when read from bottom to top.

// So, a sorted stack has its smallest integer on the bottom and its largest integer on the top. A stack that contains fewer than two integers is sorted by definition. For example, suppose that a variable called s stores the following sequence of values:

// bottom [-12, 0, 1, 8, 8, 8] top 
// then a call on isSorted(s) should return true. If s had instead contained the following values:

// bottom [-9, 10, 43, 24, 97] top 
// then a call on isSorted(s) should return false, because 24 is less than 43. You may use one Queue as auxiliary storage to solve this problem. You may not use any other auxiliary data structures to solve this problem, although you can have as many simple variables as you like. You may not use recursion to solve this problem. At the end of the call to your method, the stack's contents must be the same as they were before the method was called; do not destroy the stack.

public boolean isSorted(Stack<Integer> s) {
  Queue<Integer> q = new LinkedList<Integer>();
  boolean sort = true;

  if (s.size() < 2) {
    return true;
  }

  int n = s.pop();
  q.add(n);
  while (!s.isEmpty()) {
    int m = s.pop();
    if (n < m) {
      sort = false;
    }
    q.add(m);
    n = m;
  }

  while (!q.isEmpty()) {
    s.push(q.remove());
  }
  while (!s.isEmpty()) {
    q.add(s.pop());
  }
  while (!q.isEmpty()) {
    s.push(q.remove());
  }
  return sort;
}