public class FindCharDiff {
    public char findTheDifference(String s, String t) {
        char[] schars = s.toCharArray();
        Arrays.sort(schars);
        String ssorted = new String(schars);
        char[] tchars = t.toCharArray();
        Arrays.sort(tchars);
        String tsorted = new String(tchars);
        char diff = '\0';
        int tsortedlen = tsorted.length() - 1;
        for (int i = 0; i <= tsortedlen; i++) {
            if (i != tsortedlen) {
                if (tsorted.charAt(i) != ssorted.charAt(i)) {
                    diff = tsorted.charAt(i);
                    break;
                }
            } else {
                diff = tsorted.charAt(tsortedlen);
            }
        }
        return diff;
    }
}
