package Baekjoon;

import java.sql.SQLOutput;
import java.util.Scanner;


public class P11720 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        short num= sc.nextShort();

        String numString = sc.next();

        char[] nums=numString.toCharArray();

        int result= 0;

        for(short i=0;i<num;i++){

            result+=Integer.parseInt(String.valueOf(nums[i]));

        }

        System.out.println(result);

    }

}
