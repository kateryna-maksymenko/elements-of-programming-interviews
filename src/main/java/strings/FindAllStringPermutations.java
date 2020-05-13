package strings;

import java.util.HashSet;
import java.util.Set;

public class FindAllStringPermutations {

    public Set<String> findAllStringPermutations(String s) {
        Set<String> result = new HashSet<>();

        if(s.length()==0) {
            result.add("");
            return result;
        }

        char initialLetter = s.charAt(0);
        String remainingLetters = s.substring(1);
        Set<String> words = findAllStringPermutations(remainingLetters);

        for(String word:words) {
            for(int i=0; i<=word.length(); i++) {
                result.add(insertChar(word, i, initialLetter));
            }
        }
        return result;
    }

    private String insertChar(String word, int i, char initialLetter) {
        String begin = word.substring(0,i);
        String end = word.substring(i);
        return begin+initialLetter+end;
    }

    public static void main(String[] args) {
        String input = "abcd";
        System.out.println(new FindAllStringPermutations().findAllStringPermutations(input));
    }

}
