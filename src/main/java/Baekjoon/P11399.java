package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class P11399 {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        int n= sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);

        int sum=0;
        for(int i=0;i<n;i++){



            for(int s=0;s<=i;s++){
                sum+=arr[s];
            }
        }
        System.out.println(sum);

    }
}
