import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int num = 0;
            int N = sc.nextInt();
            int K = sc.nextInt();
            for(int j=0; j<N; j++){
                int a = sc.nextInt();
                if(a<=0)
                { 
                  num++;
                }
            }
            if(num < K)
            { 
              System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }  
    }
}
