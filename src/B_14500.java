import java.util.*;
import java.io.*;

public class B_14500 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int num1 = Integer.parseInt((st.nextToken()));
        int num2 = Integer.parseInt((st.nextToken()));

        int board[][] = new int[num1][num2];

        int max = 4;

        for(int i = 0; i<num1; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<num2; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i<num1; i++){
            for(int j=0; j<num2; j++){
                //여기서 테트리스를 놓을 수 있는 모든 경우의 수를 따져봄.
            }
        }


    }
}
