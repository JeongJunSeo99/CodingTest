import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2292 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        //        1 -> 방 1개
        //        7(6) -> 방 2개
        //        19(12) -> 방 3개
        //        37(18) -> 방 4개
        //        61(24) -> 방 5개

        int start = 1;
        int mulNum = 1;
        int num = 1;

        if(input == start){
            System.out.println(mulNum);
            return;
        }

        while(true){

            if(start < input && input <= start + (mulNum * 6)){
                System.out.println(mulNum + 1);
                return;
            }

            num++;

            if(num == start + (mulNum * 6)){
                start = start + (mulNum * 6);
                mulNum++;
            }

        }

    }
}
