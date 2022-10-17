import java.util.Scanner;
class Solution
{
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for(int h = 0; h<T; h++)
    {
    int m = sc.nextInt();
    int n = sc.nextInt();
    int count = 0;
    int sqt = (int) Math.sqrt(m);
    int a = sqt * sqt;
    if(a < m)
    {
        sqt++;
        a = sqt*sqt;
    }
     while(a >= m && a <= n)
    {
        count++;
        sqt++;
        a = sqt*sqt;
    
    }
    System.out.println(count);
    }
 }
}
