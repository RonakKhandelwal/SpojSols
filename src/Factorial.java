import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ronak on 4/11/15.
 */
public class Factorial {

    public static int zeros(int n, int lower, int ansTillLow) {
        int no2 = 0, no5 = 0;
        while (n > lower) {
            int k = n;
            while (k > 1) {
                if (k % 2 == 0) {
                    double w = 0;
                    while (k % Math.pow(2,w) == 0){
                        w++;
                    }

                    no2+=w;
                    //System.out.println(no2);
                    k = k / 2;
                } else if (k % 5 == 0) {
                    no5++;
                    k = k / 5;
                } else break;
            }
            n--;
        }
        int ans = no2 > no5 ? no5 : no2;
        return ans + ansTillLow;
    }

    public static void main(String[] args) {

        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));*//**//*
        int t=10;
        try {
           t = Integer.parseInt(br.readLine());
            int cases[] = new int[t];
            int ans[] = new int[t];
            int i = 0;
         while (i < t) {
          cases[i] = Integer.parseInt(br.readLine());
                int w = 0, max = 0, flag = 0;
                while (w < i) {
                    if (cases[w] < cases[i] && cases[w] > cases[max]) {
                        max = w;
                        flag = 1;
                    }
                    w++;
                }

                if (flag == 1)
                    ans[i] = zeros(cases[i], cases[max], ans[max]);
                else
                    ans[i] = zeros(cases[i], 0, 0);
                    i++;

            }
            i = 0;
            while (i < t) {
                System.out.println(ans[i++]);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }*/

        for(int i=1000;i<1200;i++){
            System.out.println(i+" "+zeros(i,0,0));
        }

    }
}
