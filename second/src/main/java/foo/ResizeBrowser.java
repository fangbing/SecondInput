package foo;

import java.io.File;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class ResizeBrowser {
	
	public void resizeB() throws InterruptedException{
		File pathToBinary=new File("D:\\Program Files\\firefox.exe");
		FirefoxBinary ffBinary=new FirefoxBinary(pathToBinary);
		FirefoxProfile firefoxProfile=new FirefoxProfile();
		FirefoxDriver dr=new FirefoxDriver(ffBinary,firefoxProfile);
		Thread.sleep(2000);
		
		System.out.println("Resize the browser");
		dr.manage().window().setSize(new Dimension(600,400));
		Thread.sleep(2000);
		
		System.out.println("exit the browser");
		dr.quit();
		
		
	}
	
	

}
