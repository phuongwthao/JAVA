package coreconcepts.Basic;

import java.util.Scanner;

public class Bai9 {
    public static boolean check(String n){
        for(int i = 0; i<=n.length()/2;i++){
            if(n.charAt(i)!=n.charAt(n.length()-1-i)){
                return false;
            }
        }
        int sum = 0;
        for(char i : n.toCharArray()){
            sum = sum + Character.getNumericValue(i);
        }
        return sum % 10 == 0;
    }

    public static void Try(int n, String s){
        if(s.length()==n){
            if(check(s)){
                System.out.println(s);
            }
            return;
        }
        if(s.isEmpty()){
            Try(n,s+"6");
            Try(n,s+"8");
        }
        else {
            Try(n,s+"0");
            Try(n,s+"6");
            Try(n,s+"8");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Try(7,"");
        Try(8,"");
        Try(9,"");

    }
}
