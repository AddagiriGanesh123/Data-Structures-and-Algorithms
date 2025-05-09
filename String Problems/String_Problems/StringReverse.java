package StringProblems;
public class StringReverse {
    public static void main(String[] args) {
        String s = "   Addagiri Ganesh     ";
        System.out.println(reverseString(s));
    }
    static String reverseString(String s){
        StringBuilder sb = new StringBuilder();
         String[] words = s.split(" +"); // here space with + could be any no. of spaces 
         // Then reverse array
         for (int i = words.length-1; i >= 0; i--) {
            sb.append(words[i]);
            sb.append(" ");
         }
        return sb.toString();
    }
}
