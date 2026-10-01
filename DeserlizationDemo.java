package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserlizationDemo {
public static void main(String[] args)throws IOException ,ClassNotFoundException {
	FileInputStream fis=new FileInputStream("C:/FilesFolder/Demo4.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
	contact con=(contact)ois.readObject();
	System.out.println(con.name);
	System.out.println(con.number);
	System.out.println("deselization is completed");
}
}
