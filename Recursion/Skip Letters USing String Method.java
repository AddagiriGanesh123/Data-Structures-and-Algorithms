
// Input: baccabdah
// Output: bccbdh

// Approach: Removes a's from the string and get the desired result recursively
public class Skip {
    public static void main(String[] args) {
        skip("", "baccabdah");
        System.out.println(skip("bcadahafhdagh"));
       System.out.println(skipApple("bacapplecadh"));
    }
    // Here we are using a recursive approach to solve the problem
    // So p means Processed String and up means Unprcessed String
    // here we are checking the every alphabet with the particular letter called a 
    // if a is there then skips that and if not then add that in the result string
    // Otherwise add in the result
    // Approaach:
    // 1) pass the answer String variable in the argument
    // 2) then creeate the varibale answer in the function body
    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        if(ch == 'a'){
            skip(p, up.substring(1));
        }
        else{
            skip(p + ch, up.substring(1));
        }
    }

    static String skip(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            return skip(up.substring(1));
        }
        else{
            return ch+skip(up.substring(1));
        }
    }
    static String skipApple(String p){
        if(p.isEmpty()){
            return "";
        }

        if(p.startsWith("apple")){
            return skipApple(p.substring(5));
        }else{
            return p.charAt(0) + skipApple(p.substring(1));
        }
    }
}
