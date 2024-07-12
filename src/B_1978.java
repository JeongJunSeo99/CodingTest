import java.io.*;
import java.util.*;

public class B_1978 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");


        int count = 0;

        for(int i=0; i<n; i++){
            int num = Integer.parseInt(st.nextToken());

            boolean tr = true;

            if(num == 1) {
                continue;
            }

            for(int j=2; j<num; j++){
                if(num % j == 0) {
                    tr = false;
                    break;
                }
            }

            if(tr) {
                count++;
            }
        }

        System.out.println(count);
    }
}
