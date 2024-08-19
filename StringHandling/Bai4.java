package StringHandling;

import java.util.Arrays;
import java.util.Scanner;


public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String [] ss = s.split(" ");

        String tmp = ss[0];
        for(int i=0; i<ss.length; i++){
            if(ss[i].length()>tmp.length()){
                tmp = ss[i];
            }
        }
        System.out.println(s.indexOf(tmp));
    }
}
