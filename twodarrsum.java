package training2;
import java.util.Scanner;
public class twodarrsum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] matrix = new int [n][m];
        int sum = 0;
        for(int i =0;i<n;i++) {
        	for(int j =0;j<m;j++) {
        		matrix[i][j] = sc.nextInt();
        		sum+=matrix[i][j];
        	}
        }
        System.out.println("Sum of Matrix:"+sum);
	}

}
