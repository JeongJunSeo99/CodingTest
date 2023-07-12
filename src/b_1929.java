import java.io.*;
import java.util.*;

public class b_1929 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);

        for(int i = min; i<=max; i++){
            boolean tr = true;

            if(i==1)
                continue;

            for(int j = 2; j <= Math.sqrt(i); j++){ //소수인지 판단 시 해당 자연수의 제곱근 값까지만 약수가 되는지 확인하면 됨
                if(i % j == 0){
                    tr = false;
                    break;
                }
            }

            if(tr)
                sb.append(i).append("\n");
        }

        System.out.println(sb);
    }
}
