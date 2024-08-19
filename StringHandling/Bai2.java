package StringHandling;

import java.util.Locale;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(i%2==0){
                ans.append(Character.toUpperCase(c));
            }
            else{
                ans.append(Character.toLowerCase(c));
            }
        }
        System.out.println(ans);
    }
}
