public class KeyboardRow {
    public String[] findWords(String[] words) {
        if (words == null ) {
            return null;
        } else if (words.length == 0) {
            return words;
        }
        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";
        List<String> sameRowWords = new ArrayList<String>();
        for (String word : words) {
            if (!word.isEmpty()) {
                String wordtolowercase = word.toLowerCase();
                char[] chars = wordtolowercase.toCharArray();
                if (firstRow.contains("" + chars[0])) {
                    sameRowWords = findWords(chars, firstRow, word, sameRowWords);
                } else if (secondRow.contains("" + chars[0])) {
                    sameRowWords = findWords(chars, secondRow, word, sameRowWords);
                } else if (thirdRow.contains("" + chars[0])) {
                    sameRowWords = findWords(chars, thirdRow, word, sameRowWords);
                }
            } else {
                sameRowWords.add("");
            }
        }
        String[] sameRowWordsToArray = new String[sameRowWords.size()];
        sameRowWordsToArray = sameRowWords.toArray(sameRowWordsarray);
        return sameRowWordsToArray;
    }
    
    public static List<String> findWords(char[] chars, String row, String word, List<String> sameRowWords) {
        for (int i = 1; i < chars.length; i++) {
            if (!row.contains("" + chars[i])) {
                return sameRowWords;
            }
        }
        sameRowWords.add(word);
        return sameRowWords;
    }
}
