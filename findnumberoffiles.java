package FileHandling;

import java.io.File;

public class findnumberoffiles {
	public static void main(String[] args) {
		File ref = new File("C:/FilesFolder");
		boolean flag = ref.exists();
		if (flag == true) {
			String[] arr = ref.list();
          for(int i=0;i<arr.length;i++) {
        	  System.out.println(arr[i]);
          }
		} else {
			System.out.println("file not exits");
		}
	}
}
