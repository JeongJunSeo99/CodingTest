import java.io.*;
import java.util.*;


public class Main
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
         */
        String a = br.readLine();

        String b = solution(a);

        System.out.println(b);
    }

    private static String solution(String letter) {

            String[] words = letter.split(" ");


            String answer = "";

            String [] arr1 = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
            String [] arr2 = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k","l", "m", "n","o","p","q","r","s", "t", "u", "v", "w", "x", "y", "z"};


            for(int i=0; i<words.length ; i++){
                for(int j=0; j<arr1.length; j++){
                    if(words[i].equals(arr1[j])){
                        answer += arr2[j];
                    }
                }
            }

            return answer;
        }

}

