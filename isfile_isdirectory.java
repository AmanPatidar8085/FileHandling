
package FileHandling;

import java.io.File;

public class isfile_isdirectory {
	public static void main(String[] args) {
		File ref = new File("C:/FilesFolder");
		boolean flag = ref.exists();
		if (flag == true) {
			String[] arr = ref.list();
			for (int i = 0; i < arr.length; i++) {
				File obj = new File(ref, arr[i]);
				if (obj.isDirectory() == true)
					System.out.println(arr[i]);
			}
		}
	}
}
