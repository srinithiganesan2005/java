package training2;
import java.io.File;
public class deletefile {

	public static void main(String[] args) {
		
		//dont run it,if u run means then ur student file is deleted
		
		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\Training\\src\\training2\\Student.txt");

        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }

	}

}
