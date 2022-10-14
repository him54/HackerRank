import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        long n;
        long m;
        int T = sc.nextInt();
        while(T-->0)
        {
            int number_digit = 0;
            n = sc.nextLong();
            m = n;
            while(m != 0)
            {
                int dig = (int)m % 10;
                m = m / 10;
                if(dig == 0)
                {
                 continue;
                }
                if(n % dig == 0)
                {
                 number_digit++;
                }
            }
            System.out.println(number_digit);
        }
    }
}
