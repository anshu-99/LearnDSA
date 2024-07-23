package PolymorphismPractice;

public class PolyclassUse {
    public static void main(String[] args) {
        PolyClass1 pl1= new PolyClass2();
        pl1.print();
        System.out.println("Ans:"+pl1.multiply(6,7));
        System.out.println("Ans:"+pl1.multiply(8,9,5));
        System.out.println("Ans:"+pl1.multiply(7,5,3));
    }
}
