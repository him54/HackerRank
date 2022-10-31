import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int B=0; B < N; B++){
            arr[B] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < N - 1; i++) {
            if (arr[i] % 2 != 0) 
            {
                arr[i + 1]++;
                count += 2;
            }
        }
        if (arr[N - 1] % 2 == 0)
         {
            System.out.println(count);
        }
        else 
        {
            System.out.println("NO");
        }
    }
}
