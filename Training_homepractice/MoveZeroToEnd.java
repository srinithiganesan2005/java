package Training_homepractice;
import java.util.*;
public class MoveZeroToEnd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] arr = s.split(" ");
		int[] nums = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			nums[i]=Integer.parseInt(arr[i]);
		}
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
        	if(nums[i] !=0) {
        		result.add(nums[i]);
        	}
        }
        while(result.size()<nums.length) {
        	result.add(0);
        }
        System.out.print(result);
	}

}
