package coreconcepts.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Bai2 {
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
        Arrays.sort(arr); //viết hàm sort
        for(int i:arr){
            System.out.print(i +" ");
        }
    }
}
