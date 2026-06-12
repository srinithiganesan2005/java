package Training_homepractice;
import java.util.*;
public class frequencyOfElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int c =1;
        for(int i=0;i<s.length()-1;i++) {
        	if(s.charAt(i) == s.charAt(i+1)) {
        		c++;
        	}
        	else {
        		System.out.print(s.charAt(i)+""+c);
        		c=1;
        	}
        }
        System.out.print(s.charAt(s.length()-1)+""+c);
	}

}
