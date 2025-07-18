public class CountOccurences{
    public static void main(String[] args) {
        String str = "banana";
        char ch = 'a';
        countOcc(str,ch);
    }
    public static void countOcc(String str,char ch){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==ch){
                count++;
            }
        }
        System.out.println("count of a is "+ count);
    }
}