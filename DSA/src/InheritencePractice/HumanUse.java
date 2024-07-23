package InheritencePractice;

import java.util.Scanner;

public class HumanUse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter name");
        String name=sc.nextLine();

        System.out.println("enter placeOfBirth");
        String placeOfBirth=sc.nextLine();

        System.out.println("enter height");
        double height=sc.nextDouble();

        System.out.println("enter gender");
        String gender=sc.next();

        System.out.println("enter weight");
        double weight=sc.nextDouble();

        Male ml=new Male(name,placeOfBirth,height,weight,gender);
        ml.showDetails();
    }
}
