package coreconcepts.Basic;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dem = 0;
        for(int i=1; i*i<=n;i++){
            if(n%i==0){
                dem++;
                System.out.print(i+" ");
                int j = n/i;
                if(i!=j){
                    System.out.print(j+" ");
                    dem++;
                }
            }
        }
        System.out.println();

        System.out.println("So luong uoc: "+dem);
    }
}
