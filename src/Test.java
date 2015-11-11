import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by ronak on 6/11/15.
 */
public class Test {


    public static void main(String[] args) throws IOException {


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 30; j++) {
                for (int k = 1; k < 100; k++) {
                    for (int l = 0; l < k; l++) {
                        System.out.println(i + " " + j + " " + l + " " + k + " " + apFx(i, j, l, k));
                    }
                }
            }
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
     