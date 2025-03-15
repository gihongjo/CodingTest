package Baekjoon;

import java.util.PriorityQueue;
import java.util.Scanner;

public class P11286 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PriorityQueue<Obj> pq = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            int s = sc.nextInt();
            if (s != 0) {
                pq.add(new Obj(s, Math.abs(s)));
            } else {
                if (pq.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(pq.poll().num);
                }
            }
        }
    }
}

class Obj implements Comparable<Obj> {
    public int num;
    public int absNum;

    public Obj(int num, int absNum) {
        this.num = num;
        this.absNum = absNum;
    }

    @Override
    public int compareTo(Obj o) {
        if (this.absNum != o.absNum) {
            return Integer.compare(this.absNum, o.absNum);
        } else {
            return Integer.compare(this.num, o.num);
        }
    }
}