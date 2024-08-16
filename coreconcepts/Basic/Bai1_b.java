package coreconcepts.Basic;

import java.util.Scanner;

public class Bai1_b {
    public static void main(String[] args) {
        float sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            sum +=(float) 1/n;
        }
        System.out.println(sum);
    }

}
