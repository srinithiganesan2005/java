package training2;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
public class Readfile {

	public static void main(String[] args)throws IOException {
		//char by char
		FileReader fr = new FileReader(
	            "C:\\Users\\Admin\\eclipse-workspace\\Training\\src\\training2\\Student.txt");

	        int ch;

	        while ((ch = fr.read()) != -1) {
	            System.out.print((char) ch);
	        }

	        fr.close();
	        //line by line read
	        BufferedReader br = new BufferedReader(
	                new FileReader(
	                    "C:\\Users\\Admin\\eclipse-workspace\\Training\\src\\training2\\Student.txt"));

	            String line;

	            while ((line = br.readLine()) != null) {
	                System.out.println(line);
	            }
	            // word by word
	            String line1;

	            while ((line1 = br.readLine()) != null) {

	                String[] words = line1.split(" ");

	                for (String word : words) {
	                    System.out.println(word);
	                }
	            }

	            br.close();
	            
	            

	}

}
