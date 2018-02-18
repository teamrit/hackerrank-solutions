import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int diagonalDifference(int[][] a) {
        // Complete this function
        int sumP=0, sumS=0, sumF=0;
        for (int i=0; i<a.length; i++) {
             for (int j=0; j<a[i].length; j++) { 
                if (i==j) {
                    sumP+=a[i][j];
                }
                 
                if ((i+j)==a.length-1) {
                    sumS +=a[i][j];
                } 
                 
             }
        }
        sumF = sumP - sumS;
            if (sumF<0) {
                sumF = sumF * (-1);
            }
        return sumF;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a);
        System.out.println(result);
        in.close();
    }
}
