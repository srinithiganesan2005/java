package Training_homepractice;
import java.util.*;
public class AnagramWithoutBuildin {
    boolean anagram(String s1,String s2) {
        if(s1.length()!=s2.length()) {
        	return false;
        }
        else {
        char[] arr = new char[256];
        for(int i=0;i<s1.length();i++) {
        	arr[s1.charAt(i)]++;
        	arr[s2.charAt(i)]--;
        }
        for(int i=0;i<256;i++) {
        	if(arr[i] != 0) {
        		return false;
        	}
        }
     return true;
        }
    }
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s1 = sc.nextLine();
	String s2 = sc.nextLine();
    AnagramWithoutBuildin a = new AnagramWithoutBuildin();
    System.out.print(a.anagram(s1,s2));
	}

}
