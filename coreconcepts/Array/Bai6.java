package coreconcepts.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Bai6 {
    public static int[] sort(int[] a){
        for(int i=0; i<a.length-1;i++){
            for(int j=i+1; j<a.length;j++){
                if(a[j]<a[i]){
                    int tmp = a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i]= sc.nextInt();
        }
        int x = sc.nextInt();
        a = sort(a);
       for(int i:a){
           System.out.println(i);
       }
        if(x>a[n-1]){
            for(int i:a){
                System.out.print(i + " ");
            }
            System.out.println(x);
        }

        for(int i = 0;i<=n-2;i++){
            if(x>=a[i] && x<=a[i+1]){
                for (int j=0; j<=i; j++){
                    System.out.print(a[j] +" ");
                }

                System.out.print(x + " ");

                for(int j = i+1; j<n;j++){
                    System.out.print(a[j]+ " ");
                }
                break;
            }
        }
    }
}
