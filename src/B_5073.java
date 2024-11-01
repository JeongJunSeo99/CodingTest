import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class B_5073 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            String str = br.readLine();

            if(str.equals("0 0 0"))
                break;

            StringTokenizer st = new StringTokenizer(str);
            ArrayList<Integer> arr = new ArrayList<>();

            for(int i = 0; i < 3; i++)
                arr.add(Integer.parseInt(st.nextToken()));

            arr.sort(Comparator.reverseOrder());

            if(arr.get(0) >= arr.get(1) + arr.get(2)){
                sb.append("Invalid").append("\n");
                continue;
            }

            if(arr.get(0).equals(arr.get(1)) && arr.get(0).equals(arr.get(2))){
                sb.append("Equilateral").append("\n");
                continue;
            }

            if(arr.get(0).equals(arr.get(1)) || arr.get(0).equals(arr.get(2)) || arr.get(1).equals(arr.get(2))){
                sb.append("Isosceles").append("\n");
                continue;
            }

            sb.append("Scalene").append("\n");
        }

        System.out.println(sb);

    }

}
