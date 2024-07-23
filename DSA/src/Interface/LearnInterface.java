package Interface;

public interface LearnInterface {
    int sum(int a,int b);
    int multiply(int a,int b);
}
interface NewInterface extends LearnInterface{
    double circleArea(int r);
}
class ImplementInterface implements LearnInterface,NewInterface{
    public int sum(int a, int b){
        return (a+b);
    }
    public int multiply(int a,int b){
        return (a*b);
    }

    public double circleArea(int r){
        return 3.14*(r*r);
    }
}
