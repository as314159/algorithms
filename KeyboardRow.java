public class KeyboardRow {
    public String[] findWords(String[] words) {
        if (words == null ) {
            return null;
        } else if (words.length == 0) {
            return words;
        }
        String firstrow = "qwertyuiop";
        String secondrow = "asdfghjkl";
        String thirdrow = "zxcvbnm";
        List<String> samerowwords = new ArrayList<String>();
        for (String word : words) {
            if (!word.isEmpty()) {
                String wordtolowercase = word.toLowerCase();
                char[] chars = wordtolowercase.toCharArray();
                if (firstrow.contains("" + chars[0])) {
                    samerowwords = findWords(chars, firstrow, word, samerowwords);
                } else if (secondrow.contains("" + chars[0])) {
                    samerowwords = findWords(chars, secondrow, word, samerowwords);
                } else if (thirdrow.contains("" + chars[0])) {
                    samerowwords = findWords(chars, thirdrow, word, samerowwords);
                }
            } else {
                samerowwords.add("");
            }
        }
        String[] samerowwordsarray = new String[samerowwords.size()];
        samerowwordsarray = samerowwords.toArray(samerowwordsarray);
        return samerowwordsarray;
    }
    
    public static List<String> findWords(char[] chars, String row, String word, List<String> samerowwords) {
        for (int i = 1; i < chars.length; i++) {
            if (!row.contains("" + chars[i])) {
                return samerowwords;
            }
        }
        samerowwords.add(word);
        return samerowwords;
    }
}
