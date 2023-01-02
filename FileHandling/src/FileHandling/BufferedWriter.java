package FileHandling;

import java.io.*;

public class BufferedWriter {
public static void main(String[] args) throws IOException {
	File file = new File("C:\\Users\\Admin\\Desktop\\def.txt");
	java.io.FileWriter fileWriter = new java.io.FileWriter(file);
	java.io.BufferedWriter bw = new java.io.BufferedWriter(fileWriter);
	bw.newLine();
	bw.write("IAM JAVA DEVELOPER");
	bw.newLine();
	bw.append("SURAJ IS A JAVA DEVELOPER");
	
	System.out.println("writing data to test buffer reader");
	
	bw.append("SURAJ IS A JAVA DEVELOPER");
	bw.newLine();
	bw.append("SURAJ IS A JAVA DEVELOPER");
	bw.newLine();
	bw.append("SURAJ IS A JAVA DEVELOPER");
	bw.newLine();
	bw.append("SURAJ IS A JAVA DEVELOPER");
	
	
	bw.close();
	System.out.println("done");
	
}
}
