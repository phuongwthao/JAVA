package coreconcepts.Basic;

public class Bai7 {
    //Đọc lại chú ý đề bài:
    //Không được sử dụng Collection (List, ArrayList, Map, Set, ...), chỉ được sử dụng mảng (int[],
    //float [], ...) để thể hiện danh sách.
    public static boolean check(int n){
        String s = String.valueOf(n);


        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                return false;
            }
        }

        int sum = 0;
        for(char c:s.toCharArray()){
            if (Character.getNumericValue(c)%2==0){
                return false;
            }
            sum += Character.getNumericValue(c);
        }
        if(sum%10!=0){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        for(int i = 100000; i<=999999;i++){
            if (check(i)){
                System.out.print(i + " ");
            }
        }

    }
}
