package coreconcepts.Array;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][]a = new int[n][n];
        for(int i=0; i<n;i++){
            for(int j=0; j<n; j++){
                a[i][j]= sc.nextInt();
            }
        }
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += a[i][i] + a[i][n-1-i];
        }
        System.out.println(sum);
    }
}
