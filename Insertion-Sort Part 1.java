import java.io.*;
import java.util.*;
public class Solution {
     public static void insertIntoSorted(int[] arr) {
        int temp = arr[arr.length-1];
        for(int i = arr.length-2; i  >=0; i--){
            if(temp >= arr[i])
            {
                arr[i+1] = temp;
                printArray(arr);
                break;
            }
            arr[i+1] = arr[i];
            printArray(arr);
        }
        if(temp < arr[0])
        {
          arr[0] = temp;  
          printArray(arr);
        } 
        
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] arr = new int[s];
         for(int i=0;i<s;i++){
            arr[i] = sc.nextInt(); 
         }
         insertIntoSorted(arr);
    }
    
    
    private static void printArray(int[] arr) 
    {
      for(int n : arr){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}
