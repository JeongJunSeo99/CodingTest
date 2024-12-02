import java.io.*;
import java.util.*;

public class B_11723 {

    /**
    add x: S에 x를 추가한다. (1 ≤ x ≤ 20) S에 x가 이미 있는 경우에는 연산을 무시한다.
    remove x: S에서 x를 제거한다. (1 ≤ x ≤ 20) S에 x가 없는 경우에는 연산을 무시한다.
    check x: S에 x가 있으면 1을, 없으면 0을 출력한다. (1 ≤ x ≤ 20)
    toggle x: S에 x가 있으면 x를 제거하고, 없으면 x를 추가한다. (1 ≤ x ≤ 20)
    all: S를 {1, 2, ..., 20} 으로 바꾼다.
    empty: S를 공집합으로 바꾼다.
     */
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Set<Integer> set = new LinkedHashSet<>();
        Set<Integer> allSet = new HashSet<>();

        for(int i = 1; i <= 20; i++)
            allSet.add(i);


        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            String s = st.nextToken();

            if(s.equals("add")){
                int num = Integer.parseInt(st.nextToken());
                if(!set.contains(num))
                    set.add(num);
            }
            else if(s.equals("remove")){
                int num = Integer.parseInt(st.nextToken());
                if(set.contains(num))
                    set.remove(num);
            }
            else if(s.equals("check")){
                boolean isTrue = set.contains(Integer.parseInt(st.nextToken()));

                if(!isTrue) sb.append("0\n");
                else sb.append("1\n");
            }
            else if(s.equals("toggle")){
                int num = Integer.parseInt(st.nextToken());

                if(!set.contains(num))
                    set.add(num);
                else
                    set.remove(num);

            }
            else if(s.equals("all")){
                set.addAll(allSet);
            }
            else if(s.equals("empty")){
                set.clear();
            }
        }

        System.out.println(sb);
    }
}
