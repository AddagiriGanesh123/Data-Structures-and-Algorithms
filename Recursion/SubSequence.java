package RecursionProblems;

public class SubSequence {
    public static void main(String[] args) {
        subSequence("", "abc");
    }
    static void subSequence(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        // Here need to consider two cases for generating subsequence
        // 1. ch is included in subsequence
        // 2. ch is not included in subsequence
        // For generating the sequence of terms we need to call the function recursively
        subSequence(p, up.substring(1)); // for not including ch
        subSequence(p + ch, up.substring(1));
    }
}

// Output:-
// c
// b
// bc
// a
// ac
// ab
// abc
