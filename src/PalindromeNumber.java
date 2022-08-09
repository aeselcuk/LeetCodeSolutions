public class PalindromeNumber {
    

    public static Boolean isPalindrome(int x){
        if(x<0) return false;
        String str = Integer.toString(x);
        
        StringBuffer strBuff = new StringBuffer();
        for(int i=str.length()-1; i >= 0; i--){
            strBuff.append(str.charAt(i));
        }
        long reverse = Long.parseLong(strBuff.toString());
        
        return x==reverse;
    }
    
    public static Boolean isPalindromeNoString(int x){
        if(x<0) return false;
        
        int temp = x;
        long reversed = 0;
        int remainder = 0;
        int size = (int) Math.log10(x);
        int counter = (int) Math.pow(10, size);
        while(temp > 0){
            remainder = temp%10;
            reversed += counter*remainder;
            temp /= 10;
            counter /= 10;
        }
        
    
        return reversed == x;
    }

    public static void main(String[] args) {
        //System.out.println(isPalindrome(1234567899));
        System.out.println(isPalindromeNoString(121));

    } 



}
