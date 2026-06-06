package training2;

public class stringtry {

	public static void main(String[] args) {
		String s = "java";
		s.concat("program");
		System.out.println(s);
		
		String s1 = s.concat("program");
		System.out.println(s1);
		
		String a = new String("Java");
		String b = new String("Java");
		System.out.println(a==b);
		System.out.println(a.equals(b));
		String c = "Java";
		String d = "Java";
		System.out.println(a==b);
	}

}
