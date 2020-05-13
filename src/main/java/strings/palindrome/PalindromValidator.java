package strings.palindrome;

import java.util.HashMap;
import java.util.Map;

public class PalindromValidator {

    public boolean palindromeCheck(String s) {

        Map<Character, Integer> values = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            if(!values.containsKey(s.charAt(i))) {
                values.put(s.charAt(i), 1);
            } else {
                values.put(s.charAt(i), values.get(s.charAt(i))+1);
            }
        }

        for(Map.Entry<Character, Integer> entry: values.entrySet()) {
            if(entry.getValue()%2>0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "DFGTDFGT";
        System.out.println(new PalindromValidator().palindromeCheck(input));
    }
}
