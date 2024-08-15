package coreconcepts.Array;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int ok = 1; //Chú ý giá trị
        for(int i=0; i<=n/2;i++){
            if(arr[i]!=arr[n-1-i]){
                ok = 0;
                break;
            }
        }
        if(ok==1){
            System.out.println("La mang doi xung");
        }
        else {
            System.out.println("Khong la mang doi xung");
        }
    }
}
