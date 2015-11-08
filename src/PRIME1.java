import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class PRIME1 {


    public static void printPrimes(int low, int up){
        int sol[] = new int[up + 1];
        for (int i = 0; i < up+1; i++) {
            sol[i] = 0;
        }
        sol[0] = 1;
        sol[1] = 1;

        for (int i = 2; i < (up +1)/2; i++){
            int k = 2;
            int b = i * k;
            if (sol[i] == 0) {
                while (b <= up) {
                    sol[b] = 1;
                    k++;
                    b = i * k;
                }
            }
        }

        for (int i = 0; i < up + 1; i++) {
            if (sol[i] == 0 && i >= low){
                System.out.println(i);
            }
        }
        System.out.println("");


    }
    public static void main(String[] args) throws Exception{
        int n;
        int[] lower,upper;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        lower = new int[n];
        upper = new int[n];
        int k = 0;
        int t = n;
        while (t > 0){
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            String st1[] =new String[2];
            int i = 0;
            while (st.hasMoreTokens()){
                st1[i++] = st.nextToken();
            }
            lower[k] = Integer.parseInt(st1[0]);
            upper[k] = Integer.parseInt(st1[1]);
            k++;
            t-- ;
        }
        t = n;
        k = 0;
        while (t > 0){
            printPrimes(lower[k], upper[k]);
            k++;
            t--;
        }
    }
}
