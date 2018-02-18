import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void miniMaxSum(int[] arr) {
        // Complete this function
        long min=0, max=0;
        Arrays.sort(arr);
        for (int i=0; i<4; i++) {
            min+=arr[i];
        }
        for (int j=1; j<5; j++) {
            max+=arr[j];
        }
        System.out.printf("%d %d",min,max);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}
