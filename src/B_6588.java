import java.io.*;

public class B_6588 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean[] prime = new boolean[1000001];

        prime[0] = true; // 소수를 false로 함
        prime[1] = true;

        // 처음엔 다 prime(false)으로 세팅
        // 배수는 prime이 아니므로 true
        for (int i = 2; i <= (int) Math.sqrt(1000000); i++) {
            for (int j = 2; i * j < 1000001; j++) {
                prime[i * j] = true; // 소수가 아님
            }
        }

        //------------------------------소수 세팅-------------------------------------

        int n = Integer.parseInt(br.readLine());

        while(n != 0){
            boolean tr = false;

            for (int i = 2; i <= n / 2; i++) { //입력된 짝수값을 반으로 나눠서 3(prime[2])부터 i만큼 올라가고, n부터 i만큼 빼가면서 두 가지 모두 소수인 경우를 찾음 
                if (!prime[i] && !prime[n - i]) {
                    sb.append(n + " = " + i + " + " + (n - i)).append("\n");
                    tr = true;
                    break;
                }
            }

            if(!tr)
                sb.append("Goldbach's conjecture is wrong.").append("\n");

            n = Integer.parseInt(br.readLine());
        }

        System.out.println(sb);

    }
}
