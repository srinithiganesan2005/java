package training2;
import java.io.FileWriter;
import java.io.IOException;
public class writetofile {

	public static void main(String[] args) throws IOException{
		FileWriter fw = new FileWriter("C:\\Users\\Admin\\eclipse-workspace\\Training\\src\\training2\\Student.txt",true);
		fw.write("Ramnad\n");
        fw.close();
	}

}
