package coreconcepts.Array;

import java.util.Scanner;

public class Bai4 {
    public static boolean prime(int n){
        if(n<2) return false;
        for(int i=2; i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;

    }
    public static int abs(int a,int b){
        int c = a-b;
        if(c>0){
            return c;
        }
        else {
            return -c;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int x = sc.nextInt();
        int ans = 0;
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            if(prime(arr[i])){
                if(abs(arr[i],x)<tmp){
                    tmp = abs(arr[i],x); //Viết hàm không dùng Collection
                    ans = i;
                }
            }
        }
        System.out.println(ans);
    }
}
