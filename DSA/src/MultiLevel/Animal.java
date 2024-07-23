package MultiLevel;

public class Animal {
    protected void numOflegs(String animal,int num){
        System.out.println("Number of legs of "+animal+" is:"+num);
    }
    protected void gender(String gdr){
        System.out.println("gender is:"+gdr);
    }
}
class Dog extends Animal{
    protected void breed(String brd){
        System.out.println("Breed:"+brd);
    }
}
class Puppy extends Dog{
    public void colour(String clr){
        System.out.println("Colour:"+clr);
    }
}
