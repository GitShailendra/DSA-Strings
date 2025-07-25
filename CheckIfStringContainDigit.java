public class CheckIfStringContainDigit {
    public static void main(String[] args) {
        String str = "fdsfs";
        boolean containsDigit = checkIfContainsDigit(str);
        if (containsDigit) {
            System.out.println("The string contains at least one digit.");
        } else {
            System.out.println("The string does not contain any digits.");
        }
    }
    public static boolean checkIfContainsDigit(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
