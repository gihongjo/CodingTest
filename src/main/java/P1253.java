import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1253 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));


        int N=Integer.parseInt(bufferedReader.readLine());
        int[] arr=new int[N];
        int count=0;
        StringTokenizer stringTokenizer=new StringTokenizer(bufferedReader.readLine());

        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(stringTokenizer.nextToken());
        }

        Arrays.sort(arr);

        for(int i=0;i<N;i++){
            int find=arr[i];
            int start=0;
            int end=N-1;

            while(start<end){
                int sum=arr[start]+arr[end];
                if(sum==find){
                    if(start!=i||end!=i){
                        count++;
                        break;
                    } else if (start==i) {
                        start++;
                    }else if(end==i){
                        end--;

                    }
                } else if (sum>find) {
                    end--;
                } else if (sum<find) {
                    start++;
                }
            }


        }

        System.out.println(count);

    }

}
