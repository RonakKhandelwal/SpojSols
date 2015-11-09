import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by ronak on 6/11/15.
 */
public class Eugene {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        int ans[] = new int[t];
        int i = 0;
        while (i < t) {
            String test = br.readLine();
            StringTokenizer st = new StringTokenizer(test);
            int val[] = new int[4];
            int w = 0;
            while (st.hasMoreTokens()) {
                val[w++] = Integer.parseInt(st.nextToken());
            }
            ans[i++] = apFx(val[0], val[1], val[2], val[3]);
        }

        for (int j = 0; j < ans.length; j++) {
            System.out.println(ans[j]);
        }
      /*  for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                for (int k = 1; k < 10; k++) {
                    for (int l = 1; l < k; l++) {
                        System.out.println(i + " " + j + " " + l + " " + k + " ans  " + apFx(i, j, l, k));
                    }
                }
            }
        }*/
    }

    private static int apFx(int a, int d, int l, int r) {
        int sum = 0;
        int add = 1;
        int num = a + (l - 1) * d;
        add = f(num);
        for (int i = l; i <= r; i++) {

            sum = sum + add;
            add += d;
            if (add > 9) {
                add = add % 9;
            }
        }


        return sum;
    }

    public static int f(int x) {
        if (x < 10)
            return x;
        else {
            int sum = 0;
            while (x != 0) {
                sum = sum + x % 10;
                x = x / 10;
            }
            return f(sum);

        }
    }

}
