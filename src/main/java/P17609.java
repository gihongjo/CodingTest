import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P17609 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            char[] arr = stringTokenizer.nextToken().toCharArray();

            int start = 0;
            int end = arr.length - 1;
            short pseudo_palindrome = 0;

            while (start <= end && pseudo_palindrome < 2) {
                if (arr[start] == arr[end]) {
                    start++;
                    end--;
                } else {
                    // 불일치 발생 시 유사회문 여부 확인
                    if (pseudo_palindrome == 0) {
                        // 한 번 건너뛰기 시도
                        if (isPalindrome(arr, start + 1, end)) {
                            pseudo_palindrome = 1;
                            break;  // 유사회문이므로 종료
                        } else if (isPalindrome(arr, start, end - 1)) {
                            pseudo_palindrome = 1;
                            break;  // 유사회문이므로 종료
                        } else {
                            pseudo_palindrome = 2;  // 유사회문도 아님
                            break;
                        }
                    }
                }
            }

            // 회문이면 0, 유사회문이면 1, 아니면 2
            if (pseudo_palindrome == 0 && start > end) {
                System.out.println(0);
            } else if (pseudo_palindrome == 1) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
    }

    // 별도의 회문 확인 함수
    private static boolean isPalindrome(char[] arr, int s, int e) {
        while (s <= e) {
            if (arr[s] != arr[e]) {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}