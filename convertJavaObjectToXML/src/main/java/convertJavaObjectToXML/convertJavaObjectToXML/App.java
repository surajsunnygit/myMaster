package convertJavaObjectToXML.convertJavaObjectToXML;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Car car = new Car("audi","black");
        
        System.out.println(car);
        
        try {
			JAXBContext context = JAXBContext.newInstance(Car.class);
		    Marshaller marshaller = context.createMarshaller();
		    File file = new File("C:\\Users\\Admin\\Desktop\\output.xml");
		    FileOutputStream out = new FileOutputStream(file);
		    marshaller.marshal(car,out);
			System.out.println( "done");
			
        } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
        
    }
}
