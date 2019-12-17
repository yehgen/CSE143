// Write a static method named playlist that accepts as its parameter a Scanner for an input file representing a sequence of songs. Your method will reformat the song names and lengths found in the file to be more readable and output them to the console. Additionally, your method will return whether or not all the songs in the file would fit on a standard CD. A standard CD can hold up to, and including, 80 minutes of audio data.

// Each line of the playlist file consists of a song name consisting of one or more words, a semi-colon (i.e. ;), and the song's length as two integers, minutes and seconds. Your method should read each line and output the song information in a more readable format to the console. Separate each token of the song name with a single space, capitalize the first letter of each word, and lowercase the rest. If the total time needed to play all the songs is 80 minutes or less, return true. Otherwise, return false.

// The table below shows two example files. The first file has five songs, which fit on a CD because the total playtime is under 80 minutes. The second file has six songs, but all six songs cannot fit on a CD because it takes more than 80 minutes to play them. Regardless of the total playtime, the reformatted playlist is always printed to the console.

// Input File	                          Console Output	            Value Returned
// Alejandro ;      8 43                 Alejandro 8:43              true
//   hOme       ; 5 3                    Home 5:3
// WHEN yoU Love SomEBODY ;  2 5         When You Love Somebody 2:5
//    rudE to rile ; 3        30         Rude To Rile 3:30
// CALIFORNIa   gurls ; 3      56        California Gurls 3:56

// tubULaR    bElls ; 25 01              Tubular Bells 25:1          false
//    reVolution 9 ;   8 22              Revolution 9 8:22
// lasT   caLL ; 12 41                   Last Call 12:41
// ShARKS    and SAILORS ; 8 13          Sharks And Sailors 8:13
//  osAKA part    I    ; 38 58           Osaka Part I 38:58
// SHINE ON YOU    crazy diamond ; 26 01 Shine On You Crazy Diamond 26:1

// false
// Assume valid input. Assume the file contains data for at least one song, every line contains one song's data, and every song is in the format described above. Each song's minutes and seconds are in the range of 0 - 59.

public static boolean playlist(Scanner input) {
  int minute = 0;
  int second = 0;
  while (input.hasNextLine()) {
    String line = input.nextLine();
    Scanner lineScan = new Scanner(line);
    String song = "";
    String token = lineScan.next();
    while (!token.equals(";")) {
      song += token.substring(0,1).toUpperCase() + token.substring(1).toLowerCase() + " ";
      token = lineScan.next();
    }
    int minutes = lineScan.nextInt();
    int seconds = lineScan.nextInt();
    System.out.println(song + minutes + ":" + seconds);
    minute += minutes;
    second += seconds;
  }
  if (80 * 60 >= minute * 60 + second) {
    return true;
  }
  return false;
}