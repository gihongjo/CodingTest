package Baekjoon;

import java.util.*;

public class P23971 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();
        int N = sc.nextInt();
        int M = sc.nextInt();

        // 세로로 N칸, 가로로 M칸을 비우는 규칙에 맞게 계산
        int result = (int) (Math.ceil((double) H / (N + 1)) * Math.ceil((double) W / (M + 1)));
        System.out.print(result);

        sc.close();
    }
}
