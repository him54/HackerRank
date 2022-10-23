import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) 
        {
            for (int j = i+1; j < n; j++) {
                if (arr[i] == arr[j])
                {
                    int val = j - i;
                    if (val < min) 
                    {
                       min = val;
                    }
                }
            }
        }
        if (min == Integer.MAX_VALUE)
        {
            min = -1;
        }
        System.out.println(min);
    }
}
