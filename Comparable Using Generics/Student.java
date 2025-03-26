package GenericComparator;
// Comparable in java means that a class can be compared with the other objects of the same class
// Here we are used tp compare the object of the STUDENT class with the other object of the same STUDENT class
public class Student implements Comparable <Student> {
    int marks;
    float percentage;
    public Student(int marks,float percentage){
        this.marks = marks;
        this.percentage = percentage;
    }
    @Override
    public String toString() {
        return marks+","+percentage;
    }
    public int compareTo(Student other){
        int diff = this.marks - other.marks;
        return diff;

        // If we keep -(this.marks-other.marks) supposed to give the descending order values in the main method
    }
}

    

