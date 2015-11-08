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

    }

    private static int apFx(int a, int d, int l, int r) {
        int sum = 0;

        for (int i = l; i <= r; i++) {
            int num = a + (i - 1) * d;
            int finalSum = num;
            while (finalSum > 10) {
                int temp = 0;
                while (num != 0) {
                    temp = temp + num % 10;
                    num = num / 10;
                }
                if (temp < 10) {
                    finalSum = temp;
                } else num = temp;
            }
            sum += finalSum;


        }


        return sum;
    }

}
