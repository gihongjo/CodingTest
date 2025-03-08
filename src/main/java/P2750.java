import java.util.Scanner;

public class P2750 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n= sc.nextInt();

        int[] arr=new int[n];


        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n-1;i++){
            for(int a=0;a<n-i-1;a++){
                if(arr[a]>arr[a+1]){
                    int tmp=arr[a];
                    arr[a]=arr[a+1];
                    arr[a+1]=tmp;
                }


            }

        }

        for(int a: arr){
            System.out.println(a);
        }



    }

}
