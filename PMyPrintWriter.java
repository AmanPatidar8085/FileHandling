package FileHandling;

import java.io.FileWriter;
import java.io.PrintWriter;

public class PMyPrintWriter {
public static void main(String[] args) {
	PrintWriter ref=null;
	try {
		ref=new PrintWriter(new FileWriter("C:/FilesFolder/Demo2.txt", true));
		ref.println();
		ref.println("Madushudan");
		ref.println("Pritam");
		ref.flush();
		System.out.println("write completed");
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}

}
