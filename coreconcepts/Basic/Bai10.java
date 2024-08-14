package coreconcepts.Basic;

public class Bai10 {
    public static boolean prime(int n){
        if(n<2) return false;
        for(int i=2; i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean check(int n){
        if(!prime(n)){
            return false;
        }
        String s = String.valueOf(n);
        for(char i:s.toCharArray()){
            if(!prime(Character.getNumericValue(i))){
                return false;
            }
        }
        String tmp = new StringBuilder(s).reverse().toString();
        if (!prime(Integer.parseInt(tmp))){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        for(int i= 1000000; i<=9999999;i++){
            if(check(i)){
                System.out.println(i);
            }
        }

    }
}
