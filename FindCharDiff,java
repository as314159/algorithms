public class FindCharDiff {
    public char findTheDifference(String s, String t) {
        int slen = s.length();
        int tlen = t.length();
        Set<String> tset = new HashSet<String>();
        for (int i = 0; i < slen; i++) {
            tset.add("" + s.charAt(i));
        }
        char diff = '\0';
        boolean diffOnce = false;
        for (int i = 0; i < tlen; i++) {
            char currChar = t.charAt(i);
            if (!tset.contains("" + currChar)) {
                diffOnce = true;
                diff = currChar;
            } else {
                if (!diffOnce) {
                    diff = currChar;
                }
            }
        }
        return diff;
    }
}
