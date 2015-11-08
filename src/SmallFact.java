import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * Created by ronak on 3/11/15.
 */
public class SmallFact {

    public static BigInteger fact(BigInteger n){
        if (n.equals(0)){
            return BigInteger.ONE;
        }
        return n.multiply(fact(n.subtract(BigInteger.ONE)));
    }

    public static void main(String[] args) {
        int t = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            t = Integer.parseInt(br.readLine());
            BigInteger ques[] = new BigInteger[t];
            BigInteger ans[] = new BigInteger[t];
            int n = t;
            int i = 0;
            while (i < n){
                ques[i++] = BigInteger.valueOf(Integer.parseInt(br.readLine()));
            }

            i = 0;
            while (n > 0){
                ans[i] = fact(ques[i]);
                n--;
                i++;
            }

            for (int j = 0; j < ans.length ; j++) {
                System.out.println(ans[j]);
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }



    }
}
