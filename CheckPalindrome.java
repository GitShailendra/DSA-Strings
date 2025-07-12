public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "Madam";
        int s =0;
        int e = str.length()-1;
        checkPalindromeString(str, s, e);
    }
    public static void checkPalindromeString(String str, int s, int e){
        str = str.toLowerCase();
        boolean  b = false;
        while(s<e){
            if(str.charAt(s)!=str.charAt(e)){
                System.out.println("not a palindrome");
                b=true;
                break;
            }
            s++;
            e--;
        }
        if(b==false){
            System.out.println("Palindrome String");
        }
    }
}
