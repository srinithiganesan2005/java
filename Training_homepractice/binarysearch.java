package Training_homepractice;
import java.util.*;
public class binarysearch {
    int search(int[] arr,int t) {
    	    int left =0;
    	    int right = arr.length-1;
    	    for(int i=0;i<arr.length;i++) {
    	    	int mid = left+(right-left)/2;
         if(arr[mid] == t) {
        	 return mid;
         }
         else if(arr[mid]<t) {
        	 left = mid+1;
         }
         else {
        	 right = mid-1;
         }
    }
    	    return -1;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] arr=s.split(" ");
		int[] nums = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			nums[i] = Integer.parseInt(arr[i]);
		}
		int t = sc.nextInt();
		binarysearch b = new binarysearch();
		System.out.print(b.search(nums,t));

	}

}
