package Abstraction;

import EnacapsulationAndAbstraction.Encapsulation;

public class SampleCode2 extends SampleCode{
       int height;
       SampleCode2 (int height,String name ){
        super(name);
        this.height = height;
       }
       public static void main(String[] args) {


        Encapsulation encapsulation = new Encapsulation(5);
        System.out.println(encapsulation.age);
        
       }
}
