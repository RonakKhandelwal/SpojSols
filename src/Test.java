import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by ronak on 6/11/15.
 */
public class Test {


    public static void main(String[] args) throws IOException {
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());

        long ans[] = new long[t];
        int i = 0;
        while (i < t) {
            String test = br.readLine();
            StringTokenizer st = new StringTokenizer(test);
            long val[] = new long[4];
            int w = 0;
            while (st.hasMoreTokens()) {
                val[w++] = Long.parseLong(st.nextToken());
            }
            ans[i++] = apFx(val[0], val[1], val[2], val[3]);
        }





        for (int j = 0; j < ans.length; j++) {
            System.out.println(ans[j]);
        }*/


        /*for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                for (int k = 1; k < 10; k++) {
                    for (int l = 1; l < k; l++) {
                        System.out.println(i + " " + j + " " + l + " " + k + " " + apFx(i, j, l, k));
                    }
                }
            }
        }*/
        System.out.println(10543%9);
          /*  for (long i = 1; i < 10; i++) {
                for (long j = 1; j < 10; j++) {
                    for (long k = 1; k < 10; k++) {
                        for (long l = 1; l < k; l++) {
                            System.out.prlongln(i + " " + j + " " + l + " " + k + " ans  " + apFx(i, j, l, k));
                        }
                    }
                }
            }*/
    }

    private static long apFx(long a, long d, long l, long r) {
        long sum = 0;
        long add = 1;
        long num = a + (l - 1) * d;
        add = f(num);

        if (d % 9 ==0){
            long fac = r-l+1;
            sum = add * fac;
            return sum;

        }
        for (long i = l; i <= r; i++) {

            sum = sum + add;
            add += d;
            if (add > 9) {
                add = add % 9;
            }
            if (add == 0){
                add = 9;
            }
        }


        return sum;
    }

    public static long f(long x) {
        if (x < 10)
            return x;
        else {
            long sum = 0;
            while (x != 0) {
                sum = sum + x % 10;
                x = x / 10;
            }
            return f(sum);

        }
    }

}
     