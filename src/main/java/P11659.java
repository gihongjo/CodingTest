import java.util.Scanner;

public class P11659 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //수의 개수
        int N=sc.nextInt();

        int[] array=new int[N+1];

        //수를 구하는 횟수
        int M=sc.nextInt();

        array[0]=0;

        for(int i=1;i<=N;i++){

            array[i]= array[i-1]+sc.nextInt();


        }

        for(int a=0;a<M;a++){

            int fromNum= sc.nextInt();
            int tillNum=sc.nextInt();

            System.out.println(array[tillNum]-array[fromNum-1]);


        }


    }



}
