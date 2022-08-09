import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    
    private static Boolean validParantheses(String s){
        Map<Character, Character> paranthesesMap = new HashMap<>();
        paranthesesMap.put(')', '(');
        paranthesesMap.put(']', '[');
        paranthesesMap.put('}', '{');


        Stack<Character> stck = new Stack<>();
        stck.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if(!stck.empty() && stck.peek().equals(paranthesesMap.get(s.charAt(i)))){
                stck.pop();
                continue;
            }
            stck.push(s.charAt(i));
        }

        if(stck.isEmpty()) return true;
        return false;
    }
    
    public static void main(String[] args) {
        System.out.println(validParantheses("({[}]})"));
    }
}
