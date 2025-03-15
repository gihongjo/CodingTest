package Baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P13023 {

    static ArrayList<Integer>[] arrayList;
    static boolean[] visited;



    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        //노드 개수
        int N= sc.nextInt();


        //엣지 개수
        int E=sc.nextInt();

        for(int i=1;i<N+1;i++){
            visited[i]=false;
        }
        for(int i=1;i<N+1;i++){

            arrayList[i]=new ArrayList<>();
        }


        for(int a=1;a<E+1;a++){
            int s1= sc.nextInt();
            int s2= sc.nextInt();

            arrayList[s1].add(s2);
            arrayList[s2].add(s1);

        }







    }



    public int dfs(int i){
        if(visited[i]){
            return 1;
        }

        return dfs[i]
    }

}
