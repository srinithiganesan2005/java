package Training_homepractice;
import java.util.*;
public class FirstNonRepeating {
    char repeat(String s) {
    	for(int i=0;i<s.length();i++) {
        	int c=0;
        	for(int j=0;j<s.length();j++) {
        		if(s.charAt(i) == s.charAt(j)) {
        			c++;
        		}
        	}
        	if(c==1) {
        		return s.charAt(i);
        	}
        }
    	return '\0';
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        FirstNonRepeating f = new FirstNonRepeating();
        System.out.print(f.repeat(s));
        
	}

}
