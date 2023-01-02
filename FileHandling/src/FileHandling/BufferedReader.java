package FileHandling;

import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedReader {
	public static void main(String[] args) throws IOException {
		java.io.FileReader reader = new java.io.FileReader("C:\\Users\\Admin\\Desktop\\def.txt");
		java.io.BufferedReader bufferReader = new java.io.BufferedReader(reader);
		while(bufferReader.readLine()!=null) {
			System.out.println(bufferReader.readLine());
		}
	}
}
