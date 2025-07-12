public class CountVowels {
    public static void main(String[] args) {
        String str = "hEllo";
        System.out.println(countVowels(str));
    }
    public static int countVowels(String str){
        str = str.toLowerCase();
        int vowels = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='e'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                vowels++;
            }
        }
        return vowels;
    }
}
