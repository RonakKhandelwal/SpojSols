/**
 * Created by ronak on 4/11/15.
 */
public class PrimePallindrome {

    public static boolean isPallindrome(int a){
        String s =a +"";
        String b = new StringBuilder(s).reverse().toString();
        //System.out.println(b);;
        if (s.equals(b)){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {

    }
}
