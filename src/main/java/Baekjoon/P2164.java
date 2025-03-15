package Baekjoon;

import java.util.AbstractQueue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2164 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int ans;
        Queue<Integer> queue=new LinkedList();

        for(int n=1;n<=N;n++){

            queue.add(n);
        }

        while(queue.size()>1){
            queue.remove();
            queue.add(queue.element());
            queue.remove();

        }

        System.out.println(queue.element());
    }


}
