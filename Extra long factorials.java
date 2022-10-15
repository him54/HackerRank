import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        BigInteger res=BigInteger.ONE;
        for(int i=2; i<=N; i++)
        {
        res = res.multiply(BigInteger.valueOf(i));
        }
    System.out.println(res);
    }
}
