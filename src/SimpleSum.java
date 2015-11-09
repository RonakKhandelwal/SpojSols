import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ronak on 6/11/15.
 */
public class SimpleSum {

    public static void main(String[] args) throws Exception {
    /*    int t;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        int ans[] = new int[t];// 6 = 6 + 3 + 2 +3 +6+1
        int i = 0;
        int max = 0;
        int n[] = new int[t];*/

        for (int i = 0; i < 40; i++) {
            int temp =calc(i);
            System.out.println((i) + " " +(temp));
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


    private static int calc(int n) {

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int temp = gcd(i, n);
            int s = n/temp;
            sum+=s;


        }

        return sum;


    }
}
