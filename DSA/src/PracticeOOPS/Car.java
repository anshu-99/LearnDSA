package PracticeOOPS;

public class Car {
    String company;
    String model;
    int year;;
    boolean engineRunning;
    int currentSpeed;
    Car(String company, String model, int year){
        this.company=company;
        this.model=model;
        this.year=year;
    }
    public void startEngine(){
        if(!engineRunning){
            System.out.println("Please Start engine");
        }else{
            System.out.println("Engine is already running");
        }
    }
    public void stopEngine(){
        if(engineRunning){
            System.out.println("Please Stop the engine");
        }else{
            System.out.println("Engine already stopped.");
        }
    }
    public void accelerating(int speedIncrement){
        if(engineRunning){
            currentSpeed = currentSpeed + speedIncrement;
            System.out.println("Accelerating and CurrentSpeed:"+currentSpeed+" km/h");
        }else{
            System.out.println("Can't accelerate,engine is stopped");
        }
    }
}
