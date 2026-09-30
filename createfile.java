package FileHandling;

import java.io.File;
import java.io.IOException;

public class createfile {
	public static void main(String[] args) {
		File ref = new File("C:/FilesFolder", "Demo3.txt");
		boolean flag = ref.exists();
		if (flag == false) {
			try {
				ref.createNewFile();
				System.out.println("file is create");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("file already exits");
		}
	}
}
