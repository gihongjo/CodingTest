package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P11004 {

    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer strToken = new StringTokenizer(br.readLine());


        int n = Integer.parseInt(strToken.nextToken());
        int k=Integer.parseInt(strToken.nextToken());


        strToken = new StringTokenizer(br.readLine());

        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(strToken.nextToken());
        }





    }
}
