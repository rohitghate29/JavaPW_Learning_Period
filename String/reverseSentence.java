


public class reverseSentence {
    public static void main(String[] args) {
        String s = "Think Twice";
        String revSentence = "";

        String words [] = s.split(" ");
        for (int i=0; i<words.length; i++) {
            String Word = words[i];
            String revWord = "";

            for(int j=Word.length()-1; j>=0; j--) {
                revWord = revWord + "" + Word.charAt(j);
            }
            revSentence = revSentence + revWord + " ";
        }
        System.out.println(revSentence);
    }
}
