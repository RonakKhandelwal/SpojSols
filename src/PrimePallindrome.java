import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrimePallindrome {

    public static boolean isPallindrome(int a) {
        String s = a + "";
        String b = new StringBuilder(s).reverse().toString();
        //System.out.println(b);;
        if (s.equals(b)) {
            return true;
        }
        return false;
    }

    public static boolean isPrime(int n) {
        if (n == 1) return false;
        if (n % 2 == 0) return false;
        int root = (int) Math.floor(Math.sqrt((double) n));

        for (int i = 3; i < root; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            int n=Integer.parseInt(br.readLine());
            for (int i = n;  ; i++) {
                if(isPrime(i)){
                    if (isPallindrome(i)){
                        System.out.println(i);
                        break;
                    }
                }
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
