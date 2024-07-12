import java.io.*;
import java.util.*;

public class B_1476 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int max_E = 15;
        int max_S = 28;
        int max_M = 19;

        int E = Integer.parseInt(st.nextToken()); // 1 ~ 15
        int S = Integer.parseInt(st.nextToken()); // 1 ~ 28
        int M = Integer.parseInt(st.nextToken()); // 1 ~ 19

        int year = 0;

        while (true) {
            year++;

            int tE = year % max_E;
            int tS = year % max_S;
            int tM = year % max_M;
            
            // E S M 은 각각 1 부터 시작하므로 year % max의 값이 0이 된다면 최대값이라는 소리 
            if (tE == 0)
                tE = max_E;
            if (tS == 0)
                tS = max_S;
            if (tM == 0)
                tM = max_M;

            if (tE == E && tS == S && tM == M)
                break;
        }

        System.out.println(year);
    }
}
