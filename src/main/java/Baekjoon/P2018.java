package Baekjoon;

import java.util.Scanner;

public class P2018 {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        int N=sc.nextInt();

        int start=1;
        int end=1;
        int count=1;//N이 15면 15하나만으로 충족될 때를 미리 추가.
        int tmp=0;

        while(end!=N){
            tmp=TMP(start,end);

            if(tmp==N){
//                System.out.println("start: "+start+"end: "+end+"correct");
                count++;
                end++;

            }else if(tmp>N){
//                System.out.println("start: "+start+"end: "+end+"tmp가 더 큼 tmp:"+tmp);
                start++;

            }else{
//                System.out.println("start: "+start+"end: "+end+"tmp가 더 작음 tmp: "+tmp);
                end++;
            }

        }

        System.out.println(count);
    }

    static int TMP(int a, int b){

        int result=0;

        while(a<=b){
            result+=a;
            a++;
        }

        return result;
    }

}
