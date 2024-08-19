package StringHandling;

import java.util.Scanner;

public class Bai1 {
    public static boolean check(int n){
        String s = String.valueOf(n);
        String tmp = new StringBuilder(s).reverse().toString();
        return s.equals(tmp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        System.out.println(check(n));

        for(int i = 1000000; i<=999999; i++){
            if(check(i)){
                System.out.println(i);
            }
        }


    }
}
