package foo;

import java.io.File;

import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class CloseBrowser {
	
	public void closeB(){
		File pathToBinary = new File("D:\\Program Files\\firefox.exe");
		   FirefoxBinary ffBinary=new FirefoxBinary(pathToBinary);
		   FirefoxProfile firefoxProfile = new FirefoxProfile();
		   FirefoxDriver dr=new FirefoxDriver(ffBinary,firefoxProfile);
		   
		   System.out.println("browser will be closed");
		   
		   dr.quit();
		   
		   System.out.println("browser is closed");
		
	}
   
   
   
}
