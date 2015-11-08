import java.io.BufferedReader;
import java.io.InputStreamReader;


public class LifeUniverseAndEverything {

    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            String ans="";

            while (n != 42){
                ans = ans + n + "\n";
                n = Integer.parseInt(br.readLine());


            }

            System.out.println(ans);
        }
        catch (Exception e){
            e.printStackTrace();
        }


    }
}
