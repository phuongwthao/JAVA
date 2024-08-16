package coreconcepts.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Bai2 {
    public static int[] sort(int[] a){
        for(int i=0; i<a.length-1;i++){
            for(int j=i+1; j<a.length;j++){
                if(a[j]<a[i]){
                    int tmp = a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }
            }
        }
        return a;
    }
    //Đọc lại chú ý
    //Không được sử dụng Collection (List, ArrayList, Map, Set, ...), chỉ được sử dụng mảng (int[],
    //float[], ...) để thể hiện danh sách hoặc ma trận.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
       
        for(int i:sort(arr)){
            System.out.print(i +" ");
        }
    }
}
