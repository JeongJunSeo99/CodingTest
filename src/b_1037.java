import java.io.*;
import java.util.*;

public class b_1037 {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[n];

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i =0; i<n; i++){
            arr[i] = Integer.parseInt((st.nextToken()));
        }

        Arrays.sort(arr);

        System.out.println(arr[0] * arr[n-1]);

    }
}
