import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B_10431 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = 0;
        int N = Integer.parseInt(br.readLine());
        int tall =0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            sb.append(st.nextToken());
            sb.append(" ");

            List<Integer> tallList = new ArrayList<>();
            count = 0;

            while(st.hasMoreTokens()) {

                if(tallList.isEmpty()){
                    tallList.add(Integer.parseInt(st.nextToken()));
                    continue;
                }

                boolean added = false;
                tall = Integer.parseInt(st.nextToken());

                for(int j = 0; j < tallList.size(); j++){
                    if(tallList.get(j) > tall){
                        tallList.add(j, tall);
                        count += tallList.size() -1 - j;
                        added = true;
                        break;
                    }
                }

                if(!added)
                    tallList.add(tall);
            }

            sb.append(count);
            sb.append("\n");

        }

        System.out.println(sb);

    }

}
