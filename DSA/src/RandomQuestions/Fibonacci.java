package RandomQuestions;

import java.util.Scanner;

public class Fibonacci {
    public static long getFibonacci(long n){
        if(n<=1){
            return n;
        }else{
            return getFibonacci(n-1) + getFibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter range");
        int range = sc.nextInt();
        for (int i=0;i<range;i++){
            System.out.print(getFibonacci(i)+" ");
        }
    }
}
