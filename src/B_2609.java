import java.io.*;
import java.util.*;

public class B_2609 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        int n1 = Math.max(num1, num2);
        int n2 = Math.min(num1, num2);

        int gcd = getGcd(n1, n2);

        System.out.println(gcd);
        System.out.println((n1*n2)/gcd); //최소 공배수는 두 수 곱하고, 최대 공약수로 나누면 됨
    }

    public static int getGcd(int a, int b){
        while(b>0){
            int tmp = a;
            a = b;
            b= tmp % b;
        }
        /* 유클리드 호제법
            1)  입력 받은 두 수중 큰 수를 A, 작은수를 B로 정한다.
            2)  A 를 B 로 나눈값의 나머지를 R로 지칭한다.
            3)  R 이 0이라면 A는 B로 나누어 지기 때문에 최대 공약수는 B가 된다.
            4)  만약 R이 0이 아니라면 A값은 B로, B 값은 R로 변경한뒤 3번 과정을 반복한다.
         */
        return a;
    }
}
