import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by ronak on 24/11/15.
 */
public class UncleJonney {


    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            int t= Integer.parseInt(br.readLine());
            while(t > 0){
                int n= Integer.parseInt(br.readLine());
                int songs[]=new int[n];

                String s= br.readLine();
                StringTokenizer st = new StringTokenizer(s);
                int k=0;
                while (st.hasMoreTokens()){
                    songs[k++]=Integer.parseInt(st.nextToken());
                }

                int w=Integer.parseInt(br.readLine())-1;

                int pos=0;
                int sol=songs[w];
                for (int i = 0; i < n; i++) {
                    if(sol > songs[i])pos++;
                }
                System.out.println(pos+1);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
