package Baekjoon;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class P11724 {
    static ArrayList<Integer>[] arrayList;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int E = sc.nextInt();

        arrayList = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            arrayList[i] = new ArrayList<>();
        }

        visited = new boolean[N + 1];
        for (int i = 1; i <= N; i++) {
            visited[i] = false;
        }

        // 간선 입력 루프 수정: i <= E
        for (int i = 1; i <= E; i++) {
            int s1 = sc.nextInt();
            int s2 = sc.nextInt();
            arrayList[s1].add(s2);
            arrayList[s2].add(s1);
        }

        int count = 0;
        boolean visitedAll = false;

        while (visitedAll == false) {
            visitedAll = true;
            int visiting = 0;

            // 방문하지 않은 노드 찾기
            for (int a = 1; a <= N; a++) {
                if (visited[a] == false) {
                    visiting = a; // 방문하지 않은 첫 노드에서 시작
                    visitedAll = false;
                    break;
                }
            }

            if (!visitedAll && visiting != 0) { // 유효한 노드에서만 DFS
                if (dfs(visiting)) {
                    count++;
                }
            }
        }

        System.out.println(count);
        sc.close();
    }

    static boolean dfs(int v) {
        if (visited[v]) {
            return false;
        }

        visited[v] = true;

        for (int i : arrayList[v]) {
            if (visited[i] == false) {
                dfs(i);
            }
        }
        return true;
    }
}