import java.io.*;
import java.util.*;

public class B_23971 {

    public static int[] aX = {1, -1, 0, 0};
    public static int[] aY = {0, 0, 1, -1};
    public static boolean isAble = true;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[][] arr = new int[H][W];
        boolean[][] visited = new boolean[H][W];


        visited[0][0] = false;
        visited[0][1] = false;

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if(i-1>0 && i+1 < H && j-1>0 && j+1 < W) {
                    for(int k=0; k<4; k++) {
                        i += aX[k];
                        j += aY[k];
                        if(!visited[i][j])
                            isAble = false;
                    }
                }
            }

        }
    }
}
