package coreconcepts.Basic;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sum = 0;
        for(char i:s.toCharArray()){
            sum += Character.getNumericValue(i);
        }
        System.out.println(sum);
    }
}
