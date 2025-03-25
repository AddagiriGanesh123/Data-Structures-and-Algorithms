package Interfaces;

public class Car implements Engine,Brake {
    @Override
    public void start(){
        System.out.println("I want to start normal car");
    }
    @Override
    public void stop(){
        System.out.println("I want to stop normal car");
    }
    @Override
    public void acc(){
        System.out.println("I want to accelearate noramal car");
    }
    @Override
    public void brake(){
        System.out.println("I want to brake normal car");
    }
}
