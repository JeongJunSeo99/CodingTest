import java.io.*;
import java.util.*;

public class B_11724 {
    public static int arr[][];
    public static boolean check[];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int node = Integer.parseInt(st.nextToken());
        int line = Integer.parseInt(st.nextToken());

        arr = new int[node+1][node+1];
        check = new boolean[node+1];

        for(int i = 0; i<line; i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st1.nextToken());
            int b = Integer.parseInt(st1.nextToken());

            arr[a][b] = arr[b][a] = 1;

        }

        dfs(1); //dfs 시작점을 모두 돌려봐서 구해야하나?
        // 근데 그러면 중복값이 생김 -> 중복값 제거는 어떻게 할 것인지?
    }

    public static void dfs(int n){

    }
}
