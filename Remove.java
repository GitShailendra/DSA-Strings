public class Remove{
    public static void main(String[] args) {
        String str = "   hello   ";
        removeSp(str);
    }

    public static void removeSp(String  str){
        StringBuilder newStr = new StringBuilder(str);

        while(true){
            int index = newStr.indexOf(" ");
            if(index == -1){
                break;
            }
            newStr.deleteCharAt(index);
        }
        System.out.println(newStr.toString());
    }
}