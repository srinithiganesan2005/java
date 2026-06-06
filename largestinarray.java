package training2;
import java.util.Scanner;
public class largestinarray {

	public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          
          int[] arr= {100,130,150,200,80,95,66};
          int n = arr.length;
          int lar = arr[0];
          for(int i = 1;i<n;i++) {
        	  if(arr[i]>lar) {
        		  lar = arr[i];
        	  }
          }
          System.out.println("The largest element in array:"+lar);

	}

}
