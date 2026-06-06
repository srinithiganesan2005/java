package training2;
import java.util.Scanner;
public class secondlargestArr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
        int lar =arr[0];
        for(int i =1;i<n;i++) {
        	if(arr[i]>lar) {
        		lar = arr[i];
        	}
        }
        int seclar=arr[0];
        for(int i = 1;i<n;i++) {
        	if(arr[i]>seclar && arr[i]<lar) {
        		seclar = arr[i];
        	}
        }
        System.out.println("Largest of array:"+lar);
        System.out.println("Second Largest of array:"+seclar);
	}

}

//another

