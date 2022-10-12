import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<n; i++)
        {
            arr[i] = sc.nextInt(); 
        }
        for(int i = 0 ; i<n; i++)
            {
            int pos = 0;
            for(int j = 0 ; j<n;j++)
                {
                if(arr[j]==i+1)
                {
                pos = j+1 ;
                    break;
                }
              }
            int pos1 = 0;
            for(int j = 0 ; j<n;j++)
                {
                if(arr[j]==pos)
                {
                pos1 = j ;break;
            }
            }
            System.out.println(pos1+1);
        }
    }
}
