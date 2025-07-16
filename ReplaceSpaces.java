// public class ReplaceSpaces {
//     public static void main(String[] args) {
//         String str = "Hello good morning";
//         replceDash(str);
//     }
//     public static void replceDash(String str){
//         StringBuilder strMod = new StringBuilder(str);
//         for(int i=0; i<strMod.length(); i++){
//             if(strMod.charAt(i)==' '){
//                 strMod.setCharAt(i,'-');
//             }
//         }
        
//         System.out.println(strMod);
//     }
// }
public class ReplaceSpaces {
    public static void main(String[] args) {
        String str = "Hello good morning";
        System.out.println(replceDash(str));
    }

    public static String replceDash(String str){
        StringBuilder strMod = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==' '){
                strMod.append('-');
            } else {
                strMod.append(str.charAt(i));
            }
        }

        return strMod.toString();
    }
}