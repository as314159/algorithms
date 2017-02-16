public class ReverseString {
    public String reverseString(String s) {
        String emptystr = "";
        if (s == null) {
            return null;
        } else if (s.isEmpty()) {
            return emptystr;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));    
        }
        return sb.toString();
    }
}
