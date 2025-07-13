public class CountConsonents {
    public static void main(String[] args) {
        String str = "shpaeiouqrst657eio";
        countConsonents(str);
    }
    public static void countConsonents(String str){
        str = str.toLowerCase();
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)>='a' &&str.charAt(i)<='z' && str.charAt(i)!='a'&& str.charAt(i)!='e'&&str.charAt(i)!='i'&&str.charAt(i)!='o'&&str.charAt(i)!='u'){
                count++;
            }
        }
        System.out.println("Count of consonent is is "+ count);
    }
}
