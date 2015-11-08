import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by ronak on 6/11/15.
 */
public class Chef {


    public static void main(String[] args) {
        int t;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            t = Integer.parseInt(br.readLine());
            int i = 0;
            String ans[] = new String[t];
            while (i < t) {
                String temp;
                temp = br.readLine();
                StringTokenizer st = new StringTokenizer(temp);
                int tem[] = new int[2];
                int k = 0;
                while (st.hasMoreTokens()) {
                    tem[k++] = Integer.parseInt(st.nextToken());
                }
                ans[i] = checkCake(tem[0], tem[1]);

                i++;
            }

            for (int j = 0; j < ans.length; j++) {
                System.out.println(ans[j]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static String checkCake(int n, int m) {
       String ans = null;

        if (m == 0){
            return "No 1";
        }
        if (n % 2 == 1){
            ans="Yes";
            return ans;
        }
        else if (n % 2 == 0){
            if (m == n/2){
                ans = "No "+2;
            }
            else if (n%m==0){
                ans = "No "+(n/m);
            }
            else ans="No "+(n/2);

        }

        if (m != (n/2) && m%2 == 1){
            return "Yes";
        }

        return ans;

    }
}
