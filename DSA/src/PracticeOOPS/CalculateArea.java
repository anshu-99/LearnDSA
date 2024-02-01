package PracticeOOPS;

public class CalculateArea {
    static final double pi=3.14;
    int len;
    int breadth;

    CalculateArea(int len,int bred){
        this.len=len;
        this.breadth=bred;
    }
    protected double calcArea(int l, int b){
        return pi*(l+b);
    }
}
