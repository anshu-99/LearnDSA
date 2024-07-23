package PolymorphismPractice;

class PolyClass2 extends PolyClass1{
    protected void print(){
        System.out.println("Printing child class");
        super.print();
    }
}
