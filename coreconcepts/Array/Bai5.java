package coreconcepts.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }

        int m = sc.nextInt();
        int[] b = new int[m];
        for(int i=0; i<m; i++){
            b[i]=sc.nextInt();
        }
        int p = sc.nextInt();
        int[] c = new int[n+m];
        for(int i=0; i<p;i++){
            c[i] = a[i];
        }
        for(int i=0; i<m;i++){
            c[p+i]=b[i];
        }

        for(int i=p; i<n;i++){
            c[m+i]=a[i];
        }
        for(int i:c){
            System.out.print(i+" ");
        }
    }
}
