package StringBuffers_StringBuildersInCodegnan;
// The key difference between StringBuffer and StringBuilder in Java lies in their thread safety. 
// StringBuilder is more efficient then String Buffer
// StringBuffer is synchronized, meaning it's thread-safe, while StringBuilder is not, 
// making it faster for single-threaded operations. 
// StringBuffer was introduced earlier in Java 1.0, whereas StringBuilder was added in Java 1.5
public class Program2 {
    public static void main(String[] args) {
        
    
    StringBuilder sb = new StringBuilder("Vikramadithya");
    StringBuilder sb2 = new StringBuilder();
    /*
Method            Action Performed
append()	      Used to add text at the end of the existing text.
length()	      The length of a StringBuffer can be found by the length( ) method.
capacity()	      the total allocated capacity can be found by the capacity( ) method.
charAt()	      This method returns the char value in this sequence at the specified index.
delete()	      Deletes a sequence of characters from the invoking object.
deleteCharAt()    Deletes the character at the index specified by the loc.
ensureCapacity()  Ensures capacity is at least equal to the given minimum.
insert()	      Inserts text at the specified index position.
length()	      Returns the length of the string.  
reverse()	      Reverse the characters within a StringBuffer object.
replace()	      Replace one set of characters with another set inside a StringBuffer object.
     */
   
   //  System.out.println(sb+ " is great");
   // System.out.println(sb.append(" is great"));

   // Insert a thing by uing index position
   // System.out.println(sb.insert(11,"King")); // ans: VikramadithKingya is great

   // Replace : used to replace the values from start index to end index with our given value
   System.out.println(sb.replace(1, 06, "Ganesh"));

   // length is used to give the size of the String
   System.out.println(sb.length());

   // delete method : deletes from start index to end index upto we given our consideration
   System.out.println(sb.delete(1, 6));


// CharAt: used to give the specific character of that particular index
System.out.println(sb.charAt(3));

// Substring : used to ggive the part of the string either by start position or also gives the end position

System.out.println(sb.substring(2)); //adithya

System.out.println(sb.capacity());
// DEAFULT VALUE OF STRING BUFFER IS 16 IS USED TO ALLOCATE IN THE MEMORY

System.out.println(sb2.capacity()); // 16 is the answer

System.out.println(sb.isEmpty());

System.out.println(sb.hashCode()*-100); // 115014700 
System.out.println(sb.reverse());

// lastIndexOf: used to give the last occurence of the object variable present in the String
System.out.println(sb.lastIndexOf("a"));

    
    }
}
