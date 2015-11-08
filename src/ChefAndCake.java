import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by ronak on 6/11/15.
 */
public class ChefAndCake {


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
        int cake[] = new int[n];
        for (int i = 0; i < n; i++) {
            cake[i] = i;
        }
        int cake2[] = new int[n];
        int k = 0;
        for (int i = m; i < n; i++) {
            cake2[k++] = cake[i];
        }
        int i = 0;
        for (; k < n; k++) {
            cake2[k] = cake[i++];
        }
        /*for (int j = 0; j < n; j++) {
            System.out.print(cake2[j]+" ");
        }

*/
        i = 0;
        while (true) {
            if (cake2[i] != -1) {
                int temp = cake2[i];
                cake2[i] = -1;
                i = temp;
            } else break;
        }


        int flag = 0, count = 0;
        for (int j = 0; j < n; j++) {
            if (cake2[j] != -1) {
                flag = 1;
                continue;
            }
            count++;
        }

        if (flag == 1) {
            String ans = "No " + count;
            return ans;
        } else {
            String ans = "Yes";
            return ans;
        }


    }
}
