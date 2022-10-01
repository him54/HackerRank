import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int fd = num2 / 2;
        int bd = num1 % 2 == 0 ? (num1 - num2 + 1) / 2 : (num1 - num2) / 2;
        System.out.println(Math.min(fd, bd));
        
    }
}
