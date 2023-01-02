package sampleExcelDownload.sampleExcelDownload;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.IOUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        FileInputStream fis = new FileInputStream(new File("C:\\Users\\Admin\\Desktop\\studentdata.xlsx"));
    	System.out.println("enter path to download");
    	Scanner scanner = new Scanner(System.in);
    	String path = scanner.nextLine();
    	FileOutputStream fos = new FileOutputStream(new File(path+"\\studentdata.xlsx"));
    	IOUtils.copy(fis, fos);
    	System.out.println("done");
    }
}
