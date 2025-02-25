import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1940 {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count=0;
        //재료 개수


        int N= Integer.parseInt(br.readLine());
        int[] sortArr=new int[N];
        //완성될 번호
        int M= Integer.parseInt(br.readLine());;

        //양 끝 단에서부터 스캔
        int start_index=0,end_index=N-1;



        StringTokenizer stringTokenizer=new StringTokenizer(br.readLine());

        for(int i=0;i<N;i++){
            sortArr[i]= Integer.parseInt(stringTokenizer.nextToken());
        }
        //재료 정렬
        Arrays.sort(sortArr);

        while(sortArr[start_index]<sortArr[end_index]){
            int sum=sortArr[start_index]+sortArr[end_index];

            if(M==sum){
                count++;
                start_index++;
                end_index--;
            }else if(M>sum){
                start_index++;
            }else {
                end_index--;
            }


        }

        System.out.println(count);

    }
}
