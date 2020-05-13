import java.util.*;

public class LongestContainedRange {

    public int findLongestContainedRange(Integer[] array) {
        Set<Integer> unprocessedValues = new HashSet<>(Arrays.asList(array));
        int maxInterval = 1;
        List<Integer> maxValues = new ArrayList<>();
        while (!unprocessedValues.isEmpty()) {
            maxInterval = 1;
            Integer valueToProcess = unprocessedValues.iterator().next();
            unprocessedValues.remove(valueToProcess);

            Integer lowerBound = valueToProcess - 1;
            while (unprocessedValues.contains(lowerBound)) {
                unprocessedValues.remove(valueToProcess);
                maxInterval += 1;
                --lowerBound;
            }

            Integer upperBound = valueToProcess + 1;
            while (unprocessedValues.contains(upperBound)) {
                unprocessedValues.remove(valueToProcess);
                maxInterval += 1;
                ++upperBound;
            }
            maxValues.add(maxInterval);
        }
        int max = maxValues.get(0);
        for (Integer value : maxValues) {
            if (value > max) {
                max = value;
            }
        }
        maxInterval = max;

        return maxInterval;
    }

    public static void main(String[] args) {
        Integer[] input = new Integer[]{10, 7, -2, -1, 0, 3, 5, 11, 6, 100,4};
        System.out.println("Result: " + new LongestContainedRange().findLongestContainedRange(input));
    }
}


