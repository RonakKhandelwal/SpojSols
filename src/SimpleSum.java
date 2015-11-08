import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ronak on 6/11/15.
 */
public class SimpleSum {

    public static void main(String[] args) throws Exception {
        int t;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        int ans[] = new int[t];
        int i = 0;
        while (i < t) {
            int n = Integer.parseInt(br.readLine());
            ans[i++] = calc(n);
        }

        for (int j = 0; j < ans.length; j++) {
            System.out.println(ans[j]);
        }
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else return gcd(b, a % b);
    }

    private static int calc(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum+=(n/(gcd(n,i)));
        }

        return sum;


    }
}
