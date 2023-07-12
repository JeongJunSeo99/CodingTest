import java.io.*;
import java.util.*;

public class b_17425 { //17427번과 달리 테스트 케이스 추가로 시간이 더 걸리므로 약수의 합을 한 번만 계산하고 배열에 저장해두는 방식을 사용해야 함.

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int n = Integer.parseInt(br.readLine());

        long fx[] = new long[1000001]; // 해당 자연수의 모든 약수를 더한 변수.
        long gx[] = new long[1000001]; // 해당 자연수 이하의 모든 fx값을 더한 변수.

        // 1은 모든 수의 약수니까 전부 넣어준다.
        Arrays.fill(fx, 1);

        for(int i=2; i<fx.length; i++) { // i는 2부터 n까지 i를 약수를 갖는 모든 수이므로 2중첩 for문으로 i를 약수로 가지는 모든 자연수에 i를 더해줘서 fx를 채워나감.
            for(int j=1; i*j<fx.length; j++) {
                fx[i*j] += i;
            }
        }

        for(int i=1; i<gx.length; i++) {
            gx[i] += gx[i-1] + fx[i];
        }

        for(int i=0; i<n; i++) {
            int input = Integer.parseInt(br.readLine());

            sb.append(gx[input]).append("\n");
        }

        System.out.println(sb);

    }
}