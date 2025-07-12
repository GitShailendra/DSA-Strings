public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "hello";
        int s =0;
        int e = str.length()-1;
        checkPalindromeString(str, s, e);
    }
    public static void checkPalindromeString(String str, int s, int e){
        if(str.length()==1){
            System.out.println("palindrome string");
            return;
        }
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
