package coreconcepts.Basic;

import java.util.Scanner;

public class Bai3 {
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = gcd(a,b);
        System.out.println("Uoc chung lon nhat cua hai so la " +c );
        System.out.println("Boi chung nhỏ nhat cua hai so la "+(a*b)/c);
    }
}
