import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        
        for (int a=i; j > a; a++){
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb = sb.reverse();
            String s = sb.toString();
            int n = Integer.parseInt(s);
            if(Math.abs((a-n)%k) == 0)
            {
                count++;
            }
        }
        
        System.out.println(count);
    }
}
