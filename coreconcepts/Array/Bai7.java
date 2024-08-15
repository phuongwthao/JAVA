package coreconcepts.Array;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i]= sc.nextInt();
        }
        int pos_tmp = 0;
        int pos = 0;
        int length_tmp = 1;
        int length = 1;
        for(int i=0; i<n-1;i++){
            if(a[i]<=a[i+1]){
                length_tmp++;
                pos_tmp = i;
            }
            else{
                length_tmp=1;
            }
            if(length_tmp>length){
                length = length_tmp;
                pos = pos_tmp;
            }
        }
        if(length==1){
            System.out.println("Đường chạy dài nhất ở vị trí 0" + " "+"với độ dài là 1");
        }
        System.out.println("Đường chạy dài nhất ở vị trí "+(pos+2-length) + " "+"với độ dài là "+ length);
    }
}
