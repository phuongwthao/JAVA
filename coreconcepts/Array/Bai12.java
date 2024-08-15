package coreconcepts.Array;

import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][]a = new int[n][n];
        for(int i=0; i<n;i++){
            for(int j=0; j<n; j++){
                a[i][j]= sc.nextInt();
            }
        }
        for(int i=n-1; i>=0; i--){
            for(int j=0; j<n; j++){
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }
}
