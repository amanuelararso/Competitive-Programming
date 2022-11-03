//LEETCODE
//1859. Sorting the Sentence
class SortingTheSentence {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] orderdWords = new String[words.length];
        for(int i = 0; i < words.length; i++)
            orderdWords[i] = words[i];
        int index = 0;
        for(String word: words){
            char[] letters = word.toCharArray();
            StringBuilder sb = new StringBuilder();
            for(Character ch: letters)
                if(Character.isAlphabetic(ch))
                    sb.append(ch);
                else if(Character.isDigit(ch))
                    index=Character.getNumericValue(ch);

            orderdWords[index-1] = sb.toString();
        }

        StringBuilder sb = new StringBuilder();
        for(String word : orderdWords)
            sb.append(word).append(" ");

        return sb.toString().trim();
    }
}
