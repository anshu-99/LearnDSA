package AccessModifier;

import java.util.Scanner;

public class AccessModifiersUSe {
    public static void main(String[] args) {
        AccessModifiers obj=new AccessModifiers("Udbhav Ojha","udbhavsbg@gmail.com");
        obj.maritalDetails="Married";
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you wanna set new Bank ID");
        String ans= sc.nextLine();
        if(ans.equalsIgnoreCase("Yes")){
            System.out.println("enter new ID");
            int bankId=sc.nextInt();
            obj.setBankId(bankId);
            obj.getBankId();
        }else{
            obj.getBankId();
        }
        System.out.println("Do you wanna set new Bank Password");
        String myAns= sc.next();
        if(myAns.equalsIgnoreCase("Yes")){
            System.out.println("enter new Password");
            int bankPass=sc.nextInt();
            obj.setBankPassword(bankPass);
            obj.getBankPassword();
        }else{
            obj.getBankId();
        }

        AccessModifiers.showDetails(obj);
    }
}
