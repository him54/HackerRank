import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String str = "";
        for(int i=0; i<26; i++)
        {
            for(int j = i+1; j<26; j++){
                char ch1 = (char)('a'+i);
                char ch2  = (char)('a'+j);
                String curr = "";
                for(int k=0; k<n; k++)
                {
                    if(s.charAt(k)== ch1 || s.charAt(k) == ch2)
                    {
                        curr += s.charAt(k);
                    }
                }
                if(curr.length()<str.length())
                {
                    continue;
                } 
                if(isGood(curr))
                {
                    str = curr;
                } 
            }
        }
        System.out.println(str.length());
    }
    public static boolean isGood(String s){
        if(s.length() == 1)
        {
            return false;
        }
    
        for(int i= 1;i<s.length();i++)
        {
            if(s.charAt(i) == s.charAt(i-1))
            {
                return false;
            } 
        }
        return true;
    }
}
