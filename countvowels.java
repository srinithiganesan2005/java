package training2;

public class countvowels {

	public static void main(String[] args) {
		String s = "Education";
		String n =s.toLowerCase();
		int count =0;
		for(int i = 0;i<s.length();i++) {
			char c =n.charAt(i);
			  if (c == 'a' || c == 'e' || c == 'i' || 
		                c == 'o' || c == 'u') {
		                count++;}
		}
      System.out.println(count);
	}

}
