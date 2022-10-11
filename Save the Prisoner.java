import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0; i<n; i++){
            String[] sp = sc.nextLine().split("\\s+");
            int N = Integer.parseInt(sp[0]);
            int M = Integer.parseInt(sp[1]);
            int S = Integer.parseInt(sp[2]);
           
            int num = M+S;
            num = (num-1)%N;
            if(num == 0)
            {
                num = N;
            }
            System.out.println(num);
        }
    }
}
