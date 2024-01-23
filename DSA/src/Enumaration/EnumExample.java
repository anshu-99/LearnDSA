package Enumaration;

enum Colour{
    RED("red"),GREEN("green"),BLUE("blue");

    private String values;

    Colour(String values){
        this.values=values;
    }
    public String getValues(){
        return values;
    }
}
