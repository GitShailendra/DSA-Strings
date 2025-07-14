public class ConvertUpperCase {
    public static void main(String[] args) {
        String str = "hello";
        converIntoUpperCase(str);
    }
    public static void converIntoUpperCase(String str){
        str = str.toUpperCase();
        System.out.println(str);
    }
}
