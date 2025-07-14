public class ConvertLowerCase {
    public static void main(String[] args) {
        String str = "HeLLO";
        converIntoLowerCase(str);
    }
    public static void converIntoLowerCase(String str){
        str=str.toLowerCase();
        System.out.println(str);
    }
}
