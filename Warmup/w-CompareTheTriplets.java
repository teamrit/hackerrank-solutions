import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        // Complete this function
        int d0=0,d1=0,d2=0;
        int pa=0,pb=0;
        int [] result= new int [2];
        d0=a0-b0;
        d1=a1-b1;
        d2=a2-b2;
        pa += (d0>0)?1:0;
        pb += (d0<0)?1:0;
        
        pa += (d1>0)?1:0;
        pb += (d1<0)?1:0;
        
        pa += (d2>0)?1:0;
        pb += (d2<0)?1:0;
        
        result[0] = pa;
        result[1] = pb;
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println();
        

    }
}
