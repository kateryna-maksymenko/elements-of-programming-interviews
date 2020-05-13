package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringDecomposition {

    public List<Integer> executeStringDecomposition(String sentence, String[] words) {
        int length = words[0].length();
        List<Integer> result = new ArrayList<>();

      //  for (int i = 0; i < words.length; i++) {
            for(int j=0; j<sentence.length()-length; j++) {
                String currWords = sentence.substring(j, length+j);
                System.out.println("words:"+currWords);
                if (Arrays.asList(words).contains(currWords)) {
                    result.add(j);
                }
            }
       // }
        return result;
    }

    public static void main(String[] args) {
        String[] words = new String[] {"apl", "ana", "can"};

        System.out.println(new StringDecomposition().executeStringDecomposition("gtaprtdaanacanapl", words));
    }
}
