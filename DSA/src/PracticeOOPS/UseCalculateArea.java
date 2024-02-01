package PracticeOOPS;

import java.util.Scanner;



public class UseCalculateArea {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter length and breadth");
        int len=sc.nextInt();
        int bred=sc.nextInt();
        CalculateArea area= new CalculateArea(len,bred);
        System.out.println("Area:"+ area.calcArea(len,bred));

        System.out.println("enter length and breadth");
        int len1=sc.nextInt();
        int bred1=sc.nextInt();

        CalculateArea area1= new CalculateArea(len1,bred1);
        System.out.println("Area:"+area1.calcArea(len1,bred1));
    }
}
