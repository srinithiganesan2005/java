package Training_homepractice;
import java.util.Scanner;
import java.util.*;
public class removeduplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] arr = s.split(" ");
		int[] nums = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			nums[i]=Integer.parseInt(arr[i]);
		}
		TreeSet<Integer> ts = new TreeSet<>();
		for(int i = 0;i<nums.length;i++) {
			ts.add(nums[i]);
		}
		System.out.print(ts);

	}

}
