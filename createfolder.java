package FileHandling;

import java.io.File;

public class createfolder {
	public static void main(String[] args) {
		File ref = new File("C:/FilesFolder");
		boolean flag = ref.exists();
		if (flag == false) {
			ref.mkdir();
			System.out.println("Folder created");
		} else {
			System.out.println("folder already exists");
		}
	}
}
