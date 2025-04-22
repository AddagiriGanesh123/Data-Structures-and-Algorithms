import java.util.Arrays;;
public class LetterSeries {
    public static void main(String[] args) {
        // String series = "";
        // for (int i = 0; i < 26; i++) {
        //     char ch = (char) ('A' + i);
        //     series += ch;
        // }
        // System.out.println(series);

        // Note: For this code, total time and space complexities increase we need to reduce it.
        String name = "Ganesh Addagiri";
        System.out.println(Arrays.toString(name.toCharArray()));
        // O/P : [G, a, n, e, s, h,  , A, d, d, a, g, i, r, i]

        System.out.println(name.length()); // 15
        System.out.println(name.substring(0,5)); // Ganes

        StringBuilder builder = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();
        StringBuilder builder3 = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        for (int i = 0; i < 26; i++) {
            char ch = (char)('A' + i);
            builder2.append(ch);
        }

        for (int i = 0; i < 26; i++) {
            char ch = (char)('z' - i);
            // To reverse the digits from z to a 
            builder3.append(ch);
        }
        // System.out.println(builder);
        // System.out.println((int)'A'); // value is 65
        // System.out.println((int) 'a'); // value is 97
        // // Because String Builder is immutable
        // System.out.println(builder2);

        // System.out.println(builder3);
        // System.out.println(builder3.reverse());
    }
}
