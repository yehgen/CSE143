// Write a method countInAreaCode that accepts two parameters, a Map from names (strings) to phone numbers (strings) and an area code (as a string), and returns how many unique phone numbers in the map use that area code. For example, if a map m contains these pairs:

// {Marty=206-685-2181, Rick=520-621-6126, Beekto=206-685-2181, 
// Jenny=253-867-5309, Stuart=206-685-9138, DirecTV=800-494-4388,
// Bob=206-685-9138, Benson=206-616-1246, Hottline=900-674-2767}
// The call of countInAreaCode(m, "206") should return 3, because there are 3 unique phone numbers that use the 206 area code: Marty/Beekto's number of "206-685-2181", Stuart/Bob's number of "206-685-9138", and Benson's number of "206-616-1246".

// You may assume that the map passed is not null, that no key or value in it is null, that every phone number value string in the map will begin with a 3-digit numeric area code, and that the area code string passed will be a non-null numeric string exactly 3 characters in length. If the map is empty or contains no phone numbers with the given area code, your method should return 0.

// You may create one collection of your choice as auxiliary storage to solve this problem. You can have as many simple variables as you like. For full credit your code must run in less than O(n2) time where n is the number of pairs in the map.

public static int countInAreaCode(Map<String, String> numbers, String areaCode) {
  Set<String> uniqueNumbers = new HashSet<String>();
  for (String name : numbers.keySet()) {
    String phoneNumber = numbers.get(name);
    if (phoneNumber.startsWith(areaCode)) {
      uniqueNumbers.add(phoneNumber);
    }
  }
  return uniqueNumbers.size();
}