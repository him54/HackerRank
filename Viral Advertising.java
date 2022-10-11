import java.io.*;
import java.util.*;
public class Solution {
    public static final int amount = 5;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int curr = amount;
        int total = 0;
        for (int i = 0; i < n; i++) {
            curr = curr/2;
            total+= curr;
            curr *= 3;
        }
        System.out.println(total);
        
    }
}
