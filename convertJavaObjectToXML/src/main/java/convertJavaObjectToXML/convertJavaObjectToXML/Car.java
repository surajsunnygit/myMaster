package convertJavaObjectToXML.convertJavaObjectToXML;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "car")
@XmlAccessorType(XmlAccessType.FIELD)
public class Car {

	
	private String carBrand;
	private String carColor;
	
	public Car() {
		super();
	}
	public Car(String carBrand, String carColor) {
		super();
		this.carBrand = carBrand;
		this.carColor = carColor;
	}
	public String getCarBrand() {
		return carBrand;
	}
	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	@Override
	public String toString() {
		return "Car [carBrand=" + carBrand + ", carColor=" + carColor + "]";
	}
	
	
	
}
