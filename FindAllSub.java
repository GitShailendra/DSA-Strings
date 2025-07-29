public class FindAllSub {
    public static void main(String[] args) {
        String str = "abc";
        findAllSubstrings(str);
    }
    public static void findAllSubstrings(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }
    // hello world code pushed 
}
