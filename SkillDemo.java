public class SkillDemo {
    
    public static String trim(String s) {
        if (s.charAt(0) == ' ') {
            s = s.substring(1);
        }
        if (s.charAt(s.length() - 1) == ' ') {
            s = s.substring(0, s.length() - 1);
        }
        return s;
    }
}
