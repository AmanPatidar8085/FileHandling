package FileHandling;

import java.io.File;

public class countlengthofcharacter {
public static void main(String[] args) {
	File ref=new File("C:/FilesFolder", "Demo2.txt");
	boolean flag=ref.exists();
	if(flag==true) {
		System.out.println(ref.length());
		System.out.println(ref.getAbsolutePath());
		
	}
	else {
		System.out.println("file not exits");
	}
}
}
