public class CheckStringAn {
    public static void main(String[] args) {
        String str = "hello";
        String str2 = "olleh";
        System.out.println(checkAna(str, str2));
    }
    public static boolean checkAna(String str , String str2){
        if(str.length()!=str2.length()){
            return false;
        }
        for(int i=0; i<str.length(); i++){
            int currCount = 0;
            for(int j=0; j<str2.length(); j++){
                if(str.charAt(i)==str2.charAt(j)){
                    currCount++;
                }
            }
            if(currCount<=0){
                return false;
            }
        }
        return true;
    }
}
