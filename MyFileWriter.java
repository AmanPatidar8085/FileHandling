package FileHandling;

import java.io.FileWriter;

public class MyFileWriter {
	
public static void main(String[] args) {
	FileWriter ref=null;
	
	try {
		ref=new FileWriter("C:/FilesFolder/Demo1.txt",true);
		ref.write("java");
		ref.write("\n");
		ref.write("python");
		ref.write("\n");
		ref.write("spring");
		ref.write("\n");
		ref.write("sql");
		
		ref.flush();
		System.out.println("write completed");
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		try {
			ref.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
}
