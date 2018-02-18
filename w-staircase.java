import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void staircase(int n) {
        // Complete this function
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n-i; j++) {
                System.out.printf(" ");
            }
            for (int k=1; k<=i;k++) {
                System.out.printf("#");
            }
            System.out.printf("\n");

        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}
