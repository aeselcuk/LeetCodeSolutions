public class StrStr {
    
    private static int strStr(String hayjack, String needle){

        if(needle.isEmpty()) return 0;

        for (int i = 0; i < hayjack.length()-needle.length()+1; i++) {
            if(needle.equals(hayjack.substring(i, i+needle.length()))){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
    }
}
