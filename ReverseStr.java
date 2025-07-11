public class ReverseStr{
    public static void main(String[] args) {
        String str = "hello";
        revStr(str);
    }
    public static void revStr (String str){
        for(int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
    }
}