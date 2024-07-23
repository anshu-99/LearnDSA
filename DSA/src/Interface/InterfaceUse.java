package Interface;

public class InterfaceUse {
    public static void main(String[] args) {
        ImplementInterface obj= new ImplementInterface();
        System.out.println("Result:"+obj.sum(67,90));
        System.out.println("Result:"+obj.circleArea(4));
        System.out.println("Result:"+obj.multiply(56,77));
    }
}
