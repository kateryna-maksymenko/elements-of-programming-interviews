package sorting;

import org.graalvm.util.CollectionsUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntersectionOfTwoSortedArrays {

    public List<Integer> getIntersactionOfArrays(int[] arr1, int[] arr2) {
        int[] result = new int[]{};
List<Integer> res = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<arr1.length && j<arr2.length) {
            if(arr1[i]==arr2[j]&&(i==0||arr1[i]!=arr1[i-1])&& (j==0||arr2[j]!=arr2[j-1])) {
                res.add(arr1[i]);
                i++;
                j++;
            } else if(arr1[i]<arr2[j]){
                i++;
            } else if (arr2[j]<arr1[i]){
                j++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr1=new int[] {1,2,3,4,5,5,6,7,10};
        int[] arr2 = new int[] {4,6,10};

        System.out.println("result:"+new IntersectionOfTwoSortedArrays().getIntersactionOfArrays(arr1,arr2));
    }
}
