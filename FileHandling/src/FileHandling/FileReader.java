package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {
public static void main(String[] args) throws IOException {
	File file = new File("C:\\Users\\Admin\\Desktop\\abc.txt");
	FileInputStream fis  = new FileInputStream(file);
//`	java.io.FileReader fileReader = new java.io.FileReader(new );
//	char[] charArray = new char[(int) file.length()];
//	while(fileReader.read()!=-1) {
//		System.out.print((char)fileReader.read());
//	}
	while(fis.read()!=-1) {
		System.out.print((char)fis.read());
	}
}
}
