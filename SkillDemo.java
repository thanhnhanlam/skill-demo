public class SkillDemo {

    public static String trim(String s) {
        while (s.charAt(0) == ' ') {
            s = s.substring(1);
        }
        while (s.charAt(s.length() - 1) == ' ') {
            s = s.substring(0, s.length() - 1);
        }
        return s;
    }
}
