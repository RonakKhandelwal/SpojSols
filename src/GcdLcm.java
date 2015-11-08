import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by ronak on 4/11/15.
 */
public class GcdLcm {

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b, int gcd) {
        return (a * b) / gcd;

    }

    public static void main(String[] args) {
        int t = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            t = Integer.parseInt(br.readLine());
            int gcd[] = new int[t];
            int lcm[] = new int[t];
            int i = 0;
            while (i < t) {
                String s = br.readLine();
                StringTokenizer st = new StringTokenizer(s);
                int test[] = new int[2];
                int k = 0;
                while (st.hasMoreTokens()) {
                    test[k++] = Integer.parseInt(st.nextToken());
                }
                int a, b;
                if (test[0] > test[1]) {
                    b = test[0];
                    a = test[1];
                } else {
                    b = test[1];
                    a = test[0];
                }
                gcd[i] = gcd(a, b);
                lcm[i] = lcm(a, b, gcd[i]);
                i++;
            }
            i = 0;
            while (i < t){
                System.out.println(gcd[i] + " " + lcm[i]);
                i++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
