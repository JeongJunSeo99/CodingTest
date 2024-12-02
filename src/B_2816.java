import java.io.*;
import java.util.*;

public class B_2816 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Integer inputNum = Integer.parseInt(br.readLine());

        String[] channelList = new String[inputNum];
        int kbs1Index = 0;
        int kbs2Index = 0;
        int currentIndex = 0;

        for(int i = 0; i < inputNum; i++){
            channelList[i] = br.readLine();

            if(channelList[i].equals("KBS1"))
                kbs1Index = i;

            if(channelList[i].equals("KBS2"))
                kbs2Index = i;
        }

        if(kbs1Index > kbs2Index)
            kbs2Index++;

        while(true){

            if(currentIndex == kbs1Index){

                while(true){

                    if(kbs1Index == 0)
                        break;

                    sb.append(4);
                    kbs1Index--;
                    currentIndex--;
                }
            }

            if(kbs1Index == 0)
                break;


            sb.append(1);
            currentIndex++;
        }


        while(true){

            if(currentIndex == kbs2Index){

                while(true){

                    if(kbs2Index == 1)
                        break;

                    sb.append(4);
                    kbs2Index--;
                }
            }

            if(kbs2Index == 1)
                break;

            sb.append(1);
            currentIndex++;
        }

        System.out.println(sb);

    }

}
