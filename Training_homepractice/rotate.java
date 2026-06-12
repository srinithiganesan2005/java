package Training_homepractice;
import java.util.*;
public class rotate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] arr = s.split(" ");
		int[] nums = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			nums[i]=Integer.parseInt(arr[i]);
		}
        int r = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=r+1;i<arr.length;i++) {
        	a.add(nums[i]);
        }
        for(int i=0;i<=r;i++) {
        		a.add(nums[i]);

        	
        }
        
        	System.out.print(a);

	}

}
