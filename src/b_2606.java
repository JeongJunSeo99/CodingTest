import java.io.*;
import java.util.*;

public class b_2606 {
    static boolean[] check;
    static int[][] arr;
    static int count = 0;

    static int node, line;


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        node = Integer.parseInt(br.readLine());
        line = Integer.parseInt(br.readLine());

        arr = new int[node+1][node+1];
        check = new boolean[node+1];

        for(int i =0; i<line; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = arr[b][a] =  1;
        }

        dfs(1);

        System.out.println(count-1); //바이러스에 걸린 1 빼주기
    }

    public static void dfs(int start) {

        check[start] = true;
        count++;

        for(int i = 0 ; i <= node ; i++) {
            if(arr[start][i] == 1 && !check[i])
                dfs(i);
        }

    }
}
