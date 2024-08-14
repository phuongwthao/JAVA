package coreconcepts.Basic;

public class Bai8 {
    public static void main(String[] args) {
//        for(int i=100; i<=999; i++){
//            String tmp = String.valueOf(i);
//            String j = new StringBuilder(tmp).reverse().toString();
//            System.out.println(tmp+j);
//        }
        for(int i=100; i<=999; i++){
            String tmp = String.valueOf(i);
            String j = new StringBuilder(tmp).reverse().toString();
            int sum =0;
            for(char c : tmp.toCharArray()){
                sum +=Character.getNumericValue(c)*2;
            }
            if(sum%10==0){
                System.out.println(tmp+j);
            }

        }


    }
}
