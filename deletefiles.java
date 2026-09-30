package FileHandling;

import java.io.File;

public class deletefiles {
	public static void main(String[] args) {
		File ref = new File("C:/FilesFolder", "Demo3.txt");
		boolean flag = ref.exists();
		if (flag == true) {
			ref.delete();
			System.out.println("file is deleted succesfully");
		} else {
			System.out.println("file is not exists");
		}
	}
}
