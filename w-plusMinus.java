import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void plusMinus(int[] arr) {
        // Complete this function
        double pos = 0;
        double neg = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i]<0) {
                neg++;
            }
            if (arr[i]>0) {
                pos++;
            }
        }
        System.out.printf("%f\n", pos/arr.length);
        System.out.printf("%f\n", neg/arr.length);
        System.out.printf("%f\n", 1-((neg+pos))/arr.length);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
        in.close();
    }
}
