import java.io.*;

public class B_8958 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());

        String[] sArr = new String[a];

        for(int i=0;i<a;i++){
            sArr[i]=br.readLine();
        }

        int count = 0;
        int sum = 0;

        for(int i =0; i<a; i++){
            char[] arr = sArr[i].toCharArray();

            for(int j = 0; j < arr.length; j++){
                if(arr[j] == 'O'){
                    count++;
                }
                else{
                    count = 0;
                }
                sum += count;
            }

            sb.append(sum).append('\n');

            count = 0;
            sum = 0;
        }

        System.out.println(sb);
        br.close();
    }
}
