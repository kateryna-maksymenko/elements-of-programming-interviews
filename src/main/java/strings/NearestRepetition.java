package strings;

import java.util.HashMap;
import java.util.Map;

public class NearestRepetition {

    public String findNearestRepetition(String s) {
        String[] words = s.split(",");
        int distance = Integer.MAX_VALUE;
        String word = "";
        for(int i=0; i<words.length; i++) {
            for(int j=i+1; j<words.length; j++) {
                if(words[i].equals(words[j])) {
                    if(j-i<distance) {
                        distance = j-i;
                        word=words[i];
                    }
                }
            }
        }

        return word+" "+ distance;
    }

    public String findNearestRepetitionImproved(String s) {
        String[] words = s.split(",");
        int distance = Integer.MAX_VALUE;
        String word = "";

        Map<String, Integer> wordAndIndex = new HashMap<>();
        for(int i=0; i<words.length; i++) {
            if(!wordAndIndex.containsKey(words[i])) {
                wordAndIndex.put(words[i], i);
            } else {
                int difference = i-wordAndIndex.get(words[i]);
                if(difference<distance) {
                    distance = difference;
                    word = words[i];
                }
                wordAndIndex.put(words[i], i);
            }
        }

        return word+" "+ distance;
    }


    public static void main(String[] args) {
        String input = "All,work,and,no,play,work,makes,for,no,work,fun,and,no,results";
        System.out.println("Result: "+new NearestRepetition().findNearestRepetitionImproved(input));
    }
}
