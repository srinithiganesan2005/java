package Training_homepractice;
import java.util.*;
public class FindDuplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s=s.toLowerCase();
        HashSet<Character> h = new HashSet<>();
        for(int i=0;i<s.length();i++) {
        	int c= 0;
        	for(int j=0;j<s.length();j++) {
        		if(s.charAt(i) == s.charAt(j)) {
        			c++;
        		}
        	}
        	if(c>1) {
        	h.add(s.charAt(i));
        	}
        }
        System.out.println(h);
        for(char i:h) {
        	System.out.print(i+" ");
        }
        
	}

}
