import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ronak on 4/11/15.
 */
public class Reverse {

    public static int reverse(String a){

        return Integer.parseInt(new StringBuilder(a).reverse().toString());

    }
    public static void main(String[] args) {
        int t;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            t = Integer.parseInt(br.readLine());
            int  ans[] = new int[t];
            int i = 0;
            while (i < t){
                String temp = br.readLine();
                ans[i++] = reverse(temp);
            }

            for (int j = 0; j < ans.length; j++) {
                System.out.println(ans[j]);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
