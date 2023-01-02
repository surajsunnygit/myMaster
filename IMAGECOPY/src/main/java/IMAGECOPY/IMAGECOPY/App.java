package IMAGECOPY.IMAGECOPY;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	FileInputStream fis = new FileInputStream("C:\\Users\\SURAJ\\Pictures\\edit.jpg");
    	FileOutputStream fos = new FileOutputStream("C:\\Users\\SURAJ\\Desktop\\CHECKIMAGE\\edit.jpg");
    	IOUtils.copy(fis, fos);
    	System.out.println("done");
}
}
