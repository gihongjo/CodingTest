    import java.lang.reflect.Array;
    import java.util.Arrays;
    import java.util.Scanner;
    import java.util.Stack;

    public class P1874 {

        public static void main(String[] args) {


            Scanner sc = new Scanner(System.in);

            int N = sc.nextInt();

            StringBuffer bf=new StringBuffer();
            int[] array = new int[N];

            boolean noPrint=false;

            Stack<Integer> stack = new Stack<>();

            for (int i = 0; i < N; i++) {
                array[i] = sc.nextInt();
            }

            int checkNum=1;

            for(int n=0;n<N;n++){
                int su=array[n];

                if(checkNum<=su) {
                    while (checkNum <= su) {
                        bf.append("+\n");
                        stack.push(checkNum++);
                    }
                    stack.pop();
                    bf.append("-\n");
                }

                else{
                    int e= stack.pop();
                    if(e>su){
                        System.out.println("NO");
                        noPrint=true;
                        break;
                    }
                    else{
                        bf.append("-\n");                    }

                }

            }

            if(!noPrint){
                System.out.println(bf.toString());
            }

        }


    }


