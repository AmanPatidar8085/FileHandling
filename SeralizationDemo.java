package FileHandling;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class contact implements Serializable{
	String name;
	transient long number;
	public contact(String name, long number) {
		super();
		this.name = name;
		this.number = number;
	}
	
	
}
public class SeralizationDemo {
public static void main(String[] args) throws IOException{
	contact con=new contact("Aman", 8085378534L);
	
	FileOutputStream fos=new FileOutputStream("C:/FilesFolder/Demo4.txt", true);
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(con);
	System.out.println("serlization is completed");
	
}
}
