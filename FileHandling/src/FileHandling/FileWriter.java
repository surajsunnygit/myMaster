package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileWriter {
public static void main(String[] args) throws IOException {
	File file = new File("C:\\Users\\Admin\\Desktop\\abc.txt");
	java.io.FileWriter filewriter = new java.io.FileWriter(file,true);
	CharSequence additionalData = "did something";
	filewriter.append(additionalData);
//	filewriter.write(65);
//	
//	char[] chararray = new char[]{'a','b'}; 
//	filewriter.write(chararray);
//	
//	filewriter.write("hello world how are you");
//	CharSequence additionalData = "doing something";
//	filewriter.append(additionalData );
	filewriter.close();
	System.out.println("done");
}
}
