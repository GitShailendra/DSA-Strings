public class RemoveDupli{
    public static void main(String[] args) {
        String str = "Hello";
        remDup(str);
    }
    public static void remDup(String str){
        str = str.toLowerCase();
        StringBuilder newStr = new StringBuilder(str);
        for(int i=0; i<str.length()-1; i++){
            for(int j=i+1; j<str.length(); j++){
                if(str.charAt(i)==str.charAt(j)){
                    newStr = newStr.deleteCharAt(j);
                }
            }
        }
        System.out.println("new string " + newStr);
    }
}