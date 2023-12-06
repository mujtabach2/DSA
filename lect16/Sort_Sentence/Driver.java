package Sort_Sentence;

public class Driver {
    public static String sortSentence(String sentence)
    {
        String[] words = sentence.split(" ");
        String[] sortedWords = new String[words.length];
        
        for(String word: words)
        {
            int i = word.length() - 1;
            int index = word.charAt(i) - '0';
            sortedWords[index-1] = word.substring(0, i);
        }

        return String.join(" ", sortedWords);
    }
    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }
}
