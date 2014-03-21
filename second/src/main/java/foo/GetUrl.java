package foo;

import java.io.File;

import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetUrl {
	public void getUrl() throws InterruptedException{
		File pathToBinary=new File("D:\\Program Files\\firefox.exe");
		FirefoxBinary ffBinary=new FirefoxBinary(pathToBinary);
		FirefoxProfile firefoxProfile=new FirefoxProfile();
		FirefoxDriver dr=new FirefoxDriver(ffBinary,firefoxProfile);
		Thread.sleep(2000);
		
		String url="http://google.com";
		System.out.printf("now accesss %s \n",url);
		dr.get(url);
		Thread.sleep(2000);
		
		System.out.println("Browser will be close");
		dr.quit();
		
	}
	
	
 
}
