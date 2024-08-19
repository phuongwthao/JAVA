package StringHandling;

import java.util.Arrays;
import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] ss = s.split(" ");
        Arrays.sort(ss);
        System.out.println(String.join(" ",ss));
    }
}
