package FileHandling;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class imageCopy {
public static void main(String[] args) throws IOException {
	FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Pictures\\imagecopytest.png");
	FileOutputStream fos = new FileOutputStream("C:\\Users\\Admin\\Desktop\\imagecopytest.png");
	BufferedOutputStream bos = new BufferedOutputStream(fos);
	DataOutputStream dos = new DataOutputStream(bos);
	while(fis.read()!=-1) {
		dos.write(fis.read());
	}
	System.out.println("done");
}
}
