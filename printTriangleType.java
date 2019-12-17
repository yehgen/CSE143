// Write a method called printTriangleType that accepts three integer arguments representing the lengths of the sides of a triangle and prints what type of triangle it is. The three types are equilateral, isosceles, and scalene. An equilateral triangle has all three sides the same length, an isosceles triangle has two sides the same length, and a scalene triangle has three sides of different lengths. Here are some example calls to printTriangleType:

// printTriangleType(5, 7, 7);
// printTriangleType(6, 6, 6);
// printTriangleType(5, 7, 8);
// printTriangleType(12, 18, 12);
// The output produced should be the following:

// isosceles
// equilateral
// scalene
// isosceles

public static void printTriangleType(int l1, int l2, int l3) {
  String type = "";
  if (l1 == l2 && l2 == l3) {
    type = "equilateral";
  } else if (l1 == l2 || l2 == l3 || l1 == l3) {
    type = "isosceles";
  } else { //  if (l1 != l2 && l2 != l3)
    type = "scalene";
  }
  System.out.println(type);
}