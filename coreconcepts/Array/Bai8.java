package coreconcepts.Array;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] a = new int[m][n];
        int [][] b = new int [n][k];
        for(int i=0; i<m;i++){
            for(int j=0; j<n; j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for(int j =0; j<k;j++){
                b[i][j]= sc.nextInt();
            }
        }
        int [][] c = new int [m][k];
        for(int i=0; i<m; i++){
            for(int j = 0; j<k; j++){
                for(int x = 0; x<n; x++){
                    c[i][j]+=a[i][x]*b[x][j];
                }
            }
        }
        for(int i=0; i<m;i++){
            for(int j=0; j<k; j++){
                System.out.print(c[i][j]+" ");
                System.out.println();
            }
        }
    }
}
