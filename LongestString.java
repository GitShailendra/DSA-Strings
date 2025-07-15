public class LongestString {
    public static void main(String[] args) {
        String str = "The quick brown fox";
        int maxLen = 0;
        int currentLen = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                currentLen++;
            } else {
                if (currentLen > maxLen) {
                    maxLen = currentLen;
                }
                currentLen = 0;
            }
        }

        if (currentLen > maxLen) {
            maxLen = currentLen;
        }

        System.out.println("Length of longest word: " + maxLen);
    }
}
