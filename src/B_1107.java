import java.util.*;
import java.io.*;

public class B_1107 {
    static boolean[] broken;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int first = 100;

        broken = new boolean[10];

        int N = Integer.parseInt(br.readLine());
        int X = Integer.parseInt(br.readLine());

        int arr[] = new int[X];

        if (X != 0){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int i=0; i<X; i++){
                broken[Integer.parseInt(st.nextToken())] = true;
            }
        }


        int min_cnt = Math.abs(N - 100);    // +,- 로만 누르는 경우

        for (int i = 0; i <= 1000000; i++) { //총 백만개의 버튼을 전부 눌러본 후 해당 버튼에서 +,- 버튼을 눌러 N에 다가가는 값을 체크 후 min_cnt 업데이트
            int len = check(i);   // 숫자버튼 누르는 횟수
            if (len > 0) {
                int press = Math.abs(N - i);  // +,- 버튼 누르는 횟수
                min_cnt = Math.min(min_cnt, len + press);   // 최소 이동 횟수 계산
            }
        }

        /*
        0 ~ 500,000

        정상인 숫자키로 N하고 가장 가까운 값 선택

        현재 숫자에서 +, - 버튼을 누르는게 적은지 or 가장 가까운 값에서 +,- 버튼을 누르는게 적은지 판단해야 함
         */
        System.out.println(min_cnt);

    }

    static int check(int n) {
        if (n == 0) {
            if (broken[0]) {
                return 0;
            } else {
                return 1;
            }
        }

        int len = 0;

        while (n > 0) {
            if (broken[n % 10]) {   // 해당 버튼을 누를 때 필요한 버튼이 고장난 경우, return
                return 0;
            }

            n /= 10;
            len += 1;   // 숫자버튼 누르는 횟수 증가
        }

        return len;
    }
}
