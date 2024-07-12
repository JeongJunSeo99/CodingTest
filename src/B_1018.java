import java.io.*;
import java.util.*;

public class B_1018 {


    static int min = 64;
    public static boolean[][] arr;


    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        arr = new boolean[M][N];

        for (int i = 0; i < M; i++) {
            String str = br.readLine();

            for (int j = 0; j < N; j++) {
                if (str.charAt(j) == 'W') {
                    arr[i][j] = true;		// W일 때는 true
                } else {
                    arr[i][j] = false;		// B일 때는 false
                }

            }
        }

        int aN = N-7;
        int aM = M-7;

        for(int i = 0 ;  i < aM; i++){
            for(int j = 0; j < aN; j++){
                find(i,j);
            }
        }

        System.out.println(min);

    }

    public static void find(int y, int x){
        int end_x = x+8;
        int end_y = y+8;
        int count = 0;

        boolean TF = arr[y][x];
        System.out.println("log : " + TF);

        for(int i = y; i< end_y; i++){
            for(int j = x; j< end_x; j++){

                // 올바른 색이 아닐경우 count 1 증가
                if (arr[i][j] != TF) { // 첫 칸에 설정한 색을 기준으로 올바른 체스판이 정해진 상태
                    count++;
                }

                /*
                 * 다음 칸은 색이 바뀌므로
                 * true라면 false로, false 라면 true 로
                 * 값을 변경한다.
                 */
                TF = (!TF);
            }

            TF = !TF;

        }

        count = Math.min(count, 64-count);

        min = Math.min(count, min);
    }
}
