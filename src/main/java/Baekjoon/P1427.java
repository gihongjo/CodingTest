package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class P1427 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();

        char[] c= n.toCharArray();

        int[] a= new int [c.length];

        for(int i=0;i<c.length;i++){

            a[i]=Integer.parseInt(String.valueOf(c[i]));

        }
        int N=a.length;

        for(int i=0;i<N;i++){
            int indexOfMin=i;
            boolean changed=false;

            for(int w=i;w<N;w++){
                if(a[indexOfMin]>a[w] && indexOfMin!=w){
                    indexOfMin=w;
                    changed=true;
                }
            }

            if(changed){
                int tmp=a[i];
                a[i]=a[indexOfMin];
                a[indexOfMin]=tmp;
            }


        }

        for(int q=N-1;q>=0;q--){
            System.out.print(a[q]);
        }
    }

}
