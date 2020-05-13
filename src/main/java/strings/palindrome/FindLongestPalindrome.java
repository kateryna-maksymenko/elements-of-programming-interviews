package strings.palindrome;

public class FindLongestPalindrome {

    public String getLongestPalindrome(String input) {
        String longest = input.substring(0, 1);

        for (int i = 0; i < input.length(); i++) {
            // if odd
            String palindrom = checkPalindrome(input, i, i );
            if (palindrom.length() > longest.length()) {
                longest = palindrom;
            }
            // if even
            palindrom = checkPalindrome(input, i, i+1 );
            if (palindrom.length() > longest.length()) {
                longest = palindrom;
            }
        }
        return longest;
    }

    private String checkPalindrome(String input, int left, int right) {
        StringBuilder palindrome = new StringBuilder();
        while (left >= 0 && right < input.length() && input.charAt(left) == input.charAt(right)) {
            left--;
            right++;
        }

        return input.substring(left+1, right);
    }

    public static void main(String[] args) {
        String input = "121243223";

       // System.out.println(new FindLongestPalindrome().getLongestPalindrome(input));

        int[] arr = new int[] {2,6,1,7,12,5,11};

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            if (arr[i] > firstMax) {
                secondMax = firstMax;
                firstMax = arr[i];
            } else if(arr[i]> secondMax && firstMax>arr[i]) {
                secondMax = arr[i];
            }
        }
            System.out.println("secomdMax  = "+ secondMax);
        }

}
