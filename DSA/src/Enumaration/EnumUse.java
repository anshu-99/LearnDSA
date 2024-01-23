package Enumaration;

public class EnumUse {
    public static void main(String[] args) {
        Colour c1= Colour.BLUE;

        System.out.println("Name:"+ c1.name());
        System.out.println("Value:"+c1.getValues());

        for (Colour colour : Colour.values()){
            System.out.println("Enum name:"+colour.name()+" Enum value:"+colour.getValues());
        }
    }
}
