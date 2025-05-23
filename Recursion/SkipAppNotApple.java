public class SkipAppNotApple {
    public static void main(String[] args) {
        System.out.println(skipAppNotApple("bcapplea")); // bcapplea
        System.out.println(skipAppNotApple("bcapp")); // bc
    }
    static String skipAppNotApple(String up) {
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("app") && !up.startsWith("apple")){
            return up.substring(3);
        }else{
            up.substring(1);
        }
        
        return up.charAt(0) + skipAppNotApple(up.substring(1));
    }
    
}
