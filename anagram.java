package training2;
import java.util.Scanner;
import java.util.*;
public class anagram {
	public boolean ana(String s1,String s2) {
    char[] c1 = s1.toCharArray();
    char[] c2 = s2.toCharArray();
    Arrays.sort(c1);
    Arrays.sort(c2);
    if(c1.length!=c2.length) {
    	   return false;
    }
    for(int i=0;i<c1.length;i++) {
    		if(c1[i]!=c2[i]) {
    			return false;
    		}
    
    }
    	return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
        anagram a = new anagram();
        System.out.println(a.ana(s1, s2));
	}

}
