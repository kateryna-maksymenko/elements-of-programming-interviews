package sorting;

import java.util.*;

public class RemoveFirstnameDuplicate {

    public Map<String, String> removeFirstnameDuplicate(List<List<String>> input) {
        Map<String, String> names = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
     //  Iterator it =  input.iterator();

        for(List<String> values: input) {
            if(!names.containsKey(values.get(0))) {
                names.put(values.get(0), values.get(1));
            }
        }

        return names;
    }

    public static void main(String[] args) {
        List<List<String>> input = new ArrayList<>(); //new ArrayList<>(Arrays.asList(new String[]{"Ian","Bohdan"})
        input.add(Arrays.asList(new String[]{"Ian","Bohdan"}));
        input.add(Arrays.asList(new String[]{"David","Gower"}));
        input.add(Arrays.asList(new String[]{"Ian","Bell"}));
        input.add(Arrays.asList(new String[]{"Ian","Chappel"}));
        input.add(Arrays.asList(new String[]{"Ian","Bohdan"}));

        Map<String, String> result = new RemoveFirstnameDuplicate().removeFirstnameDuplicate(input);
        System.out.println("Result : "+result);

    }
}
