import java.util.*;
public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        int cloud = 0;
        int energy_level = 100;
                for(int y = 0; y < n; y++)
{
            cloud = (cloud + k) % n;
            energy_level--;
            
            if(arr[cloud] == 1)
            {
                energy_level -= 2;
            }
            
            if(cloud == 0)
            {
                break;
            }
        }
        System.out.println(energy_level);
    }
}
