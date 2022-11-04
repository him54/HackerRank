import java.util.*;
public class Solution {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++)
        {
              arr[i] = sc.nextInt(); 
        }
           insertionSort(arr);
    }    

static void insertionSort(int[] arr){
        int count =0;                     
        for(int i=1; i<arr.length;i++){                      
            int N = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>N)
            {    
                arr[j+1] = arr[j];           
                j--;
                count++;            
            }
        arr[j+1]= n;           
                  
        }    
         System.out.println(count);         
    } 
}    
   
