import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B_2178 {

    static int[][] map;
    static boolean[][] visited;
    static int N, M;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,-1,1};
    static Queue<Node> q = new LinkedList<Node>();

    public static class Node {
        int x, y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            char[] cArr = str.toCharArray();

            for (int j = 0; j < cArr.length; j++) {
                map[i][j] = Character.getNumericValue(cArr[j]);
            }
        }

        bfs(0, 0);

        System.out.println(map[N - 1][M - 1]);
    }

    public static void bfs(int x, int y) {
        q.add(new Node(x,y));
        visited[x][y] = true;

        while(!q.isEmpty()) {
            Node n = q.poll();

            for(int i = 0; i < 4; i++) {
                int nx = n.x + dx[i];
                int ny = n.y + dy[i];

                if(nx<0 || ny<0 || nx>=N || ny>=M)
                    continue;

                if(!visited[nx][ny] && map[nx][ny] == 1){
                    visited[nx][ny] = true;
                    q.add(new Node(nx,ny));
                    map[nx][ny] = map[n.x][n.y] + 1;

                    if(nx == N-1 && ny == M-1)
                        return;
                }
            }
        }
    }

}

/* DFS로 먼저 풀었다가 시간초과로 인해 실패 -> BFS로 진행 */
//public class b_2178 {
//
//    static int[][] map;
//    static boolean[][] visited;
//    static int N, M;
//    static int[] dx = {1,-1,0,0};
//    static int[] dy = {0,0,-1,1};
//    static int count = 1;
//    static int min = Integer.MAX_VALUE;
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        N = Integer.parseInt(st.nextToken());
//        M = Integer.parseInt(st.nextToken());
//        map = new int[N][M];
//        visited = new boolean[N][M];
//
//        for (int i = 0; i < N; i++) {
//            String str = br.readLine();
//            char[] cArr = str.toCharArray();
//
//            for (int j = 0; j < cArr.length; j++) {
//                map[i][j] = Character.getNumericValue(cArr[j]);
//            }
//        }
//
//        dfs(0, 0);
//
//        System.out.println(min);
//    }
//
//    private static void dfs(int x, int y) {
//        visited[x][y] = true;
//
//        for(int k = 0; k < 4; k++) {
//            int nx = x + dx[k];
//            int ny = y + dy[k];
//
//            if(nx < 0 || nx >= N || ny < 0 || ny >= M)
//                continue;
//
//            if(!visited[nx][ny] && map[nx][ny] == 1){
//                count++;
//
//                if (nx == N - 1 && ny == M - 1)
//                    min = Math.min(min, count);
//
//                dfs(nx, ny);
//                visited[nx][ny] = false;
//                count --;
//            }
//        }
//
//    }
//
//}
