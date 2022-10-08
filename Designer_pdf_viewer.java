import java.io.*;
import java.util.*;
public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[26];
    for (int i = 0; i < 26; ++i) {
      arr[i] = sc.nextInt();
    }
    String str = sc.next();
    int max = 0;
    for (char letter : str.toCharArray()) {
      if(arr[letter - 'a'] > max)
      { 
          max = arr[letter - 'a'];
      }
    }
    System.out.println(max*str.length());
  }
}
