package foo;

import java.io.File;

import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Maximize {
	public void MaximizeB() throws InterruptedException{
		//File pathToBinary = new File("D:\\Program Files\\firefox.exe");
		  // FirefoxBinary ffBinary=new FirefoxBinary(pathToBinary);
		  // FirefoxProfile firefoxProfile = new FirefoxProfile();
		  // FirefoxDriver dr=new FirefoxDriver(ffBinary,firefoxProfile);
		   
		   File pathToBinary=new File("D:\\program Files\\firefox.exe");
		   FirefoxBinary ffBinary=new FirefoxBinary(pathToBinary);
		   FirefoxProfile firefoxProfile = new FirefoxProfile();
		   FirefoxDriver dr=new FirefoxDriver(ffBinary,firefoxProfile);
		   Thread.sleep(2000);
		   
		   System.out.println("maximize browser");
		   dr.manage().window().maximize();
		   Thread.sleep(2000);
		   
		   System.out.println("browser will be close");
		   dr.quit();
		   
	}

}
