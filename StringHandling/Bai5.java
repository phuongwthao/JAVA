package StringHandling;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[]ss= s.split(" ");
        System.out.println(ss[2]+" "+ss[0]+" "+ss[1]);
    }
}
