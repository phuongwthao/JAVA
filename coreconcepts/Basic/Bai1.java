package coreconcepts.Basic;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        float s = 0; nên để int vì float sau sẽ có chữ số thập phân hiển thị phía sau, mà ta đang cộng số nguyên dương
        int s = 0;
        if(n%2==1){
            for(int i=1; i<=n;i+=2){
                s+=i;
            }
        }
        else {
            for(int i=2; i<=n;i+=2){
                s+=i;
            }
        }
        System.out.println(s);
    }
}
