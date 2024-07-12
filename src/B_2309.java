import java.io.*;
import java.util.*;

public class B_2309 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        List<Integer> list = new ArrayList<Integer>();

        int sum = 0;

        int num = 0;


        for(int i =0; i<9; i++){

            num = Integer.parseInt(br.readLine());
            list.add(num);

            sum += num;
        }

        list.sort(Comparator.naturalOrder());

        int a = 0;
        int b = 0;
        boolean tr = true;

        for(int i=0; i<list.size()-1; i++){
            for(int j = i+1; j< list.size(); j++){
                if(sum - (list.get(i) + list.get(j)) == 100){
                    a = i;
                    b = j;
                    tr = false;
                    break;
                }
            }
            if(!tr)
                break;
        }

        list.remove(a);
        list.remove(b-1);

        for(int i=0; i<list.size();i++){
            sb.append(list.get(i)).append("\n");
        }

        System.out.println(sb);

    }
}
