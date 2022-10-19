import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[K];
        for(int i=0; i < N; i++)
        {
            int num = sc.nextInt();
            arr[num % K]++;
        }
        int count = 0;
        for(int i = 1; i < (K + 1) / 2; ++i) 
        {
            int max = (int)Math.max(arr[i], arr[K - i]);
            count = count + max;
        }
        if (K % 2 == 0) 
        {
            count += arr[K / 2] > 0 ? 1 : 0;
        }
        count += arr[0] > 0 ? 1 : 0;
        
        System.out.println(count);
    }
}
