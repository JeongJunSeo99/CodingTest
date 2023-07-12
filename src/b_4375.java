import java.io.*;
import java.util.*;


public class b_4375 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; true; i++) {
            String str = br.readLine();

            if (str == null) {
                break;
            }

            int a = Integer.parseInt(str);
            long num = 0;
            //long b = 0;

            for (int j = 1; j <= a; j++) {
                num = num * 10 + 1; //num은 1, 11, 111로 커짐
                //b = num % a;
                num %= a; //% 연산은 *와 +에서 분배법칙 성립하므로 이전에 구한 값에 *10 +1를 하고 %연산 해도 똑같음

                //if(b==0){
                if (num == 0) {
                    System.out.println(j);
                    break;
                }
            }
        }
    }
}

