package training2;
import java.util.Scanner;
public class countWordstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] res = s.split(" ");
		System.out.println("Count:"+res.length);

	}

}
