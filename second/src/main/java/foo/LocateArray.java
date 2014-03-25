package foo;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class LocateArray {
	public void lodateArray() throws InterruptedException{
		File pathToBinary=new File("D:\\Program Files\\firefox.exe");
		FirefoxBinary ffBinary=new FirefoxBinary(pathToBinary);
		FirefoxProfile firefoxProfile=new FirefoxProfile();
		FirefoxDriver dr=new FirefoxDriver(ffBinary,firefoxProfile);
		Thread.sleep(2000);
		
		File file=new File("src/main/java/foo/checkbox.html");
		String filePath="file:///"+file.getAbsolutePath();
		System.out.printf("now access %s \n",filePath);
		
		dr.get(filePath);
		Thread.sleep(1000);
		
		//chose all checkbox and check on
		List<WebElement> checkboxes=dr.findElements(By.cssSelector("input[type=checkbox]"));
		for(WebElement checkbox:checkboxes){
			checkbox.click();
		}
		dr.navigate().refresh();
		Thread.sleep(1000);
		
		//print the current page of how many of the checkbox
		System.out.printf("%d\n",checkboxes.size());
		Thread.sleep(1000);
		
		//select all input ,and filter checkbox and check on
		List<WebElement> inputs=dr.findElements(By.tagName("input"));
		for(WebElement input:inputs){
			if(input.getAttribute("type").equals("checkbox")){
				input.click();
			}
		}
		dr.navigate().refresh();
			
		//check on the last checkbox of this page
		List<WebElement> allCheckboxes=dr.findElements(By.cssSelector("input[type=checkbox]"));
		allCheckboxes.get(allCheckboxes.size()-1).click();
		
		Thread.sleep(1000);
		System.out.println("browser will beclose");
		dr.quit();
	}

}
