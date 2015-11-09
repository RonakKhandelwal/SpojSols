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


    private static int gcd(int u, int v) {
        // simple cases (termination)
        if (u == v)
            return u;

        if (u == 0)
            return v;

        if (v == 0)
            return u;

        // look for factors of 2
        if (u % 2 == 0) // u is even
        {
            if (v % 2 == 1) // v is odd
                return gcd(u >> 1, v);
            else // both u and v are even
                return gcd(u >> 1, v >> 1) << 1;
        }

        if (v % 2 == 0) // u is odd, v is even
            return gcd(u, v >> 1);

        // reduce larger argument
        if (u > v)
            return gcd((u - v) >> 1, v);

        return gcd((v - u) >> 1, u);
    }

    private static String checkCake(int n, int m) {
        String ans = null;
        int a = gcd(n,m);
        if (a == 1){
            return "Yes";
        }
        else {
            ans = "No "+(n/a);
        }
        return ans;

    }
}
