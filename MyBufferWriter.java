package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class MyBufferWriter {
	public static void main(String[] args) {
		BufferedWriter ref = null;
		try {
			ref = new BufferedWriter(new FileWriter("C:/FilesFolder/Demo2.txt", true));
			ref.newLine();
			ref.write("Ajay Patidar");
			ref.newLine();
			ref.write("Hariom Patidar");
			ref.newLine();
			ref.write("Akshat Patidar");
			ref.newLine();
			ref.flush();
			System.out.print("write completed");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ref.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
