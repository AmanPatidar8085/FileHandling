package FileHandling;

import java.io.FileReader;
import java.io.BufferedReader;
public class BufferReader {
public static void main(String[] args) {
	BufferedReader ref=null;
	try {
		ref=new BufferedReader(new FileReader("C:/FilesFolder/Demo2.txt"));
		String str=ref.readLine();
		while(str!=null) {
			System.out.println(str);
			str=ref.readLine();
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
}
