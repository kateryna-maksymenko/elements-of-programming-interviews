package introduction;

public class SwapClass {
    public static void main(String[] args) {
        String s1 = new String("Red");
        String s2 = new String("Blue");


        swap(s1, s2);
        System.out.println("red: "+s1);
        System.out.println("blue: "+s2);
    }

    private static void swap(String s1, String s2) {
        String temp = s1;
        s1 = s2;
    //    s2 = temp;
    }
}
