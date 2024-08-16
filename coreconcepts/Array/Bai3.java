package coreconcepts.Array;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
       // int[] cnt = new int[99999999]; //Không nên fix cứng giá trị ntn

        int countmax = 0;
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
            if(arr[i]>countmax){
                countmax=arr[i];
            }
           // cnt[arr[i]]++;
        }
        int[]cnt = new int[countmax+1];
        for(int i:arr){
            cnt[i]++;
        }

        int max = 0;
        int numbermax = arr[0];
        for(int i:arr){
            if(cnt[i]!=0){
                System.out.println("So lan xuat hien "+i+":"+cnt[i]);
                if(cnt[i]>max){
                    max = cnt[i];
                    numbermax = i;
                }
                cnt[i]=0;
            }
        }
        System.out.println("Phan tu co so lan xuat hien nhieu nhat:"+numbermax);
    }
}
