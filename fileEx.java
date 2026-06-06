package training2;
import java.io.File;
import java.io.IOException;
public class fileEx {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\Training\\src\\training2\\Student.txt");
        if(f.createNewFile()) {
        	System.out.println("file created successfully");
        	
        }
        else {
        	System.out.println("problem in creating file");
        	System.out.println(f.exists());
        	System.out.println(f.getName());
        	System.out.println(f.getAbsolutePath());
        }
	}

}
