package Inheritence;

public class BoxSum {
    double l;
    double b;
    double h;


    // Case-1:
    // If box has own length, breadth and height
    BoxSum(){
        this.l=-1;
        this.b=-1;
        this.h=-1;
    }

    // Case-2:
    //If box is Square and it has sides should be equal
    BoxSum(double side){
        this.l=side;
        this.b=side;
        this.h=side;
    }

    // Case-3:
    // If box has given with length, breadth and height

    BoxSum(double l,double b,double h){
        this.l=l;
        this.b=b;
        this.h=h;
    }
}
