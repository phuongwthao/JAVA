package StringHandling;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String tmp = String.valueOf(s.toCharArray());
        StringBuilder ans = new StringBuilder();
        ans.append(Character.toUpperCase(s.charAt(0)));
        ans.append(s.substring(1));
        System.out.println(ans);
    }
}
