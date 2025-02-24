import java.util.Scanner;

public class P1546 {

    public static void main(String[] args){


        Scanner sc=new Scanner(System.in);

        int numOfObjects= sc.nextInt();
        int max=0;
        Double sum= 0.0;


        int[] gradesList = new int[numOfObjects];
        Double[] newGradeList=new Double[numOfObjects];

        gradesList[0]=sc.nextInt();

        max=gradesList[0];

        for(int i=1;i<numOfObjects;i++){
            gradesList[i]=sc.nextInt();
            if(gradesList[i]>max)
                max=gradesList[i];
        }

        for(int a=0;a<numOfObjects;a++){
            newGradeList[a]= (double)gradesList[a]/(double)max*100.0;
            sum+=newGradeList[a];


        }
        System.out.println(sum/numOfObjects);





    }
}
