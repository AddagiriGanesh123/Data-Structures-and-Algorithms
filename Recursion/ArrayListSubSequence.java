// package RecursionProblems;

import java.util.ArrayList;

public class ArrayListSubSequence {
    public static void main(String[] args) {
        System.out.println(findSubSeq("", "abc"));
    }
    static ArrayList<String> findSubSeq(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = findSubSeq(p, up.substring(1));
        ArrayList<String> right= findSubSeq(p + ch, up.substring(1));
        left.addAll(right);
        return left;
    }
}
