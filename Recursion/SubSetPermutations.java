package RecursionProblems;

import java.util.ArrayList;

public class SubSetPermutations {
    public static void main(String[] args) {
        permutations("", "abc");
        ArrayList<String> result = permutationsArray("", "abc");
        System.out.println(result);
    }
    static void permutations(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            permutations(first+ch+second, up.substring(1));
        }
    }
    public static ArrayList<String> permutationsArray(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            ans.addAll(permutationsArray(first+ch+second, up.substring(1)));
        }
         return ans;
    }
}
