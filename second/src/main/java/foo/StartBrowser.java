package foo;

import java.io.File;


import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;


public class StartBrowser {

	
	public  void StartB() {
		File pathToBinary = new File("D:\\Program Files\\firefox.exe");
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		FirefoxProfile firefoxProfile = new FirefoxProfile();
		FirefoxDriver dr=new FirefoxDriver(ffBinary,firefoxProfile);

	}

}
