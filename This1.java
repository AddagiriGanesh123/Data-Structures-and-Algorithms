/*OOPS:
Class: It is defined as the named group of properties and functions and it is called as a template or a blueprint
Object: Instance of class 
This:This Keyword is used to refer the current object in the deefined Method/Function
*/

public class This1 {
    public static void main(String[] args) {
        Box obj=new Box(1,2,3);
        int x=obj.volume();
        System.out.println("volume is " + x);
    }
}
class Box{
    int len,dep,hei;
    Box(int len,int dep,int hei){
        this.len=len;
        this.dep=dep;
        this.hei=hei;
    }
    int volume(){
        return len*dep*hei;
    }
}
