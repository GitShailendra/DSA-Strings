public class RemoveAlphaBetNum {
    public static void main(String[] args) {
        String str = "sAdsa@#@trASD@123";
        remAlBeNum(str);
    }
    public static void remAlBeNum(String str){
        StringBuilder newModStr = new StringBuilder();
        
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='A'&& str.charAt(i)<='Z'){
                newModStr.append(str.charAt(i));
            }
        }
        System.out.println(newModStr);
    }
}
