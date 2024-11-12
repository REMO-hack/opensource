import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(c>a+b || a>b+c || b>c+a) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
