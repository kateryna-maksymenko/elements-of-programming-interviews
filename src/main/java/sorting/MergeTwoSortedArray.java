package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedArray {

    public List<Integer> mergeArrays(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) <= list2.get(j)) {
                result.add(list1.get(i));
                i++;
            } else  {
                result.add(list2.get(j));
                j++;
            }
        }
        while( i<list1.size())  {
            result.add(list1.get(i));
            i++;
        }

        while( j<list2.size())  {
            result.add(list2.get(j));
            j++;
        }


        return result;
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(new Integer[]{1, 2, 3, 4, 10});
        List<Integer> list2 = Arrays.asList(new Integer[]{1, 8, 9,25});

        System.out.println("Result:" + new MergeTwoSortedArray().mergeArrays(list1, list2));
    }
}
