// Write a method called mirror that takes a stack of integers as a parameter and that doubles the size of the stack by appending the mirror image of the original sequence at the top of the stack. The mirror image is the same sequence of values in reverse order. For example, suppose that a variable called s stores the following values:

//         bottom [1, 3, 2, 7] top
// and we make the following call:

//         mirror(s);
// then it should store the following values after the call:

//         bottom [1, 3, 2, 7, 7, 2, 3, 1] top
// Notice that it has been doubled in size by having the original sequence appearing in reverse order at the top of the stack. If the original stack is empty, your method should not change it.

// You are to use one queue as auxiliary storage to solve this problem. You may not use any other auxiliary data structures to solve this problem, although you can have as many simple variables as you like. You may not use recursion to solve this problem and your solution must run in O(n) time where n is the size of the stack. Use the Stack and Queue interfaces and the ArrayStack and LinkedQueue implementations discussed in lecture.

public void mirror(Stack<Integer> s) {
  Queue<Integer< q = new LinkedList<>();
  int size = s.size();

  while (!s.isEmpty()) {
    int n = s.pop();
    q.add(n);
  }

  for (int i = 0; i < size; i++) {
    int m = q.remove();
    s.push(m);
    q.add(m);
  }

  while (!s.isEmpty()) {
    q.add(s.pop());
  }

  for (int i = 0; i < size; i++) {
    q.add(q.remove());
  }

  while (!q.isEmpty()) {
    s.push(q.remove());
  }
}