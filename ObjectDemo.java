// This is the code resembles about the Object Methods in Java
public class ObjectDemo {
    int num = 1201;
    public ObjectDemo(int num) {  
        this.num = num;
    }
    // Object OverRidden Methods:
    // @SuppressWarnings("removal")
    // @Override
    // protected void finalize() throws Throwable {
    //     // TODO Auto-generated method stub
    //     super.finalize();
    // }
    // @Override
    // public int hashCode() {
    //     //  -> Todo Auto-generated method stub
    //     return super.hashCode();
    // }
    // @Override
    // public String toString() {
    //     // TODO Auto-generated method stub
    //     return super.toString();
    // }
    
    
    @Override
    public int hashCode() {
        // Todo Auto- generated method stub
        return super.hashCode();
    }
    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(1201);
        ObjectDemo obj2 = new ObjectDemo(1201);
        // To genearate ahshcode for the number 1201 
        // Eve though java reads that number as 1201
        // That's the object overriding comcept here

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj1==obj2);
        // Hash code means unique repesentation via number
        // It is used in hash table Data Structure

        System.out.println(obj1.getClass());
        // getClass(): Used to define about the name pof the class what we defined exactly.


    }
}