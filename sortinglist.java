package training2;
import java.util.Arrays;
import java.util.Collections;
public class sortinglist {

	public static void main(String[] args) {
		int[] arr1 = {5,4,3,2,1};
		Arrays.sort(arr1);
		for(int i :arr1) {
			System.out.println(i);
		}
        Integer[] arr2 = {9,10,88,4,1,77};
        Arrays.sort(arr2,Collections.reverseOrder());
        for(int i :arr2) {
			System.out.println(i);
		}
	}

}
