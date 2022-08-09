import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    private static int romanToInteger(String romanNumeral){
        
        Map<String, Integer> romanMap = new HashMap<>();
        
        romanMap.put("I", 1);
        romanMap.put("V", 5);
        romanMap.put("X", 10);
        romanMap.put("L", 50);
        romanMap.put("C", 100);
        romanMap.put("D", 500);
        romanMap.put("M", 1000);

        int result = 0;
        for(int i = 0; i < romanNumeral.length(); i++ ){
            if( i < romanNumeral.length()-1 
            && ((String.valueOf(romanNumeral.charAt(i)).equals("I") &&
                (String.valueOf(romanNumeral.charAt(i+1)).equals("V") || String.valueOf(romanNumeral.charAt(i+1)).equals("X")))
                || (String.valueOf(romanNumeral.charAt(i)).equals("X") &&
                (String.valueOf(romanNumeral.charAt(i+1)).equals("L") || String.valueOf(romanNumeral.charAt(i+1)).equals("C")))
                || (String.valueOf(romanNumeral.charAt(i)).equals("C") &&
                (String.valueOf(romanNumeral.charAt(i+1)).equals("D") || String.valueOf(romanNumeral.charAt(i+1)).equals("M"))))
                ){
                    result += romanMap.get(String.valueOf(romanNumeral.charAt(i+1))) 
                                - romanMap.get(String.valueOf(romanNumeral.charAt(i)));
                    i++;            
            }else{
                result+=romanMap.get(String.valueOf(romanNumeral.charAt(i)));
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        System.out.println(romanToInteger("MDLXX"));
    }
}
