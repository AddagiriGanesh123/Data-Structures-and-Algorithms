public class ThisKeyword {
    public static void main(String[] args) {
        Student kunal=new Student(1,"Kunal Kushwaha",80.8f);
        Student rahul=new Student(2,"Rahul Behara",82.6f);
        Student random=new Student(rahul);
        Student random2=new Student();
        System.out.println(kunal.marks);
        System.out.println(rahul.name);
        rahul.greeting();
        kunal.greeting();
        kunal.changeName("Inquisitive Fleek");
        System.out.println(kunal.name);
        kunal.changeMarks(93.4f);
        System.out.println(kunal.marks);
        System.out.println(random.name);
        System.out.println(random2.name);//name calling from a default constructor
        // Calling a constructor from another constructor
        // Here we couldn't define and initialise the values in that random2 object
        // This is because the default constructor doesn't have any parameters
        Student one=new Student();
        Student two=one;
        one.name="Kushwaha";
        System.out.println(two.name);
    }
}
class Student{
    int rno;
    String name;
    float marks;
    void greeting(){
        System.out.println("My name is "+this.name);
    }
    void changeName(String newName){
        this.name=newName;
    }
    void changeMarks(float newMarks){
       this.marks=newMarks;
    }
    Student(int rno,String name,float marks){
        this.rno=rno;
        this.name=name;
        this.marks=marks;
    }
    String changeName(){
        return "Ganesh";
    }
    //Constructor Overloading : Takes value from one Constructor to another Constructor
    //That is taking value from rahul and gives to random constructor defined here...
    Student(Student other){
        this.name=other.name;
        this.rno=other.rno;
        this.marks=other.marks;
    }
    Student(){
        this(1201,"default person",95.7f);
    }
}
