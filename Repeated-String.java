import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        long N = sc.nextLong();
        long num = N / str.length();
        long rem = N % str.length();
        long res = 0;
        for (int i = 0; i < str.length(); i++)
         {
            if (str.charAt(i)=='a') 
            {
                res += num;
                if (i < rem)
                {
                    res++;
                }
                   
            }
        }
        System.out.println(res);
    }
}
