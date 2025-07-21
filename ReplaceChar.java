public class ReplaceChar {
    public static void main(String[] args) {
        String str = "Hello";
        char ch = 'X';
        char rep = 'l';
        replace(str, ch, rep);
    }
    public static void replace(String str, char ch, char rep){
        char arr[] = str.toCharArray();
        
        for(int i=0; i<arr.length; i++){
            System.out.println(ch);
            if (arr[i]==rep) {
                arr[i] = ch;
                System.out.print(arr[i]);
                
            }
        }
        String updatedString = new String(arr);
        System.out.println(updatedString);
    }
}
