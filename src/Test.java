/**
 * Created by ronak on 9/11/15.
 */
public class Test {

    public static void main(String[] args) {
        for (int i = 15; i < 30; i++) {
            System.out.println(i+" "+f(i));
        }
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
