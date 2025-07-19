public class CountWords {
    public static void main(String[] args) {
        String str = " this is a  is hello my name  word";
        countWords(str);
    }

    public static void countWords(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) { // check if character is a letter
                count++;
            }
        }
        System.out.println("Count of words in the string: " + count);
    }
}