import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[101];
        int n = sc.nextInt();
        int max = 0;
         for (int i = 0; i < n; i++)
        {
            int ai = sc.nextInt();
        
            arr[ai]++;
            if (arr[ai] > max)
            {
                max = arr[ai];
            }
        }
        System.out.println(n - max);
    }
}
