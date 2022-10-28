import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        sc.nextLine();
        while (sc.hasNext()) {
            int m = sc.nextInt();
            int p = sc.nextInt();
            int b = sc.nextInt();
            
            int count = m / p;
            int wrap = count;
            
            while (wrap >= b) {
                int fb = wrap / b;
                count += fb;
                wrap = fb + wrap % b;
            }
            
            System.out.println(count);
        }
    }
}
