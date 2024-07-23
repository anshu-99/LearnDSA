package PolymorphismPractice;

public class PolyClass1 {

    protected void print(){
        System.out.println("Parent Class Printed");
    }
    protected int multiply(int num,int num1){
        return (num*num1);
    }

    protected int multiply(int num,int num1,int num2){
        return (num*num1*num2);
    }

    protected int multiply(int num,int num1,int num2,int num3){
        return (num*num1*num2*num3);
    }
}
