import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = solve(n, d, arr);
        System.out.println(res);
    }

    private static int solve(int n, int d, int[] arr) {
        HashMap<Integer, Integer>hm1 = new HashMap<>();
        HashMap<Integer, Integer>hm2 = new HashMap<>();

        int r = 0;
        for (int i = 0; i < n; i++)
         {
            if (hm2.containsKey(arr[i])) 
            {
                int c = hm2.remove(arr[i]);
                r += c;
            }
            if (hm1.containsKey(arr[i]))
             {
                int c = hm1.remove(arr[i]);
                hm2.put(arr[i] + d, c);
            }
            add(hm1, arr[i]+d);
        }
        return r;
    }

    private static void add(HashMap<Integer, Integer> hm, int key) {
        Integer old = hm.get(key);
        if(old == null) 
        {
            old = 0;
        }
        old++;
        hm.put(key, old);
    }
}
